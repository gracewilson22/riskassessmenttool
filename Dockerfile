FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY . .
RUN ./gradlew bootJar
CMD ["java", "-jar", "/app/build/libs/riskassessmenttool.jar"]  # Absolute path

HEALTHCHECK --interval=30s --timeout=3s \
  CMD wget --no-verbose --spider http://localhost:${PORT}/actuator/health || exit 1
\
