# Use the official OpenJDK base image with JDK 21
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/walkingskeleton1Email-0.0.1-SNAPSHOT.jar /app/walkingskeleton1Email.jar

# Expose the port the application runs on
EXPOSE 8081

# Specify the command to run the application
CMD ["java", "-jar", "walkingskeleton1Email.jar"]