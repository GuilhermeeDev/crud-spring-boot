# 📦 CRUD com Spring Boot

Aplicação **CRUD** desenvolvida com **Java + Spring Boot** para gerenciamento de produtos.

---

## Tecnologias utilizadas

- Java 25  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- PostgreSQL
- Maven 4+

---

## Como rodar

#### 1. Clone este repositório

```bash
git clone https://github.com/GuilhermeeDev/crud-spring-boot.git
cd crud-spring-boot
```
#### 2. Rode como localhost
```
mvnw spring-boot:run
```

#### 3. Rode com Docker / Docker compose
Build do container
```
docker build -t crud-springboot:latest .
```

Subindo compose pré-configurado
```
docker compose up
```
