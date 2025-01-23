# Distributed Cache System

## Overview
A high-performance, distributed caching solution designed with **Redis** and **Spring Boot**. This system is optimized for handling high traffic loads with low-latency responses, ensuring reliability and consistency even during peak usage.

## Features
- **Scalable Architecture**: Supports scaling across multiple nodes to handle large volumes of requests.
- **Low Latency**: Leverages Redis for fast in-memory data access, significantly reducing response times.
- **Fault Tolerance**: Configured with failover mechanisms to ensure high availability during system disruptions.
- **Data Consistency**: mplements efficient caching strategies to maintain accurate and synchronized data.

## Architecture
- **Redis**: Functions as the in-memory database for caching frequently accessed data.
- **Spring Boot**: Handles API requests, cache coordination, and integrates seamlessly with Redis for data storage and retrieval.
- **Horizontal Scaling**: Designed to scale horizontally by adding additional Redis and Spring Boot nodes.

## Technology Stack
- **Backend**: Spring Boot
- **Caching Layer**: Redis

## Getting Started

### Prerequisites
- **Java** 17 or later
- **Redis** server installed and running

### Setup Instructions
1. Clone the Repository:
   ```bash
   git clone https://github.com/swanjiku/distributed-cache-system.git
   cd distributed-cache-system
   ```
2. Navigate to the project directory:
   ```bash
   cd distributed-cache-system
   ```
