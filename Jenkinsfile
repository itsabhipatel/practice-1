pipeline{

    agent any

    tools{

        maven "maven"
    }

    environment{

      VERSION_NAME="1.2"
    }

    stages{

        stage("compile"){

          steps{
              bat 'cd Practice/src'
              bat 'javac Practice.java'
          }
        }

        stage("run"){

            steps{
            bat 'java Practice'
            }
        }
    }

    post{

        always{
            bat "echo 'always'"
        }

        success{
            bat "echo 'success'"
        }

        failure{
            bat "echo 'failure'"
        }
    }
}