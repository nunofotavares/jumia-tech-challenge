# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# copy Jar into image
COPY target/phone-numbers-0.0.1-SNAPSHOT.jar /app.jar
COPY sample.db /sample.db
# run application with this command line 
CMD ["/usr/bin/java", "-jar", "/app.jar"]
