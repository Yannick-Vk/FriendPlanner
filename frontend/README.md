# FriendPlanner Frontend

## Table of Contents
- [About](#about)
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Build for Production](#build-for-production)
- [Project Structure](#project-structure)
- [Key Features Implemented](#key-features-implemented)
- [Styling & Components](#styling--components)
- [State Management](#state-management)
- [API Communication](#api-communication)
- [Linting & Formatting](#linting--formatting)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## About
This directory contains the frontend application for FriendPlanner, built with Vue.js. It provides the user interface through which users interact with the FriendPlanner backend services, allowing them to manage friends, create events, coordinate schedules, and more.

## Tech Stack
-   **Framework:** Vue.js (v3)
-   **Build Tool:** Vite
-   **State Management:** Pinia
-   **UI Library/Components:** ArkUi
-   **Language:** TypeScript
-   **Routing:** Vue Router (for single-page application navigation)
-   **Styling:** Tailwind CSS (utility-first framework)
-   **Package Manager:** Bun

## Prerequisites
-   Node.js (LTS version recommended)
-   Bun (used for package management and script execution)

## Installation
To set up the frontend development environment:

1.  Navigate to the `frontend` directory:
    ```bash
    cd frontend
    ```
2.  Install project dependencies using Bun:
    ```bash
    bun install
    ```

## Running the Application
To start the development server:
```bash
bun dev
```
The application will typically be available in your browser at `http://localhost:5173` (or another port as indicated by Vite during startup). This server features hot-module reloading for a smooth development experience.

## Build for Production
To build the application for deployment (e.g., to a static hosting service):
```bash
bun build
```
This command compiles and bundles the application, generating optimized production-ready files in the `dist/` directory.

## Project Structure
A high-level overview of the key directories and files within the `frontend/src` directory:

```
frontend/
├── public/               # Static assets (e.g., favicon.ico)
├── src/
│   ├── assets/           # Global assets like images, icons, fonts
│   ├── components/       # Reusable Vue components (e.g., buttons, cards, forms)
│   ├── router/           # Vue Router configuration and route definitions
│   ├── stores/           # Pinia stores for application-wide state management
│   ├── views/            # Page-level components/views (e.g., HomeView.vue, EventDetailView.vue)
│   ├── App.vue           # The root Vue component
│   └── main.ts           # Application entry point (initializes Vue app, router, Pinia)
├── env.d.ts              # TypeScript declaration for environment variables
├── index.html            # Main HTML file for the application
├── package.json          # Project metadata, scripts, and dependencies
├── tsconfig.json         # TypeScript configuration
└── vite.config.ts        # Vite build tool configuration
```

## Key Features Implemented
The frontend provides the user interface for all FriendPlanner features, including:
-   User authentication forms (login, registration)
-   Dashboard and home screens
-   Friend group management interfaces
-   Event creation and editing forms
-   Calendar and event list displays
-   User availability management interfaces
-   Chat interfaces for groups and events

## Styling & Components
The application uses ArkUi for robust and accessible UI components, complemented by **Tailwind CSS** as a utility-first framework for efficient and consistent styling. This combination allows for rapid UI development while maintaining a high degree of customizability.

## State Management
Pinia is used as the official state management library for Vue.js. It provides a simple, intuitive, and performant way to manage global application state, making it easy to share data across components. Stores are defined in the `src/stores` directory.

## API Communication
The frontend communicates exclusively with the FriendPlanner backend API (developed in Kotlin/Ktor) to fetch and send data. **All authentication concerns, including user login, registration, and management of JWT (JSON Web Token) access/refresh tokens, are handled by the FriendPlanner backend, which in turn orchestrates requests with your dedicated [KotlinLogin-service](https://github.com/Yannick-Vk/KotlinLogin-service).** This ensures a secure and streamlined communication flow where the frontend is abstracted from the specifics of the authentication service. Communication typically involves using the browser's native `fetch` API or a library like Axios. API base URLs and other environment-specific configurations are handled via Vite's environment variable support.

## Linting & Formatting
To maintain code quality and consistency:
-   **ESLint:** Used for static code analysis to catch potential errors and enforce coding standards.
-   **Prettier:** Used for automatic code formatting to ensure a consistent style across the codebase.

## Testing
The frontend utilizes a combination of testing tools to ensure reliability:
-   **Vitest:** A fast and modern unit and component testing framework, tightly integrated with Vite. It's ideal for testing individual Vue components, Pinia stores, and utility functions.
-   **Playwright:** A powerful end-to-end (E2E) testing framework for simulating real user interactions across the entire application in a browser environment. It's excellent for ensuring critical user flows work as expected.

## Contributing
Contributions to the FriendPlanner frontend are welcome! Please ensure your code adheres to the established coding standards and includes appropriate tests. Refer to the main `CONTRIBUTING.md` for general guidelines.

## License
This frontend project is open-sourced under the [Your Chosen License]. See the main [LICENSE.md](../LICENSE.md) file for full details.