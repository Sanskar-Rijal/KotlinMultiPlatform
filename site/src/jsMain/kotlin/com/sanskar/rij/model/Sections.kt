package com.sanskar.rij.model

enum class Sections(
    val id:String,
    val title:String,
    val subtitle:String,
    val path:String
) {
    Home(
        id ="home",
        title="Home",
        subtitle = "",
        path = "#home"
    ),
    About(
        id ="About",
        title="About",
        subtitle = "",
        path = "#About"
    ),
    Service(
        id ="Service",
        title="Service",
        subtitle = "",
        path = "#Service"
    ),
    Portfolio(
        id ="Portfolio",
        title="Portfolio",
        subtitle = "",
        path = "#Portfolio"
    ),
    Experience(
        id ="Experience",
        title="Experience",
        subtitle = "",
        path = "#Experience"
    ),
    Contact(
        id ="Contact",
        title="Contact",
        subtitle = "",
        path = "#Contact"
    ),
    Testinomal(
        id ="Testinomal",
        title="Testinomal",
        subtitle = "",
        path = "#Testinomal"
    ),
    Achievements(
        id ="Achievements",
        title="Achievements",
        subtitle = "",
        path = "#Achievements"
    ),
}