# Denomination Calculator (Spring Boot + Angular)

A full-stack web application that calculates the breakdown of a given Euro amount into denominations (e.g., €100, €50, €20, €2, €0.50, etc.).

This app consists of a **Spring Boot backend** that performs the denomination logic and an **Angular frontend** that provides a user-friendly UI to interact with the API.

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

- Exposes a REST API to calculate denomination breakdown
- Accepts decimal Euro amounts (e.g., `234.34`)
- Returns optimal breakdown using standard Euro notes and coins
- Clean architecture: Controller → Service → Model

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

- Simple UI to input Euro amounts
- Displays denomination breakdown in real time
- Integrates seamlessly with backend REST API

### Run Backend

```bash
cd frontend
npm install
ng serve
```

## Author

**Muhammad Umar**

---
