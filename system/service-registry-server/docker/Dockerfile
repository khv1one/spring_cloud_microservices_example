
FROM openjdk:15-slim
EXPOSE 8761
RUN mkdir /app
COPY system/service-registry-server/build/libs/service-registry-server*.jar /app/app.jar
#RUN chmod 755 /app/app.sh
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]