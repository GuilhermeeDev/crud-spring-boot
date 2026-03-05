# 📦 CRUD com Spring Boot

Aplicação **CRUD** desenvolvida com **Java + Spring Boot** para gerenciamento de produtos.

---

## Tecnologias utilizadas

- Java 21
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- PostgreSQL
- Maven 4+

---

## Dependências

- Java 21 (java e javac)
- Maven 3.5+

## Como rodar

#### 1. Clone este repositório

```bash
git clone https://github.com/GuilhermeeDev/crud-spring-boot.git
cd crud-spring-boot
```
#### 2. Rode como localhost
```
mvn clean package -DskipTests
```

#### 3. Rode com Docker / Docker compose
Build do container
```
docker build -t crud-springboot:latest .
```

Subindo docker compose pré-configurado
```
docker compose up
```
