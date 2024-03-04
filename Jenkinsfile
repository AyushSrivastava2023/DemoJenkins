pipeline {
    agent any

    stages {
       
        stage("build"){
            steps{
                echo "Building"
                bat "mvn -f demo/pom.xml clean package"
            }
        }
        stage("accessingEnv"){
            steps{
                script {
                    def buildNumber = currentBuild.number
                    echo "Build Number: ${buildNumber}"

                    def workspace = env.WORKSPACE
                    echo "Workspace: ${workspace}"

                }
            }
        }
        
        
        
    }
    
    post {
        success {
            echo "Build succeeded!"
            archiveArtifacts artifacts: 'demo/target/*.jar', fingerprint: true
        }
        failure {
            echo "Build failed"
        }
        always {
            echo "Pipeline completed"
        }
    }
}
