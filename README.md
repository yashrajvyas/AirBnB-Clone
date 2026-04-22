# Airbnb Clone Backend

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge\&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-Framework-6DB33F?style=for-the-badge\&logo=springboot)
![Spring Security](https://img.shields.io/badge/Spring_Security-Enabled-6DB33F?style=for-the-badge\&logo=springsecurity)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge\&logo=hibernate)
![JPA](https://img.shields.io/badge/Spring_Data_JPA-DataLayer-blue?style=for-the-badge)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-336791?style=for-the-badge\&logo=postgresql)
![JWT](https://img.shields.io/badge/JWT-In_Progress-black?style=for-the-badge\&logo=jsonwebtokens)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge\&logo=apachemaven)
![Postman](https://img.shields.io/badge/Postman-API_Testing-FF6C37?style=for-the-badge\&logo=postman)
![Scheduler](https://img.shields.io/badge/Scheduler-Hourly-blueviolet?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

</p>

---

##  Project Overview

A scalable backend system for a hotel booking platform inspired by **Airbnb / Booking.com**, built using **Java Spring Boot** with focus on:

* Real-world backend architecture
* Inventory-based availability system
* Dynamic hotel pricing
* Booking workflows
* Scheduler automation
* Modular clean code structure

---

##  Core Features

##  Hotel Search Engine

Search hotels using:

* City
* Check-in / Check-out dates
* Rooms required
* Pagination support

```http
GET /api/v1/hotels/search
```

---

##  Hotel Management

* Create hotels
* Update hotels
* Activate / deactivate hotels
* Amenities support
* Photos support
* Contact details

```http
POST   /api/v1/admin/hotels
PUT    /api/v1/admin/hotels/{id}
PATCH  /api/v1/admin/hotels/{id}/activate
DELETE /api/v1/admin/hotels/{id}
GET    /api/v1/admin/hotels
```

---

##  Room Management

* Add room types
* Room capacity support
* Base pricing
* Amenities
* Room inventory initialization

```http
POST /api/v1/admin/hotels/{hotelId}/rooms
GET  /api/v1/hotels/{hotelId}/rooms
```

---

##  Booking Flow

Supports:

✅ Init Booking
✅ Add Guests
✅ Payment Handling
✅ Confirm Booking

```http
POST /api/v1/bookings/init
POST /api/v1/bookings/{bookingId}/guests
GET  /api/v1/bookings/search
```

---

##  Inventory Management

Tracks availability **per room per date**

* Total rooms
* Booked rooms
* Reserved rooms
* Availability status

### Benefits:

✅ Prevent overbooking
✅ Fast search queries
✅ Real-world scalable model

---

##  Dynamic Pricing Engine

Implemented using **Strategy Pattern**

Pricing factors:

* Occupancy
* Urgency
* Holiday
* Weekend
* Demand
* Surge Pricing

### Example:

High demand + Weekend + Low inventory = Higher price

---

##  Scheduler Automation

Runs hourly using Spring Scheduler.

Performs:

* Dynamic price recalculation
* Hotel minimum price updates
* Inventory refresh

---

##  Design Highlights

* Layered Architecture
* DTO Pattern
* Strategy Pattern
* REST APIs
* Scheduler Jobs
* Exception Handling
* Scalable code structure

---

##  Project Structure

```text
controller/
service/
repository/
entity/
dto/
strategy/
config/
exception/
security/
```

---

##  Database Tables

* users
* hotel
* room
* booking
* guest
* booking_guests
* inventory
* payment
* hotel_min_price
* user_roles

---

##  Authentication

Currently in progress:

* JWT Login / Signup
* Role Based Access
* Protected APIs

---

##  Tech Stack

* Java 17
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven
* Postman

---

## ▶️ Run Locally

```bash
git clone https://github.com/yashrajvyas/AirBnB-Clone.git
cd AirBnB-Clone
mvn spring-boot:run
```

---

## 🚀 Future Enhancements

* Complete JWT Auth
* Payment Gateway Integration
* Redis Caching
* Email Notifications
* Docker Deployment
* AWS Deployment
* Frontend Integration

---

## 👨‍💻 Author

**Yashraj Vyas**

📧 [yvyas398845@gmail.com](mailto:yvyas398845@gmail.com)
🔗 https://www.linkedin.com/in/yashraj-vyas-819b46320

---

## ⭐ Support

If you like this project, give it a **Star ⭐**

---

