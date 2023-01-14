FROM openjdk:18-jdk-alpine3.15
COPY target/My-first-springboot-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar"]

