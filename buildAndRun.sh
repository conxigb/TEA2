#!/bin/sh
mvn clean package && docker build -t com.mycompany/springapp .
docker rm -f springapp || true && docker run -d -p 9080:9080 -p 9443:9443 --name springapp com.mycompany/springapp