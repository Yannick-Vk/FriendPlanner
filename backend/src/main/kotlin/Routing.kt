package xyz.mitzie

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
const val baseRoute = "/api/v1"

fun Application.configureRouting() {
    routing {
        get(baseRoute) {
            call.respondText("FriendPlanner is up and running")
        }

        get("$baseRoute/users") {
            call.respondText("Work in progress")
        }

        get("$baseRoute/friends") {
            call.respondText("Work in progress")
        }

        get("$baseRoute/groups") {
            call.respondText("Work in progress")
        }

        get("$baseRoute/events") {
            call.respondText("Work in progress")
        }

        get("$baseRoute/availability") {
            call.respondText("Work in progress")
        }

        get("$baseRoute/auth") {
            call.respondText("Work in progress")
        }

        post("baseRoute/auth/login") {
            call.respondText("Work in progress")
        }

        post("baseRoute/auth/register") {
            call.respondText("Work in progress")
        }

    }
}
