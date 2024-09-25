def call(projectType) {
    if (projectType == 'frontend') {
        println "Running frontend tests..."
        sh """
            npm install
            npm run test
        """
    } else if (projectType == 'backend') {
        println "Running backend tests..."
        sh """
            mvn test
        """
    } else if (projectType == 'database') {
        println "Running database tests..."
        sh """
            psql -f run_database_tests.sql
        """
    }
}
