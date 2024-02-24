pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Clean and package the Maven project
                sh 'mvn clean package'
            }
        }
    }
}
