
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Check Java and Maven') {
            steps {
                bat 'java -version'
                bat 'git --version'
                bat 'if exist mvnw.cmd (echo Maven Wrapper found) else (echo Maven Wrapper not found)'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'if exist mvnw.cmd (call mvnw.cmd -B clean verify) else (mvn -B clean verify)'
            }
        }
    }

    post {
        success {
            echo 'Cafe Tracker CI pipeline completed successfully.'
        }
        failure {
            echo 'Cafe Tracker CI pipeline failed. Check the console output.'
        }
    }
}
