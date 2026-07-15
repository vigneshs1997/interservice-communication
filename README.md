# interservice-communication
A collection of Spring Boot microservices examples covering inter-service communication using RestTemplate, OpenFeign, Eureka, API Gateway, and Spring Cloud. 

## Spring HTTP Clients Comparison

| Feature | RestTemplate | RestClient | WebClient | HTTP Interface |
|---------|--------------|------------|-----------|----------------|
| Introduced | Spring 3 | Spring 6.1 | Spring 5 | Spring 6 |
| Status | Maintenance mode (no new features) | Recommended for blocking apps | Recommended for reactive apps | Recommended for declarative clients |
| Programming Model | Blocking | Blocking | Non-blocking | Declarative |
| Reactive Support | ❌ | ❌ | ✅ | ✅ (when backed by WebClient) |
| Easy to Use | Medium | Easy | Medium | Very Easy |
| Return Type | Object | Object | `Mono` / `Flux` | Object or `Mono` / `Flux` |
| Boilerplate | High | Low | Medium | Very Low |
| Best For | Legacy projects | Spring MVC | Spring WebFlux | Microservices |

---

## 1. RestTemplate (Blocking)

**Status:** Legacy (Maintenance Mode)

The current thread waits until the server responds before continuing execution.

### Characteristics

- Blocking HTTP client
- Introduced in Spring 3
- Easy to learn
- No longer receives new features
- Recommended only for maintaining existing applications

### Best Use Cases

- Legacy Spring Boot applications
- Existing enterprise projects

---

## 2. RestClient (Blocking)

**Status:** Recommended for new Spring MVC applications

The current thread waits until the server responds, but provides a modern and fluent API compared to RestTemplate.

### Characteristics

- Blocking HTTP client
- Introduced in Spring Framework 6.1
- Cleaner and more readable API
- Easier configuration
- Modern replacement for RestTemplate

### Best Use Cases

- Spring MVC applications
- Traditional CRUD applications
- Microservices using synchronous communication

---

## 3. WebClient (Non-blocking)

**Status:** Recommended for Spring WebFlux

The request is sent asynchronously. The thread is immediately released and can perform other work while waiting for the response.

### Characteristics

- Non-blocking
- Reactive programming
- Returns `Mono` or `Flux`
- High scalability
- Better resource utilization

### Best Use Cases

- Spring WebFlux
- Real-time applications
- Streaming APIs
- High-concurrency systems

---

## 4. HTTP Interface (Declarative Client)

Instead of writing HTTP request code manually, define an interface and let Spring generate the implementation.

### Characteristics

- Declarative programming
- Minimal boilerplate
- Built on top of RestClient or WebClient
- Easy to maintain

### Best Use Cases

- Microservices
- Large applications with many REST clients
- Clean and maintainable code

---

## Thread Behavior

### RestClient / RestTemplate

```

Request
│
▼
Thread waits...
│
▼
Response received
│
▼
Continue execution

```

---

### WebClient

```

Request
│
▼
Thread sends request
│
├── Thread becomes free
│
▼
Server processes request
│
▼
Response arrives
│
▼
Continue execution

```

---

## Which One Should I Choose?

| Scenario | Recommended |
|----------|-------------|
| Existing legacy project | RestTemplate |
| New Spring MVC application | RestClient |
| Spring WebFlux application | WebClient |
| Microservices with many API clients | HTTP Interface |
