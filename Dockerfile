# Use OpenJDK base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy code
COPY . .

# Build the application
RUN ./mvnw package -DskipTests

# Run the app
CMD ["java", "-jar", "target/springboot-pro-0.0.1-SNAPSHOT.jar"]
