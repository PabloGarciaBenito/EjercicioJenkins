#!/bin/bash

echo "***************************"
echo "** Testing the code ***********"
echo "***************************"

WORKSPACE=/home/jenkins/jenkins/jenkins_home/workspace/Ejercicio/
docker run --rm -v $WORKSPACE/java-app:/app -v /var/jenkins_home/.m2:/root/.m2 -w /app maven:3-alpine "$@"