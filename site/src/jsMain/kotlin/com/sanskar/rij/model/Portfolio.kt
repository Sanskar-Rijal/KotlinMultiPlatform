package com.sanskar.rij.model

import com.sanskar.rij.util.Res
import org.w3c.dom.Image

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String,
    val link:String
) {
    One(
        image = Res.Image.portfolio1,
        title = "Note App",
        description = "Save Notes",
        link = "https://github.com/Sanskar-Rijal/Note_App"
    ),
    Two(
        image = Res.Image.portfolio2,
        title = "Drawing App",
        description = "Draw anything",
        link = "https://github.com/Sanskar-Rijal/Drawing-App"
    ),
    Three(
        image = Res.Image.portfolio3,
        title = "Weather App",
        description = "See Weather",
        link = "https://github.com/Sanskar-Rijal/Weather"
    ),
    Four(
        image = Res.Image.portfolio4,
        title = "Flag quiz",
        description = "Game ",
        link ="https://github.com/Sanskar-Rijal/Quiz-app"
    ),
    Five(
        image = Res.Image.portfolio5,
        title = "Jet Quiz",
        description = "Game",
        link = "https://github.com/Sanskar-Rijal/JetQuiz"
    ),
    Six(
    image = Res.Image.portfolio6,
    title = "Wordle",
    description = "Game",
    link = "https://github.com/Sanskar-Rijal/Wordle"
    )

}