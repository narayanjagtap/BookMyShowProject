# Book My Show — Movie Ticket Booking REST API

> **Book My Show** is a Spring Boot backend RESTful API that implements the core workflow for online movie ticket booking: browse movies, view theaters and shows, check seat availability, book seats and manage payments.

---

# Project Overview

Book My Show is a backend application that provides REST APIs for a movie ticket booking system. It focuses on the server-side responsibilities:

* User management (register, update, delete)
* Theater & movie catalog management
* Show/screen scheduling and seat map management
* Booking flow (seat selection, booking creation, cancellation)
* Payment recording and transaction tracking

The project is built using Spring Boot and follows a layered architecture (Controller → Service → Repository) with DTOs used for API communication.

---

# Technology Stack

**Language & Frameworks**

* Java 17+
* Spring Boot 3.x (Spring Web, Spring Data JPA)
* Hibernate (JPA implementation)
* Jakarta Validation (bean validation)
* Lombok

**Build & Tools**

* Maven
* MySQL 8.x
* JDBC

**Other**

* Custom exception handling (GlobalExceptionHandler)
* DTO pattern and simple Factory/Mapper utilities

---

# Key Features

* **User Management**: registration (password encrypted), profile read/update/delete.
* **Theater Management**: create/list/search/update/delete theaters.
* **Movie Management**: create/list/search/update movies (genre, language, title).
* **Show Management**: create shows linked to screens and movies, view showtimes, check seat availability.
* **Booking System**: multi-seat selection, seat validation, unique booking numbers, booking history, cancel bookings.
* **Payment Integration**: create payment records, support for multiple payment methods, transaction status tracking.

---

# Architecture

The project follows a layered architecture:

```
# Controller Layer  -> handles HTTP requests and responses (REST API)
# Service Layer     -> business logic, validations, transactions
# Repository Layer  -> JPA repositories & database operations
# Model/Entity      -> JPA entities mapped to DB tables
# DTOs & Mappers    -> API payloads and conversions
```

Each controller exposes endpoints under `/api/v1/` (sample) and delegates to services which call repositories inside transactions.

---
