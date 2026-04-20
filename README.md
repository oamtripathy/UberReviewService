# 🚗 Uber Review Service

This is a simple Spring Boot project where users can add and manage reviews for rides (like in Uber).
I built this mainly to understand how real-world services handle relationships between entities like Booking, Passenger, Driver, and Review.

---

## 💡 What this project does

* Add a review for a ride (based on booking)
* Get all reviews
* Fetch a review by ID
* Update review details
* Delete a review

Nothing fancy, but covers the core backend concepts properly 👍

---

## 🛠 Tech used

* Java 17
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL (can be changed)
* Lombok
* Gradle

---

## 🧱 Project structure (simple explanation)

```id="xk3p9a"
controller  → handles API requests  
service     → business logic  
repository  → database layer  
models      → entity classes  
dtos        → request/response objects  
adapters    → DTO ↔ Entity conversion
```

---

## 🔗 API endpoints

### Create Review

```
POST /api/v1/reviews
```

Example request:

```json id="v8h2y1"
{
  "content": "Nice ride",
  "rating": 4.5,
  "bookingId": 1
}
```

---

### Get all reviews

```
GET /api/v1/reviews
```

---

### Get review by ID

```
GET /api/v1/reviews/{id}
```

---

### Update review

```
PUT /api/v1/reviews/{id}
```

---

### Delete review

```
DELETE /api/v1/reviews/{id}
```

---

## ⚠️ Things I learned while building this

* Bi-directional relationships can easily cause infinite JSON loops 😅
* Using `@JsonIgnore` helps prevent that
* DTOs are much better than directly returning entities
* Lazy loading can cause issues if not handled properly

---

## 🚀 How to run

Clone the repo:

```
git clone https://github.com/oamtripathy/UberReviewService.git
```

Go inside the project:

```
cd UberReviewService
```

Run it:

```
./gradlew bootRun
```

---

## 📌 Future improvements (if I continue this)

* Add authentication (login/signup)
* Pagination for reviews
* Separate driver & passenger reviews
* Connect with actual ride service

---

## 👨‍💻 About me

Made by Oam Tripathy while learning backend development and Spring Boot.

---

## ⭐

If you found this useful, feel free to star the repo 🙂
