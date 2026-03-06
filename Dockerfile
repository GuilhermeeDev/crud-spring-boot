# ---------- BUILD ----------
FROM maven:3-eclipse-temurin-21-alpine AS build

WORKDIR /app

# Copia primeiro o pom para aproveitar cache do docker
COPY pom.xml .

# Baixa dependencias
RUN mvn -B -q -e -C dependency:go-offline

# Copia codigo fonte
COPY src ./src

# Build da aplicação
RUN mvn clean package -DskipTests

# ---------- EXECUÇÃO ----------
FROM eclipse-temurin:21-jre-ubi10-minimal

WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "app.jar" ]