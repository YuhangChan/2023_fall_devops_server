FROM openjdk:17-slim

COPY build/libs/l23o6-0.0.1-snapshot.jar /

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "l23o6-0.0.1-snapshot.jar"]
