import org.istad.Frontend
import org.istad.Backend
import org.istad.Database

def call(Map projectType) {
    try {
        if (projectType['frontend']) {
            Frontend.runTests()
        }
        if (projectType.backend) {
            Backend.runTests(projectType.backend)
        }
        if (projectType.database) {
            Database.runTests()
        }
    } catch (Exception e) {
        echo "Error running tests: ${e.message}"
        currentBuild.result = 'FAILURE'
    }
}