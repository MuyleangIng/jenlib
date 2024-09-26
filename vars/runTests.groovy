import org.istad.Frontend
import org.istad.Backend
import org.istad.Database

def call(Map projectType) {
    if (projectType.frontend) {
        Frontend.runTests(this)
    }
    if (projectType.backend) {
        Backend.runTests(projectType.backend,this)
    }
    if (projectType.database) {
        Database.runTests()
    }
}