# Cadastro de Ninjas 🥷

This is a **Spring Boot** project that simulates a Ninja registration system. It was developed for academic purposes and aims to demonstrate knowledge in **Java**, **Spring Boot**, **Spring Data JPA**, **Flyway**, and **H2 Database**.

---

## 🚀 Technologies Used

* **Java 17**
* **Spring Boot 3.5.4**
* **Spring Data JPA**
* **H2 Database** (in-memory)
* **Flyway** (database versioning and migrations)
* **Lombok**
* **Maven**

---

## 📂 Project Structure

```
CadastroDeNinjas/
│── src/main/java/com/example/cadastrodeninjas/
│   ├── controller/      # REST Controllers
│   ├── dto/             # Data Transfer Objects
│   ├── model/           # Entities (JPA)
│   ├── repository/      # JPA Repositories
│   └── service/         # Business Logic
│
│── src/main/resources/
│   ├── application.properties  # Application Configuration
│   └── db/migrations/          # Flyway migrations
│
└── pom.xml
```

---

## ⚙️ Configuration

The project uses **environment variables** to manage database credentials.

`.env`

```env
DATABASE_URL=jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
DATABASE_USERNAME=cadastro_db
DATABASE_PASSWORD=cadastro_db
```

`application.properties`

```properties
spring.application.name=CadastroDeNinjas

spring.datasource.url=${DATABASE_URL}
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=${DATABASE_USERNAME}
spring.datasource.password=${DATABASE_PASSWORD}

# JPA / Hibernate settings
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.h2.console.enabled=true

# Flyway settings
spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migrations
spring.flyway.baseline-on-migrate=true
```

---

## ▶️ Running the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/CadastroDeNinjas.git
   cd CadastroDeNinjas
   ```

2. Run with Maven:

   ```bash
   mvn spring-boot:run
   ```

3. Access the application:

    * REST API → `http://localhost:8081/ninjas` (or your configured port)
    * H2 Console → `http://localhost:8081/h2-console`

---

## 📌 Endpoints

### Ninja Controller

* `GET /ninjas` → List all ninjas
* `POST /ninjas` → Create a new ninja
* `GET /ninjas/{id}` → Get ninja by ID
* `PUT /ninjas/{id}` → Update ninja by ID
* `DELETE /ninjas/{id}` → Delete ninja by ID

### Mission Controller

* `GET /missoes` → List all missions
* `POST /missoes` → Create a new mission

---

## 🗄️ Database Versioning (Flyway)

Migrations are stored in `src/main/resources/db/migrations`.
Each file must follow the naming convention:

```
V1__create_tb_missao.sql
V2__create_tb_cadastro.sql
V3__add_column_novo_campo.sql
```

Flyway automatically creates and manages the `flyway_schema_history` table.

---

## 🎯 Features

* Ninja registration with unique email validation
* Association between Ninjas and Missions
* Database migrations with Flyway
* API exposed via REST endpoints
* In-memory database for testing and development

---

## 👨‍💻 Author

Developed by **Virgílio Leitão**
📧 Contact: [virgilio.17@hotmail.com](mailto:your.email@example.com)
🔗 LinkedIn: [linkedin.com/in/virgilioleitao](https://linkedin.com/in/yourprofile)

---

## 📜 License

This project is under the **MIT License** — you are free to use, modify, and distribute it.
