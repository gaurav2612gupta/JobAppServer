FROM openjdk:24-slim-bullseye
ADD target/job-app-server.jar job-app-server.jar
ENTRYPOINT ["java", "-jar", "/job-app-server.jar"]