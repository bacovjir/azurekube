FROM java:8-jre

ADD ./target/app-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-Xmx200m", "-jar", "/app/app.jar"]
EXPOSE 8080