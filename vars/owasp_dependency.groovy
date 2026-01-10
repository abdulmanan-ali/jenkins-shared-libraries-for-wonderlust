def call() {
    echo "Running OWASP Dependency Check..."

    // Tool name MUST match Jenkins → Manage Jenkins → Tools
    def dcHome = tool 'OWASP'

    sh """
        ${dcHome}/bin/dependency-check.sh \
        --project "Wanderlust" \
        --scan . \
        --format XML \
        --out . \
        --disableNodeAudit \
        --disableOSSIndex
    """
}
