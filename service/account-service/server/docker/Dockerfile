
FROM openjdk:15-slim
EXPOSE 9001
RUN mkdir /app
COPY service/account-service/server/build/libs/server*.jar /app/app.jar

ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.7.3/wait /wait
RUN chmod +x /wait

CMD /wait && java -jar /app/app.jar