# WhatsApp Chatbot Backend

## Features
- REST API /webhook
- Handles Hi → Hello
- Handles Bye → Goodbye

## Tech Stack
- Java
- Spring Boot

## How to Run
mvn spring-boot:run

## API
POST /webhook

Request:
{
  "message": "Hi"
}

Response:
{
  "reply": "Hello"
}
