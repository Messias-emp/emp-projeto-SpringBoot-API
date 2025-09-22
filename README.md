# Emp Spring Boot API

API REST simples construída com **Spring Boot 3.5.6**, **Java 21** e **Gradle**, com integração Swagger (OpenAPI) e deploy no Railway.

---

## 🚀 Tecnologias

- Java 21
- Spring Boot 3.5.6
- Gradle 8.14.3
- JPA / Hibernate
- H2 Database (desenvolvimento)
- PostgreSQL (produção)
- Springdoc OpenAPI (Swagger)
- Railway.app (deploy)

---

## 📁 Estrutura do projeto

src/main/java/emp_mais/emp_spring_boot_api
│
├── controller
│ └── UserController.java # Endpoints REST
│ └── exception
│ └── GlobalExceptionHandler.java # Tratamento global de erros
│
├── domain
│ └── model
│ ├── User.java
│ ├── Account.java
│ ├── Card.java
│ ├── Feature.java
│ ├── News.java
│ └── BaseItem.java
│ └── repository
│ └── UserRepository.java
│
├── service
│ ├── UserService.java # Interface
│ └── impl/UserServiceImpl.java # Implementação

---

## ⚙️ Configuração do Banco de Dados

- **Dev:** H2 Database em memória
- **Prod:** PostgreSQL no Railway
- Variáveis de ambiente do Railway: `DATABASE_URL`, `DATABASE_USERNAME`, `DATABASE_PASSWORD`, `SPRING_PROFILES_ACTIVE=prod`.

---

## 🏃‍♂️ Rodando localmente

1. Clone o projeto:

```bash
git clone https://github.com/Messias-emp/emp-projeto-SpringBoot-API.git
```
