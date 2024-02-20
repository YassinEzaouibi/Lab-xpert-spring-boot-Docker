FROM openjdk:17-jdk
WORKDIR /app
COPY target/labxpert-0.0.1-SNAPSHOT.jar /app/labxpert-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "labxpert-0.0.1-SNAPSHOT.jar"]