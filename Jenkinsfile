pipeline {
    agent any

    triggers {
        pollSCM '*/30 * * * *'
    }
    stages {
        stage('MAVEN_BUILD') {
            steps {
                sh './jenkins-demo/mvnw clean install'
            }
        }
    }
}
