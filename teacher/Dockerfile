FROM maven:3.9.9-amazoncorretto-17 As build
WORKDIR /app
COPY  src ./src
COPY target/*jar app.jar
RUN mvn -DskipTests package

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY  --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

