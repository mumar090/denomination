# Denomination Calculator (Spring Boot + Angular)

A full-stack web application that calculates the breakdown of a given Euro amount into denominations (e.g., €100, €50, €20, etc.).

---

## Project Structure

denomination/
├── backend/ # Spring Boot backend
│ ├── pom.xml
│ └── src/
│ └── main/
│ ├── java/com/dedalus/denomination/
│ │ ├── controller/
│ │ │ └── DenominationController.java
│ │ ├── model/
│ │ │ ├── DenominationRequest.java
│ │ │ └── DenominationResponse.java
│ │ ├── service/
│ │ │ └── DenominationService.java
│ │ └── DenominationApplication.java
│ └── resources/
│ └── application.properties
├── frontend/ # Angular frontend
│ ├── angular.json
│ ├── package.json
│ └── src/
│ ├── app/
│ │ ├── denomination/
│ │ │ ├── denomination.component.ts
│ │ │ ├── denomination.component.html
│ │ │ └── denomination.component.css
│ │ ├── services/
│ │ │ └── denomination.service.ts
│ │ ├── app.module.ts
│ │ └── app.component.ts / .html
│ └── index.html
└── README.md

---

## Backend - Spring Boot

### Features

- Exposes a REST API to calculate Euro denomination
- Accepts decimal amounts (e.g., `234.34`) and returns optimal breakdown into notes and coins
- Clean separation of concerns using Controller-Service-Model structure

### Tech Stack

- Java 11+
- Spring Boot
- Maven

### Run Backend

```bash
cd backend
mvn clean install
mvn spring-boot:run
```

## Run Backend Tests

```bash
cd backend
mvn test
```

---

## Backend - Spring Boot

### Features

- Intuitive form to input an amount in Euros
- Displays the breakdown into denominations in a structured format
- Communicates with the backend via REST API

### Run Backend

```bash
cd frontend
npm install
ng serve
```

## Author

**Muhammad Umar**

---
