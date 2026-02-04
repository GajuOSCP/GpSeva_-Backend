# Use official Java 17 image
FROM eclipse-temurin:17-jdk

# Create app directory
WORKDIR /app

# Copy Maven build file
COPY pom.xml .

# Copy source code
COPY src ./src

# Build the application
RUN ./mvnw package -DskipTests || mvn package -DskipTests

# Expose Spring Boot port
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "target/*.jar"]
