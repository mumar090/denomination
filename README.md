# Denomination Calculator (Spring Boot + Angular)

A full-stack web application that calculates the breakdown of a given Euro amount into denominations (e.g., €100, €50, €20, etc.).

---

## Project Structure

denomination-app/
├── backend/ ← Spring Boot (Java)
├── frontend/ ← Angular (TypeScript)
└── README.md

---

## Backend (Spring Boot)

### Features

- Exposes a REST API to calculate currency denomination
- Accepts a Euro amount and returns a breakdown of notes/coins

### Tech Stack

- Java 11+
- Spring Boot
- Maven

### How to Run (Backend)

```bash
cd backend
mvn clean install
mvn spring-boot:run
```

## Testing

```bash
cd backend
mvn test
```
