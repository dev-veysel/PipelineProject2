pipeline {
    agent any

    stages {
        stage('Git-Checkout') {
            steps {
                echo Cheing Github Repository...
            }
        }

        stage('Build') {
            steps {
                echo Building the application...
            }
        }

        stage('Unit_Tests') {
            steps {
                echo Testing the application...
            }
        }

        stage('Deployment') {
            steps {
                echo Deploying the application...
            }
        }
    }

    }
}
