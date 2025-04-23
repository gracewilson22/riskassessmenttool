FROM gradle:7.4-jdk17 AS build
WORKDIR /home/gradle/project
COPY . /home/gradle/project
RUN gradle bootJar

FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY --from=build /home/gradle/project/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
