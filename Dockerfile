FROM openjdk:11-jdk-alpine

ADD target/OnlineAyurvedaMedicine-0.0.1-SNAPSHOT.jar OnlineAyurvedaMedicine-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar","OnlineAyurvedaMedicine-0.0.1-SNAPSHOT.jar"]