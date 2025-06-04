# spring-for-graphql

Self-learning project to explore how GraphQL works and how it is integrated with Spring Boot.

## Table of Contents

- [About](#about)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## About

This project demonstrates the basics of integrating GraphQL with Spring Boot. It is intended for educational purposes, showcasing how to set up GraphQL endpoints, data handling with Spring Data JPA, and in-memory database usage.

## Features

- Spring Boot 3.x integration
- GraphQL endpoint support
- In-memory H2 database for quick testing
- Example of Spring Data JPA usage

## Installation

### Prerequisites

- Java 17 or higher (project uses Java 23 in configuration, but most features are compatible with Java 17+)
- Maven 3.8+

### Steps

1. **Clone the repository:**
   ```shell
   git clone https://github.com/Amansingh98/spring-for-graphql.git
   cd spring-for-graphql
   ```

2. **Build the project:**
   ```shell
   ./mvnw clean install
   ```

3. **Run the application:**
   ```shell
   ./mvnw spring-boot:run
   ```
   The app will start on [http://localhost:8080](http://localhost:8080).

4. **Access the H2 database console (optional):**
   - Visit [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   - Use JDBC URL: `jdbc:h2:mem:testdb`
   - Username: `sa`
   - Password: `admin`

## Usage

- GraphQL endpoint is available at: `/graphql`
- Sample queries and schema should be found in the `src/main/resources` directory (add examples here if available)

## Project Structure

```
.
├── src/
│   ├── main/
│   │   ├── java/               # Java source code
│   │   └── resources/          # Application properties, schema, etc.
│   └── test/                   # Unit and integration tests
├── pom.xml                     # Maven configuration
└── README.md                   # Project documentation
```

## Contributing

Contributions are welcome! Please open issues or pull requests for suggestions and improvements.

## License

This project is for educational purposes. Please refer to the repository for license details, or add a `LICENSE` file if distributing.
