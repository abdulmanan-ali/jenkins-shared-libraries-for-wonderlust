def call(String sonarTool, String projectKey, String projectName) {
    echo "Running SonarQube Code Analysis..."

    def scannerHome = tool Sonar

    withSonarQubeEnv(sonarTool) {
        sh """
            ${scannerHome}/bin/sonar-scanner \
            -Dsonar.projectKey=${projectKey} \
            -Dsonar.projectName=${projectName} \
            -Dsonar.sources=.
        """
    }
}
