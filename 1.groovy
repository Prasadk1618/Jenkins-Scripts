pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello Prasad'
            }
        }
        stage('Create Folder') {
            steps {
                sh "mkdir -p devops"
            }
        }
        stage('byee') {
            steps {
                echo 'byee Prasad'
            }
        }
    }
}
