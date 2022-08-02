pipeline {
    agent any

    triggers {
        pollSCM '*/30 * * * *'
    }
    stages {
        stage('MAVEN_BUILD') {
            steps {
                sh 'cd jenkins-demo'
                sh 'mvn clean install'
                sh 'cd ..'
            }
        }
        stage('COPY_ARTIFACT') {
            steps {
                sh 'mv ./jenkins-demo/target/jenkins-demo-0.0.1-SNAPSHOT.jar ~/app.jar'
            }
        }
    }
}
