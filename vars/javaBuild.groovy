def buildingJava(String path) {
    echo "Building"
    bat "mvn -f ${path} clean package"
}