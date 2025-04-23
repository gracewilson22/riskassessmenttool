# Use Gradle image to build the app
FROM gradle:7.4-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/project
WORKDIR /home/gradle/project
RUN gradle build --no-daemon

# Use a smaller image to run the app
FROM eclipse-temurin:17-jdk-jammy
COPY --from=build /home/gradle/project/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
