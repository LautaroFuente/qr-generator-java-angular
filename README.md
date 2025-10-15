# 📱 QR Generator Web App

## 📖 Description

**QR Generator Web App** is a full-stack web application that allows users to generate QR codes from any text or link, download them, and view a list of all previously created QR codes with their generation dates.

The system consists of:

🧩 Frontend: built with Angular 18 and served through Nginx.

⚙️ Backend: developed with Java Spring Boot, managing QR persistence and communication with the database.

🗄️ Database: MySQL running in a Docker container.

## 🚀 Getting Started

Follow these steps to set up and run the project locally using Docker Compose.

### 1. Clone the repository

```
git clone https://github.com/your-username/qr-generator-webapp.git
cd qr-generator-webapp
```

### 2. Create environment files

You need two .env files.
Each folder includes a .env.example file you can copy and modify as needed.

🧠 Backend (/qr-generator-backend/.env)

Used to configure the database connection and CORS origins:

```
DB_URL=jdbc:mysql://db:3306/qr_info_database
DB_USERNAME=your_username
DB_PASSWORD=your_password
CORS_ORIGINS=http://localhost:4200
```

🗄️ Root of the project (/.env)

Used by Docker Compose to configure the MySQL service:

```
# Database root credentials
MYSQL_ROOT_PASSWORD=your_root_password

# App database
MYSQL_DATABASE=qr_info_database
MYSQL_USER=your_user
MYSQL_PASSWORD=your_password

# MySQL port
MYSQL_PORT=3306
```

⚠️ Make sure the usernames and passwords match between both .env files.

### 3. Run the system with Docker

From the project root, run:

```
docker compose up --build
```

This will:

Start a MySQL database container (qr-mysql)

Build and run the Spring Boot backend (qr-backend)

Build and serve the Angular frontend through Nginx (qr-frontend)

Once all containers are running:

🌐 Frontend: http://localhost:4200

⚙️ Backend API: http://localhost:8080

### 🧹 Optional: Stop and clean containers

To stop all containers:

```
docker compose down
```

To remove all containers, networks, and volumes:

```
docker compose down -v
```

## 🧰 Tech Stack

#### Frontend Angular 18, Nginx

#### Backend Java 17, Spring Boot, Hibernate

#### Database MySQL 8

#### DevOps Docker, Docker Compose
