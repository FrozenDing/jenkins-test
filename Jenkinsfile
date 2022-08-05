pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '54de51f5-7715-4d57-8997-27cd451987c2', url: 'https://github.com/FrozenDing/jenkins-test.git']]])
            }
        }
        stage('build') {
            steps {
               sh 'mvn clean install'
            }
        }
    }
}