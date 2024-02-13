pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                sh '''
                    chmod +x ./pipeline/build/maven.sh
                   ./pipeline/build/maven.sh mvn -B -DskipTests clean package
                '''
            }
            post {
                success {
                    archiveArtifacts artifacts: 'java-app/target/*.jar', fingerprint: true
                }
            }
        }

        stage('Test') {
            steps {
                sh '''
                chmod +x ./pipeline/test/maven.sh
                ./pipeline/test/maven.sh mvn test
                '''
            }
            post {
                success {
                    archiveArtifacts artifacts: 'java-app/target/surefire-reports/*.xml', fingerprint: true
                }
            }
        }
    }
}