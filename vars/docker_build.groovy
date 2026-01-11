def call(Map config = [:]) {
    echo ">>> USING MAP-BASED docker_build FROM SHARED LIBRARY <<<"
    def imageName = config.imageName ?: error("Image name is required")
    def imageTag = config.imageTag ?: 'latest'
    def dockerfile = config.dockerfile ?: 'Dockerfile'
    def context = config.context ?: '.'
    
    echo "Building Docker image: ${imageName}:${imageTag} using ${dockerfile}"
    
    sh """
        docker build -t ${imageName}:${imageTag} -t ${imageName}:latest -f ${dockerfile} ${context}
    """
}
