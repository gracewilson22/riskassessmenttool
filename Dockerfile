FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY . .
RUN ./gradlew bootJar
CMD ["java", "-jar", "/app/build/libs/riskassessmenttool.jar"]  # Absolute path
