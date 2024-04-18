
FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /app/spring-book-server

COPY spring-book-server/pom.xml .

RUN mvn dependency:go-offline

COPY spring-book-server/src ./src

RUN mvn package

FROM openjdk:17-jdk-slim

WORKDIR /app/spring-book-server

COPY --from=build /app/spring-book-server/target/spring-book-server-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "spring-book-server-0.0.1-SNAPSHOT.jar"]

