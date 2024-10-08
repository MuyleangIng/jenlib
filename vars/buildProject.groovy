import org.istad.Frontend
import org.istad.Backend
import org.istad.Database

def call(Map projectType) {
    if (projectType.frontend) {
        Frontend.build(this)
    }
    if (projectType.backend) {
        Backend.build(projectType.backend, this)
    }
    if (projectType.database) {
        Database.migrate(this)
    }
}