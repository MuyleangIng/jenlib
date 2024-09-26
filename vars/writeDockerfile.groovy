// 
def call(Map projectType) {
    def dockerfileType
    if (projectType.frontend == 'nextjs') {
        dockerfileType = 'next'
    } else if (projectType.frontend == 'react') {
        dockerfileType = 'react'
    } else {
        error "Unsupported frontend type: ${projectType.frontend}"
    }

    def dockerfileContent = libraryResource("${dockerfileType}-dockerfile")
    writeFile file: 'Dockerfile', text: dockerfileContent
    println "Dockerfile for ${dockerfileType} has been written to the project root."
}