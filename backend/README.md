# FriendPlanner Backend

## Table of Contents
- [About](#about)
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [Building for Production](#building-for-production)
- [API Endpoints](#api-endpoints)
- [Database](#database)
- [Authentication](#authentication)
- [Project Structure](#project-structure)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## About
This directory contains the backend API services for FriendPlanner, developed with Kotlin and the Ktor framework. It is responsible for managing all application data, business logic, user authentication (via an external provider), and providing the necessary endpoints for the frontend application.

## Tech Stack
-   **Language:** Kotlin
-   **Framework:** Ktor (for building asynchronous servers and clients, routing, serialization)
-   **Build System:** Gradle (using Kotlin DSL)
-   **Database:** PostgreSQL
-   **ORM/Database Access:** Exposed (a lightweight ORM framework for Kotlin)
-   **Authentication:** [KotlinLogin-service](https://github.com/Yannick-Vk/KotlinLogin-service) (your custom external JWT-based service with future OAuth plans)
-   **Dependency Injection:** Koin (a pragmatic lightweight dependency injection framework)
-   **Testing:** JUnit (test runner), MockK (mocking library), Kotest (assertion library)

## Prerequisites
Before you begin, ensure you have the following installed on your system:
-   **Java Development Kit (JDK):** OpenJDK 17 or higher is recommended.
-   **Docker:** Essential for running a local PostgreSQL instance. If you have an existing PostgreSQL setup, ensure it's accessible.
-   **Git:** For cloning the repository.

## Installation
To set up the backend development environment:

1.  Navigate to the `backend` directory:
    ```bash
    cd backend
    ```
2.  (Optional but Recommended) Start a local PostgreSQL database using Docker Compose:
    ```bash
    docker-compose up -d postgres
    ```
    This will start a PostgreSQL container in the background.
3.  Build the project dependencies. Gradle will automatically handle this on the first run or when dependencies change:
    ```bash
    ./gradlew build
    ```

## Configuration
The backend application's configuration is managed primarily through `src/main/resources/application.yaml`. Key configurations include:

-   **Database Connection:** Update the `database` section with your PostgreSQL credentials and connection details.
    ```yaml
    ktor:
      deployment:
        port: 8080
      application:
        modules:
          - com.friendplanner.ApplicationKt.module
      database:
        url: jdbc:postgresql://localhost:5432/friendplanner
        user: friendplanner_user
        password: your_db_password
    ```
-   **External Authentication:** Configure details for your chosen external OAuth2 provider (e.g., client ID, client secret, authorization/token endpoints) within `application.yaml` or through environment variables.
-   **Server Port:** The default server port is 8080, configurable under `ktor.deployment.port`.

For production deployments, it's recommended to manage sensitive configurations (like database passwords, client secrets) using environment variables.

## Running the Application
To start the Ktor development server:
```bash
./gradlew run
```
The API will typically be available at `http://localhost:8080` (or the port configured in `application.yaml`).

## Building for Production
To build a self-contained, executable JAR file for deployment:
```bash
./gradlew clean installDist
```
The executable JAR and necessary scripts will be generated in the `build/install/backend/` directory. You can then run the application using the generated script:
```bash
./build/install/backend/bin/backend
```

## API Endpoints
The backend provides a RESTful API to interact with FriendPlanner data. High-level endpoints include:
-   `/api/v1/users`: User management, profile data.
-   `/api/v1/friends`: Friend management, requests.
-   `/api/v1/groups`: Friend group creation and management.
-   `/api/v1/events`: Event creation, retrieval, updates, and participant management.
-   `/api/v1/availability`: User availability management.
-   `/auth/login`, `/auth/callback`: Authentication flow with the external provider.

Detailed API documentation (e.g., via OpenAPI/Swagger UI) can be generated or will be provided separately.

## Database
FriendPlanner uses PostgreSQL as its primary database.
-   **Schema:** The database schema is defined through Exposed entities.
-   **Migrations:** Database migrations are typically handled manually or integrated with a tool like Flyway/Liquibase to manage schema changes over time. (Specific migration tool to be chosen).

## Authentication
User authentication within FriendPlanner is orchestrated by this backend, acting as an intermediary between the frontend and your **[KotlinLogin-service](https://github.com/Yannick-Vk/KotlinLogin-service)**. The frontend will send authentication requests (e.g., login, registration) to this backend. The FriendPlanner backend will then interact with the KotlinLogin-service, which handles user identity, provides JWT-based access and refresh tokens, and supports profile pictures (with future plans for OAuth integration).

Upon successful authentication with the KotlinLogin-service, this backend will receive the `userId` (or a similar unique identifier) and will be responsible for:
-   **Session Management:** Managing the user's session with the frontend (e.g., via secure cookies or by forwarding tokens).
-   **Token Handling:** Storing and refreshing JWTs obtained from the KotlinLogin-service to securely make subsequent calls to protected resources.
-   **User Data Management:** Storing the `userId` received from the auth service and potentially additional user-specific data relevant to the FriendPlanner application (e.g., user preferences, FriendPlanner-specific profile information).
-   **API Security:** Verifying the authenticity of user requests using the managed tokens to secure its own API endpoints.

## Project Structure
A high-level overview of the key directories and files within the `backend/` directory:

```
backend/
├── build.gradle.kts       # Gradle build script (Kotlin DSL)
├── gradlew                # Gradle wrapper script
├── gradle/                # Gradle wrapper files
├── src/
│   ├── main/
│   │   ├── kotlin/        # Kotlin source code:
│   │   │   ├── com/friendplanner/ # Main application entry point and modules
│   │   │   ├── com/friendplanner/routes/ # API route definitions
│   │   │   ├── com/friendplanner/models/ # Data models (entities, DTOs)
│   │   │   └── com/friendplanner/services/ # Business logic services
│   │   └── resources/     # Configuration files (application.yaml, logback.xml)
│   └── test/              # Unit and integration tests
└── README.md              # Backend-specific documentation
```

## Testing
To ensure the reliability and correctness of the backend services:
-   **Unit Tests:** Written using JUnit, leveraging MockK for mocking dependencies.
-   **Integration Tests:** Testing interactions between different components and the database.
-   **Running Tests:**
    ```bash
    ./gradlew test
    ```

## Contributing
Contributions to the FriendPlanner backend are highly encouraged! Please adhere to Kotlin best practices and ensure comprehensive test coverage. Refer to the main `CONTRIBUTING.md` for general guidelines.

## License
This backend project is open-sourced under the [Your Chosen License].