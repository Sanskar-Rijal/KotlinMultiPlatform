package com.sanskar.rij.model

enum class Sections(
    val id:String,
    val title:String,
    val subtitle:String,
    val path:String
) {
    Home(
        id ="Home",
        title="Home",
        subtitle = "",
        path = "#Home"
    ),
    About(
        id ="About",
        title="About me",
        subtitle = "Why To Hire Me?",
        path = "#About"
    ),
    Service(
        id ="Service",
        title="Service",
        subtitle = "I'm Really Good At",
        path = "#Service"
    ),
    Portfolio(
        id ="Portfolio",
        title="Portfolio",
        subtitle = "My Projects",
        path = "#Portfolio"
    ),
    Contact(
        id ="Contact",
        title="Contact Me",
        subtitle = "Have a Query?",
        path = "#Contact"
    )
}