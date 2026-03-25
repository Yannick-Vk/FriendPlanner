# FriendPlanner

## Table of Contents
- [About](#about)
- [Features](#features)
  - [Minimum Viable Product (MVP)](#minimum-viable-product-mvp)
  - [Planned Enhancements](#planned-enhancements)
- [Tech Stack](#tech-stack)
- [Setup & Installation](#setup--installation)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## About
FriendPlanner is a collaborative event planning and social coordination web application designed to simplify organizing gatherings with friends. It aims to provide a seamless experience for managing events, coordinating free time, and staying connected with your social circles.

## Features

### Minimum Viable Product (MVP)
The initial release of FriendPlanner will focus on delivering core functionalities to enable friends to connect and organize events:
- **User Registration and Login:** Secure access to the application via an external authentication provider.
- **Friend Group Management:** Ability to create, join, and manage groups of friends.
- **Event Creation:** Users can create new events with essential details such as title, description, date, time, and location.
- **Event Invitations:** Invite individual friends or entire friend groups to events.
- **Event RSVP:** Participants can respond to event invitations (Accept/Decline/Maybe).
- **Upcoming Events View:** A chronological list or calendar view to see all scheduled events.

### Planned Enhancements
Beyond the MVP, FriendPlanner is designed to grow with a rich set of features to enhance social planning:

#### I. Core Functionality & User Management
- **Personal Dashboard/Home Screen:** Overview of upcoming events, quick access to friends and groups, and notifications.
- **User Profiles:** View friends' basic information, mutual groups, and public events.

#### II. Event Management
- **Flexible Event Creation:**
    - **Recurring Events:** Support for daily, weekly, monthly, and custom recurring patterns.
    - **Event Visibility:** Options for public, private (invite-only), or friends-only events.
- **Event Details View:** Comprehensive event information, including map integration for event locations.
- **Event Reminders:** Customizable notifications before an event.

#### III. Scheduling & Availability
- **Personal Availability Management:** Users can define and manage their free/busy slots on a calendar, including recurring availability patterns.
- **Group Availability Overview:** Intelligent suggestions for optimal event timings based on invited participants' and groups' combined availability. Visual representation (e.g., heat map or overlaid calendars) for easier coordination.
- **Detailed Free Time View:** Ability to drill down into specific days or weeks to see precise free/busy slots.

#### IV. Social & Group Features
- **Friend Management:** Features to add/remove friends, send/accept friend requests, and search for users.
- **Friend Groups:** Comprehensive management of groups, including a **group chat functionality** for discussions among members.
- **Event-Specific Chat/Comments:** Allow participants to discuss details related to a particular event directly within the app.

#### V. Calendar & Views
- **Monthly Calendar View:** Clearly mark days with upcoming events, offering an intuitive overview.
- **Weekly/Daily Views:** Detailed breakdowns of events and availability for specific periods.
- **Event Filtering & Search:** Advanced options to filter events by group, date, type, and search for specific events.

#### VI. UI/UX & Technical Considerations
- **Responsive Design:** Optimized for seamless experience across web browsers and various device sizes.
- **Time Zone Handling:** Robust support for different time zones for events and user availability to prevent scheduling conflicts.
- **Push Notifications:** In-app, push, or email notifications for new events, invitations, reminders, and updates.
- **Shareable Event Links:** Generate unique, custom links for easy sharing via chat apps, allowing guests to view event details and RSVP even if they are not yet users.

## Tech Stack
FriendPlanner leverages a modern and robust technology stack:
- **Frontend:** Vue.js (v3), Pinia for state management, and ArkUi for UI components.
- **Backend:** Kotlin with the Ktor framework, built using Gradle.
- **Database:** PostgreSQL for persistent data storage.
- **Authentication:** Handled by an external provider, ensuring secure user management.

## Setup & Installation
To get FriendPlanner up and running, you will need to set up both the frontend and backend components. Detailed instructions for each can be found in their respective README files:
- **[Frontend Setup Guide](./frontend/README.md)**
- **[Backend Setup Guide](./backend/README.md)**

### Prerequisites
Ensure you have the following installed on your system:
-   Node.js (LTS version recommended)
-   Bun (package manager)
-   Java Development Kit (JDK) (e.g., OpenJDK 17 or higher)
-   Docker (for running PostgreSQL locally, or a pre-existing PostgreSQL instance)
-   Git

### Cloning the Repository
```bash
git clone https://github.com/your-username/FriendPlanner.git # Replace with your actual repo URL
cd FriendPlanner
```

## Getting Started
Once the frontend and backend are installed and configured according to their specific READMEs:
1.  **Start the Backend Server:** Follow the instructions in `backend/README.md` to run the Ktor application.
2.  **Start the Frontend Development Server:** Follow the instructions in `frontend/README.md` to launch the Vue.js application.
3.  **Access the Application:** Open your web browser and navigate to the address where the frontend is served (typically `http://localhost:5173`).

## Project Structure
FriendPlanner adopts a monorepo structure to organize its components:
```
FriendPlanner/
├── backend/          # Ktor (Kotlin) API services and database interactions
├── frontend/         # Vue.js single-page application
└── README.md         # Overall project documentation and entry point
```

## Contributing
We welcome contributions to FriendPlanner! Please refer to the `CONTRIBUTING.md` file (or similar document) for detailed guidelines on how to submit issues, propose features, and contribute code.

## License
This project is licensed under the [Your Chosen License] - see the [LICENSE.md](LICENSE.md) file for details.

## Contact
For any questions or inquiries, please reach out to [Your Name/Email/GitHub Profile].
