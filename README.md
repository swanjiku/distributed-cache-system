# Distributed Cache System

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com/swanjiku/distributed-cache-system)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

---

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Architecture](#architecture)
- [Technology Stack](#technology-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Setup Instructions](#setup-instructions)
  - [Configure Redis](#configure-redis)
  - [Run the Application](#run-the-application)
- [API Endpoints](#api-endpoints)
- [Usage](#usage)
- [Testing](#testing)
- [Performance Benchmarking](#performance-benchmarking)

---

## Overview
A high-performance, distributed caching solution designed with **Redis** and **Spring Boot**. This system is optimized for handling high traffic loads with low-latency responses, ensuring reliability and consistency even during peak usage.

## Features
- **Scalable Architecture**: Supports scaling across multiple nodes to handle large volumes of requests.
- **Low Latency**: Leverages Redis for fast in-memory data access, significantly reducing response times.
- **Fault Tolerance**: Configured with failover mechanisms to ensure high availability during system disruptions.
- **Data Consistency**: Implements efficient caching strategies to maintain accurate and synchronized data.

## Architecture
- **Redis**: In-memory database for caching frequently accessed data.
- **Spring Boot**: Handles API requests, cache coordination, and integrates seamlessly with Redis for data storage and retrieval.
- **Horizontal Scaling**: Designed to scale horizontally by adding additional Redis and Spring Boot nodes.

## Technology Stack
- **Backend**: Spring Boot
- **Caching Layer**: Redis

## Project Structure
```
distributed-cache-system/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/distributedCacheSystem/
│   │   │   ├── config/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── DistributedCacheSystemApplication.java
│   │   └── resources/
│   └── test/
│       └── java/com/example/distributedCacheSystem/
│           └── DistributedCacheSystemApplicationTests.java
├── pom.xml
├── README.md
└── ...
```

## Getting Started

### Prerequisites
- **Java** 17 or later
- **Redis** server installed and running

### Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/swanjiku/distributed-cache-system.git
   ```
2. Navigate to the project directory:
   ```bash
   cd distributed-cache-system
   ```

### Configure Redis
Make sure Redis is installed and running on your local machine or server.

Update Redis configuration in `application.properties`:
```properties
spring.redis.host=localhost
spring.redis.port=6379
```

### Run the Application
Build and run the application:
```bash
./mvnw spring-boot:run
```
The server will start on [http://localhost:8080](http://localhost:8080) by default.

## API Endpoints

### Store Data in Cache
```
POST /api/cache
```
**Request Body:**
```json
{
  "key": "your_key",
  "value": "your_value"
}
```
**Sample Response:**
```json
{
  "message": "Data cached successfully."
}
```

### Retrieve Cached Data by Key
```
GET /api/cache/{key}
```
**Sample Response:**
```json
{
  "key": "your_key",
  "value": "your_value"
}
```

### Delete Data from Cache by Key
```
DELETE /api/cache/{key}
```
**Sample Response:**
```json
{
  "message": "Data deleted successfully."
}
```

### Error Response Example
```json
{
  "error": "Key not found."
}
```

## Usage

**Cache Management:** Store, retrieve, and delete data through the REST API endpoints.

#### Example Workflows
- Use the `POST /api/cache` endpoint to cache frequently requested data.
- Access the cached data with the `GET /api/cache/{key}` endpoint.
- Remove outdated data from cache using `DELETE /api/cache/{key}`.

## Testing

Use tools like Postman or cURL to interact with the API.

**Example with cURL:**
```bash
curl -X POST -H "Content-Type: application/json" -d '{"key": "testKey", "value": "testValue"}' http://localhost:8080/api/cache
curl -X GET http://localhost:8080/api/cache/testKey
```

To run automated tests:
```bash
./mvnw test
```

## Performance Benchmarking

For testing high request loads, use [Apache JMeter](https://jmeter.apache.org/) or [k6](https://k6.io/) to simulate traffic and benchmark the system’s performance.

---
