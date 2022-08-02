pipeline {
    agent any

    triggers {
        pollSCM '*/30 * * * *'
    }
    stages {
        stage('MAVEN_BUILD') {
            steps {
                sh 'cd ./jenkins-demo & mvn clean install & cd ..'
            }
        }
        stage('COPY_ARTIFACT') {
            steps {
                sh 'mv ./jenkins-demo/target/jenkins-demo-0.0.1-SNAPSHOT.jar ~/app.jar'
            }
        }
    }
}
