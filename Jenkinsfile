pipeline {

    agent any

    environment {

        IMAGE_NAME = "javaapp"

    }

    stages {

        stage('Clone') {

            steps {

                git branch : 'main,
                url 'https://github.com/Likhith-25/javaapp.git'

            }

        }

        stage('Build') {

            steps {

                sh 'mvn clean package'

            }

        }

        stage('Build Docker Image') {

            steps {

                sh 'docker build -t javaapp .'

            }

        }

        stage('Deploy to Docker Swarm') {

            steps {

                sh '''
                docker service rm javaapp || true

                docker service create \
                --name javaapp \
                -p 8080:8080 \
                javaapp
                '''
            }

        }

    }
}
