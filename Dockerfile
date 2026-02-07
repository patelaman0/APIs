FROM openjdk:22-jdk
COPY target/BuddyScan-0.0.1-SNAPSHOT.jar BuddyScan-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/BuddyScan-0.0.1-SNAPSHOT.jar"]