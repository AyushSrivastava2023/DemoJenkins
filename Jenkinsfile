@Library("common-build-lib") _
pipeline {
    agent any

    stages {
       
        stage("build"){
            steps{

                javaBuild("demo/pom.xml")
          
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
