#!/bin/sh

while ! nc -z config-server 8888 ; do
    echo "Waiting for upcoming Config Server"
    sleep 2
done

java -jar /app/service-registry-server.jar