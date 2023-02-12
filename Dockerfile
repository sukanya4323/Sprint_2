#base image is jre
FROM adoptopenjdk:16.0.1_9-jre-hotspot-focal
#copy the jar to root directory of image and renamed to jar to app.jar
COPY target/OnlineAyurvedaMedicine-0.0.1-SNAPSHOT.jar/app.jar
#command that will be executed when container will run
CMD java -jar/app.jar
