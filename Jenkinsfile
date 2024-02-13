pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                sh '''
                    chmod +x ./jenkins/build/maven.sh
                    chmod +x ./jenkins/build/build.sh
                   ./jenkins/build/maven.sh mvn -B -DskipTests clean package
                   ./jenkins/build/build.sh
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
                chmod +x ./jenkins/test/maven.sh
                ./jenkins/test/maven.sh mvn test
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