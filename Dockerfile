FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY . .
RUN ./gradlew build
CMD ["java", "-jar", "build/libs/riskassessmenttool-*.jar"]  # Wildcard for version
