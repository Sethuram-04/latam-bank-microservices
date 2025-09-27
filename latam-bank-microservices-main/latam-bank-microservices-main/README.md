Latam Bank Microservices (Minimal)
Modules:
- customer-service (8081)
- account-service (8082)
- transfer-service (8083)
- deposit-service (8084)
- forex-service (8085)
- loi-service (8086)
- payments-service (8087)

Each module is a Spring Boot application using H2 in-memory DB. Build with Maven:
  mvn -T 1C clean install

Run a single module:
  mvn -pl customer-service spring-boot:run

Or run from your IDE (import parent pom as Maven project).

APIs follow the spec in the project description (CRUD endpoints).
