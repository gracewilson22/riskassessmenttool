FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY . .
RUN ./gradlew bootJar
EXPOSE 8080
CMD ["java", "-jar", "/app/build/libs/riskassessmenttool.jar"]
