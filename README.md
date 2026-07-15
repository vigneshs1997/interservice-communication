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
