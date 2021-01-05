
FROM openjdk:15-slim
EXPOSE 8080
RUN mkdir /app
COPY system/gateway-service/build/libs/gateway-service*.jar /app/app.jar

ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.7.3/wait /wait
RUN chmod +x /wait

CMD /wait && java -jar /app/app.jar