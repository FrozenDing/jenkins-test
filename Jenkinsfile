pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '0a780a78-1da1-4589-9f3b-f87566f741cd', url: 'https://gitee.com/dingrui665/jenkins-test.git']]])
            }
        }
        stage('build') {
            steps {
               bat 'mvn clean install'
            }
        }
    }
}