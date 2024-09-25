package org.istad

class Backend {
    static def runTests(String buildTool) {
        println "Running backend tests..."
        switch(buildTool) {
            case 'maven':
                sh "mvn test"
                break
            case 'gradle':
                sh "./gradlew test"
                break
            case 'fastapi':
                sh """
                    pip install -r requirements.txt
                    pytest
                """
                break
            default:
                error "Unsupported build tool: ${buildTool}"
        }
    }

    static def build(String buildTool) {
        println "Building backend..."
        switch(buildTool) {
            case 'maven':
                sh "mvn package"
                break
            case 'gradle':
                sh "./gradlew build"
                break
            case 'fastapi':
                sh """
                    pip install -r requirements.txt
                    pip install uvicorn
                    # FastAPI doesn't need a build step, but we can create a requirements.txt
                    pip freeze > requirements.txt
                """
                break
            default:
                error "Unsupported build tool: ${buildTool}"
        }
    }
}