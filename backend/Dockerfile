FROM eclipse-temurin:21 AS builder

# build
WORKDIR /app
COPY . .
RUN ./gradlew bootJar --no-daemon

# run
FROM eclipse-temurin:21-alpine AS runner
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
