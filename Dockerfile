FROM openjdk:21-buster
WORKDIR /app
COPY target/Flowers-0.0.1-SNAPSHOT.jar /app/Flowers.jar
ENTRYPOINT ["java", "-jar", "Flowers.jar"]