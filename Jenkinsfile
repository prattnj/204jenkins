pipeline {
    agent any

    tools {
        maven 'apache maven 3.6.3'
        jdk 'JDK 11'
    }
    
    stages {
        stage ('clean') {
            steps {
                sh 'mvn Clean'
            }
        }
        stage ('Build') {
            steps {
                sh 'mvn Compile'
            }
        }
        stage ('Short Tests') {
            steps {
                sh 'mvn -Dtest=CalculatorTest test'
            }
        }
        stage ('Long Tests') {
            steps {
                sh 'mvn -Dtest=CalulatorTestThourough test'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
        stage ('Package') {
            steps {
                sh 'mvn package'
                archiveArtifacts artifacts: 'src/**/*.java'
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }
    }
}
