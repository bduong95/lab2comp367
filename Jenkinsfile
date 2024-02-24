pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub repository
                git 'https://github.com/bduong95/COMP367-Lab2.git'
            }
        }
        stage('Build') {
            steps {
                // Run shell commands or other build steps here
                sh 'echo "Build step"'
            }
        }
        // Add more stages as needed
    }
}
