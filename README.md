#  Airbnb Clone Backend
![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-Framework-brightgreen)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-ORM-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-orange)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![Postman](https://img.shields.io/badge/Postman-API%20Testing-orange)
![JWT](https://img.shields.io/badge/JWT-Auth-yellow)
![Spring Security](https://img.shields.io/badge/Spring%20Security-Security-green)
![Status](https://img.shields.io/badge/Status-In%20Progress-yellow)
![License](https://img.shields.io/badge/License-Free-lightgrey)

🚀 A scalable backend system for a hotel booking platform inspired by Airbnb, built using **Spring Boot** with a focus on **clean architecture, inventory management, and real-world system design**.

---

##  Key Features

###  Hotel Management

* Create, update, and manage hotels
* Manage hotel amenities, photos, and contact details
* Active/inactive hotel status

###  Room Management

* Add different room types with capacity & pricing
* Manage room availability and amenities
* Track total room count

###  Booking System

* Create bookings with check-in & check-out dates
* Support multiple guests per booking
* Booking status management (CONFIRMED, FAILED, etc.)

###  Guest Management

* Add and manage guest details per booking
* Maintain relationship between booking and guests

###  Inventory Management 

* Track room availability per date
* Maintain booked vs total rooms
* Prevent overbooking
* Support dynamic availability logic

###  Payment Integration 

* Handle booking payments
* Track transaction IDs and payment status

###  Search Functionality (In Progress)

* Search hotels by city, date, and availability
* Filter rooms based on occupancy and availability
* Pagination & sorting (planned)

###  Dynamic Pricing Strategy (Planned)

* Adjust pricing based on demand and availability
* Surge pricing support

---

##  System Design Highlights

* Scalable backend architecture inspired by real-world booking systems
* Inventory-based availability tracking (similar to Airbnb/Booking.com)
* Separation of concerns using layered architecture
* Designed to handle concurrent bookings and availability checks

---

##  Architecture

* MVC Architecture
* Layered Design:

  * Controller Layer
  * Service Layer
  * Repository Layer
* DTO-based communication
* Exception Handling (custom exceptions)

---

##  Database Design

### Core Entities:

* **User**
* **Hotel**
* **Room**
* **Booking**
* **Guest**
* **BookingGuest**
* **Inventory**
* **Payment**
* **ContactInfo**

### Relationships:

* One-to-Many (Hotel → Rooms)
* One-to-Many (User → Bookings)
* Many-to-Many (Booking ↔ Guests via BookingGuest)
* Inventory tracking per room per date

---

##  Tech Stack

*  Java
*  Spring Boot
*  Spring Data JPA
*  PostgreSQL
*  Hibernate
*  Spring Security 
*  JWT Authentication 
*  Postman-API Testing
*  Maven

---

##  Future Enhancements

* JWT-based Authentication & Authorization
* Role-based access control (Admin/User)
* Payment Gateway Integration (Razorpay/Stripe)
* Caching using Redis
* API rate limiting
* Microservices architecture (future scope)

---

##  Author

**Yashraj Vyas**
📧 [yvyas398845@gmail.com](mailto:yvyas398845@gmail.com)
🔗 https://www.linkedin.com/in/yashraj-vyas-819b46320

---

## ⭐ Show Your Support

If you like this project, give it a ⭐ on GitHub!
