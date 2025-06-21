FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy everything into the image
COPY . .

# Make mvnw executable and build the JAR
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Run the jar file (auto-detects .jar in /target)
CMD ["sh", "-c", "java -jar target/*.jar"]
