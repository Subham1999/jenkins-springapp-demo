pipeline {
    agent any

    triggers {
        pollSCM '*/30 * * * *'
    }
    stages {
        stage('FILE_PERMISSION') {
            steps {
                sh 'sudo chmod u+x ./.'
            }
        }
        stage('MAVEN_BUILD') {
            steps {
                sh './jenkins-demo/mvnw clean install'
            }
        }
    }
}
