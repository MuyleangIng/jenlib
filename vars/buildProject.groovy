import org.istad.Frontend
import org.istad.Backend
import org.istad.Database

def call(Map projectType) {
    if (projectType.frontend) {
        Frontend.build()
    }
    if (projectType.backend) {
        Backend.build(projectType.backend)
    }
    if (projectType.database) {
        Database.migrate()
    }
}