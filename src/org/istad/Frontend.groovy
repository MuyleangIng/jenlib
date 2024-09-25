package org.istad

class Frontend {
    static def runTests() {
        println "Running frontend tests..."
        sh """
            npm install
            npm run test
        """
    }

    static def build() {
        println "Building frontend..."
        sh """
            npm install
            npm run build
        """
    }
}