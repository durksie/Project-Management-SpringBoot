Spring Boot Project Management Backend (CRUD) with PostgreSQL (Java 25)

[[Employee Manager is a Spring Boot REST API application that manages employees using full CRUD (Create, Read, Update, Delete) operations. It uses MySQL as the database and Spring Data JPA for data persistence.

This backend can be integrated with web or mobile frontends.]]

This guide will help you build a Spring Boot backend application that manages Projects with full CRUD (Create, Read, Update, Delete) functionality using PostgreSQL and Java 25.

✅ Step 1: Prerequisites

Make sure you have installed:

Java 25 (JDK)

Maven

PostgreSQL

IntelliJ IDEA / VS Code

Postman (for testing APIs)

Check versions:
java --version
mvn --version
psql --version

Step 2: Create Spring Boot Project

Go to: https://start.spring.io

Select:

Project: Maven

Language: Java

Spring Boot: Latest

Java: 25

Group: com.example

Artifact: projectmanager

Name: projectmanager

Package: com.example.projectmanager

Dependencies:

✔ Spring Web✔ Spring Data JPA✔ PostgreSQL Driver✔ Lombok (optional)

Click Generate and open in IntelliJ.

✅ Step 3: Create PostgreSQL Database

Login to Postgres: psql -U postgres
Create DB:CREATE DATABASE project_db;
✅ Step 4: Configure application.properties

Path:src/main/resources/application.properties

Add
# Server
server.port=8080

# Database
spring.datasource.url=jdbc:postgresql://localhost:5432/project_db
spring.datasource.username=postgres
spring.datasource.password=yourpassword

# JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# Error handling
server.error.include-message=always
