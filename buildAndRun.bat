@echo off
call mvn clean package
call docker build -t com.mycompany/springapp .
call docker rm -f springapp
call docker run -d -p 9080:9080 -p 9443:9443 --name springapp com.mycompany/springapp