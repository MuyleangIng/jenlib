def call(String projectType) {
    def dockerfileContent = libraryResource("${projectType}-dockerfile")
    writeFile file: 'Dockerfile', text: dockerfileContent
    println "Dockerfile for ${projectType} has been written to the project root."
}