pipeline {
    agent any

    triggers {
        pollSCM '*/30 * * * *'
    }
    stages {
        stage('FILE_PERMISSION') {
            steps {
                sh 'sudo chmod a+x ./jenkins-demo/mvnw'
            }
        }
        stage('MAVEN_BUILD') {
            steps {
                sh './jenkins-demo/mvnw clean install'
            }
        }
    }
}
