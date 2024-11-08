# Distributed Cache System

## Overview
A high-performance, distributed caching solution designed with **Redis** and **Spring Boot**. Optimized to handle high traffic loads with low-latency responses, ensuring reliability even during peak usage.

## Features
- **Scalable Architecture**: Supports scaling across multiple nodes to handle large volumes of requests.
- **Low Latency**: Uses Redis for fast in-memory data access, reducing response time significantly.
- **Fault Tolerance**: Configured with failover mechanisms to ensure high availability.
- **Data Consistency**: Implements caching strategies to maintain data consistency.

## Architecture
- **Redis**: Serves as the in-memory database for caching frequently accessed data.
- **Spring Boot**: Manages API requests and cache coordination, integrating with Redis for data storage and retrieval.
- **Horizontal Scaling**: Designed to expand by adding additional Redis and Spring Boot nodes.

## Technology Stack
- **Backend**: Spring Boot
- **Caching Layer**: Redis

## Getting Started

### Prerequisites
- **Java** 17 or later
- **Redis** server

### Setup Instructions
1. **Clone the Repository**
   ```bash
   git clone https://github.com/swanjiku/distributed-cache-system.git
   cd distributed-cache-system
