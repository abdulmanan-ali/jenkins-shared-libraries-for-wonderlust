def call() {
    echo "Checking SonarQube Quality Gate..."

    timeout(time: 5, unit: 'MINUTES') {
        waitForQualityGate abortPipeline: true
    }
}
