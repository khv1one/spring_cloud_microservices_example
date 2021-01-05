
FROM openjdk:15-slim
EXPOSE 8888
RUN mkdir /app
COPY system/config-server/build/libs/config-server*.jar /app/app.jar

ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.7.3/wait /wait
RUN chmod +x /wait

#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]
#COPY system/config-server/docker/app.sh /app/app.sh
CMD /wait && java -jar /app/app.jar