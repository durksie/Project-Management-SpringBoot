# Spring Boot Project Management Backend (CRUD) with PostgreSQL (Java 25)
This is a Spring Boot REST API application that manages projects using full CRUD (Create, Read, Update, Delete) operations. It uses PostgreSQL as the database and Spring Data JPA for data persistence.

This backend can be integrated with web or mobile frontends.

# This guide will help you run this Spring Boot backend application that manages Projects with full CRUD (Create, Read, Update, Delete) functionality using PostgreSQL and Java 25.

## Step 1: Prerequisites

* Make sure you have installed:

* Java 25 (JDK)

* Maven

* PostgreSQL

* IntelliJ IDEA

* Postman (for testing APIs)

## Dependencies check list:

✔ Spring Web✔ Spring Data JPA✔ PostgreSQL Driver✔ Lombok (optional)

## Step 2: Create PostgreSQL Database

* Login to Postgres: psql -U postgres
* Create DB:CREATE DATABASE project_db;
## Step 3: Configure application.properties

* Path:src/main/resources/application.properties

Add

* spring.datasource.url=jdbc:postgresql://localhost:5432/project_db
* spring.datasource.username=postgres
* spring.datasource.password=yourpassword
  
* spring.jpa.hibernate.ddl-auto=update
* spring.jpa.show-sql=true
* spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
* server.error.include-message=always
