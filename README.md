# UEK295_Projekt-Arbeit_LB1
 
## Applikation zum Laufen bringen
Zuerst muss die Datenbank hochgefeuert werden, hierfür benutze ich dies
````bash
docker compose up -d
````
Dann starten Sie die Applikation in IntelliJ IDEA

## Vergebene Ports und Endpoints
SERVICE PORTS
=============
Spring Boot ApplicationPort: 8081
Base URL: http://localhost:8081MariaDBPort: 3306Connection 
URL: jdbc:mariadb://localhost:3306/product-manager
Database: product-manager
Credentials: root/root
AdminerPort: 8082
URL: http://localhost:8082
Login using MariaDB credentials

API ENDPOINTS (on port 8081)
===========================
Authentication Endpoints
-----------------------
POST /auth/login - User login
POST /auth/register - User registration

User Management Endpoints
------------------------
GET /users - List all users
GET /users/{id} - Get specific user
POST /users - Create new user
PUT /users/{id} - Update user
DELETE /users/{id} - Delete user
PUT /users/promote/{id} - Promote user to admin

Product Management Endpoints
---------------------------
GET /products - List all products
GET /products/{id} - Get specific product
POST /products - Create new product
PUT /products/{id} - Update product
DELETE /products/{id} - Delete product

Category Management Endpoints
----------------------------
GET /categories - List all categories
GET /categories/{id} - Get specific category
POST /categories - Create new category
PUT /categories/{id} - Update category
DELETE /categories/{id} - Delete category

Additional Endpoints
------------------
GET /swagger-ui/index.html - Swagger UI documentation
GET /v3/api-docs - OpenAPI specification

Database Management
-----------------
Adminer UI: http://localhost:8082
System: MariaDB
Server: mariadb
Username: root
Password: root
Database: product-manager
