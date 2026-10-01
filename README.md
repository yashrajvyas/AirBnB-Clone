#  Airbnb Clone Backend

<p>
  A production-inspired hotel booking backend built with Spring Boot, designed around clean architecture, secure APIs, inventory-based availability, and a complete booking workflow.
</p>

<p>
  <img src="https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk" />
  <img src="https://img.shields.io/badge/Spring%20Boot-Backend-brightgreen?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge&logo=postgresql" />
  <img src="https://img.shields.io/badge/Spring%20Security-JWT-success?style=for-the-badge&logo=springsecurity" />
  <img src="https://img.shields.io/badge/Stripe-Payments-635BFF?style=for-the-badge&logo=stripe" />
</p>

---

##  Overview

This project is a scalable backend system for an Airbnb-like hotel booking platform. It provides REST APIs for hotel management, room inventory, bookings, guest handling, payments, authentication, and role-based authorization.

The application follows a layered MVC architecture and uses inventory records per room and date to manage availability and help prevent overbooking.

---

##  Features

###  Authentication & Authorization

* JWT-based authentication
* Secure password handling with Spring Security
* Role-based access control
* Protected APIs for hotel managers and users

###  Hotel Management

* Create, update, and manage hotels
* Store hotel amenities, photos, contact information, and location details
* Activate or deactivate hotels
* Hotel ownership and manager-level access control

###  Room Management

* Add and manage multiple room types for a hotel
* Configure room capacity, amenities, pricing, and photos
* Maintain total room count and room-specific details

###  Inventory & Availability Management

* Date-wise inventory tracking for each room
* Track total rooms, booked rooms, and available rooms
* Availability validation during booking
* Designed to prevent overbooking

###  Booking Management

* Create booking sessions
* Add guest details to a booking
* Check-in and check-out date handling
* Booking status management
* Support for multiple guests in a single booking

### Payment Integration

* Stripe payment gateway integration
* Payment session creation
* Webhook handling for payment updates
* Track payment status and transaction details

###  Search & Filtering

* Search hotels by city, dates, guest capacity, and availability
* Filter rooms based on booking requirements
* Pagination and sorting support

###  API Architecture

* DTO-based request and response handling
* Global exception handling
* Consistent API response structure
* Validation for request payloads
* Clean separation between controller, service, and repository layers

---

##  Architecture

```text
Client / Postman
       │
       ▼
Controller Layer
       │
       ▼
Service Layer
       │
       ▼
Repository Layer
       │
       ▼
PostgreSQL Database
```

The project follows a layered architecture:

* **Controller Layer** — Handles HTTP requests and API responses
* **Service Layer** — Contains business logic
* **Repository Layer** — Communicates with the database using Spring Data JPA
* **DTO Layer** — Prevents direct entity exposure through APIs
* **Security Layer** — Handles JWT authentication and authorization
* **Exception Layer** — Provides centralized error handling

---

##  Core Entities

| Entity       | Description                                             |
| ------------ | ------------------------------------------------------- |
| User         | Stores user credentials and roles                       |
| Hotel        | Stores hotel details and ownership information          |
| Room         | Represents room types, pricing, capacity, and amenities |
| Inventory    | Tracks room availability for each date                  |
| Booking      | Stores booking details and status                       |
| Guest        | Stores guest information                                |
| BookingGuest | Maps guests to bookings                                 |
| Payment      | Stores payment and transaction information              |
| ContactInfo  | Stores hotel contact details                            |

---

##  Entity Relationships

```text
User ────< Hotel
User ────< Booking

Hotel ────< Room
Room ────< Inventory

Booking ────< BookingGuest >──── Guest
Booking ────< Payment
```

---

##  Tech Stack

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate
* PostgreSQL
* Spring Security
* JWT Authentication
* Stripe Payment Gateway
* Maven
* Lombok
* ModelMapper
* Swagger / OpenAPI
* Postman

---

##  Getting Started

### Prerequisites

Make sure you have the following installed:

* Java 17 or above
* Maven
* PostgreSQL
* Git
* IntelliJ IDEA or any Java IDE

### Clone the Repository

```bash
git clone https://github.com/yashrajvyas/AirBnB-Clone.git
cd AirBnB-Clone/AirBnB-App
```

### Configure Database

Create a PostgreSQL database:

```sql
CREATE DATABASE airbnb_clone;
```

Update your `application.properties` or `application.yml` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/airbnb_clone
spring.datasource.username=your_postgres_username
spring.datasource.password=your_postgres_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Configure Environment Variables

Set the following environment variables before running the application:

```properties
DB_PASSWORD=your_postgresql_password
JWT_SECRET_KEY=your_jwt_secret_key
STRIPE_SECRET_KEY=your_stripe_secret_key
STRIPE_WEBHOOK_SECRET=your_stripe_webhook_secret

### Run the Application

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

##  API Documentation

Swagger UI is available after running the application:

```text
http://localhost:8080/swagger-ui/index.html
```

---

##  Sample Authorization Header

For protected endpoints, send the JWT token in the request header:

```http
Authorization: Bearer <your_jwt_token>
```

---

##  Future Improvements

* Redis caching for faster hotel search
* Rate limiting for public APIs
* Email notifications for booking confirmation
* Image upload integration using cloud storage
* Docker containerization
* CI/CD pipeline using GitHub Actions
* Microservices-based architecture for large-scale deployment

---

##  Author

**Yashraj Vyas**

* GitHub: https://github.com/yashrajvyas
* LinkedIn: https://www.linkedin.com/in/yashraj-vyas-819b46320

---

##  Support

If you found this project useful, consider giving it a star on GitHub.
