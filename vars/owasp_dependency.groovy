def call() {
    echo "Running OWASP Dependency Check..."

    sh '''
        dependency-check.sh \
        --project "Wanderlust" \
        --scan . \
        --format XML \
        --out dependency-check-report
    '''
}
