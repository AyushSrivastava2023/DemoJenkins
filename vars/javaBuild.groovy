
def call(String path) {
    echo "Building"
    bat "mvn -f ${path} clean package"
}