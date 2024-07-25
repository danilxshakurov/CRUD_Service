FROM openjdk:11-jdk-slim
WORKDIR /app
COPY target/crudservice-0.0.1-SNAPSHOT.jar /app/crudservice.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "crudservice.jar"]