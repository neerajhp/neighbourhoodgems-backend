# syntax=docker/dockerfile:1

## Multi Stage Build
## Stage 1: Build the jar

FROM openjdk:11-jdk-slim as BUILD

# Set the current working directory inside the image
WORKDIR /app

# Copy maven wrapper and dependencies
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Run maven wrapper and install dependencies into image
RUN ./mvnw dependency:go-offline -B

# Copy the project source
COPY src ./src

# Package the application
RUN ./mvnw package -DskipTests
# Move to directory and extract dependencies
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

## Stage 2: A minimal docker image with command to run the app 
FROM openjdk:11-jdk-slim

# Directory where jar file is located
ARG DEPENDENCY=/app/target/dependency

# Copy project dependencies from the build stage
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT ["java","-cp","app:app/lib/*","com.app.neighbourhoodgems.NeighbourhoodgemsApplication"]