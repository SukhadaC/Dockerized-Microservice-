# Use OpenJDK 17 base image
FROM openjdk:17

# Copy the JAR built by Maven into the container
COPY target/*.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
