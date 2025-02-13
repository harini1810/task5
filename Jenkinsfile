pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/harini1810/task5.git'
            }
        }
        stage('Compile') {
            steps {
                bat 'javac Timestamp.java'
            }
        }
        stage('Run') {
            steps {
                bat 'java Timestamp'
            }
        }
    }
}
