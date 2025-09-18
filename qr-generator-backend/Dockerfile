# Etapa 1: build
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: run
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY --from=build /app/target/qr-backend-0.0.1-SNAPSHOT.jar app.jar

# Exponer puerto (el que Spring Boot usa por defecto)
EXPOSE 8080

# Ejecutar la app
ENTRYPOINT ["java","-jar","app.jar"]
