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
        description = "You can add and Save notes",
        link = "https://github.com/Sanskar-Rijal/Note_App"
    ),
    Two(
        image = Res.Image.portfolio2,
        title = "Drawing App",
        description = "Painting App which can be used to draw image",
        link = "https://github.com/Sanskar-Rijal/Drawing-App"
    ),
    Three(
        image = Res.Image.portfolio3,
        title = "Weather App",
        description = "App that shows weather of any country you choose",
        link = "https://github.com/Sanskar-Rijal/Weather"
    ),
    Four(
        image = Res.Image.portfolio4,
        title = "Flag quiz",
        description = "Shows a flag and asks us to guess the country ",
        link ="https://github.com/Sanskar-Rijal/Quiz-app"
    ),
    Five(
        image = Res.Image.portfolio5,
        title = "Jet Quiz",
        description = "Quiz app with more than 2000 questions",
        link = "https://github.com/Sanskar-Rijal/JetQuiz"
    )
}