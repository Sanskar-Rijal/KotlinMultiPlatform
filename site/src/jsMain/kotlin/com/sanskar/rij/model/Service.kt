package com.sanskar.rij.model

import com.sanskar.rij.util.Constants
import com.sanskar.rij.util.Res

enum class Service(
    val icon:String,
    val imageDesc:String,
    val title :String,
    val description:String
) {
    Android(
        icon = Res.Icon.android,
        imageDesc = "Android Icon",
        title = "Android Development",
        description = Constants.Android
    ),
    IOS(
        icon = Res.Icon.apple,
        imageDesc = "Apple Icon",
        title = "iOS Development",
        description =Constants.Ios
    ),
    Web(
        icon = Res.Icon.web,
        imageDesc = "Desktop Icon",
        title = "Web Development",
        description = Constants.WebDev
    ),
    Design(
        icon = Res.Icon.design,
        imageDesc = "Pen Icon",
        title = "UX/UI Design",
        description = Constants.design
    ),
    Business(
        icon = Res.Icon.business,
        imageDesc = "Chart Icon",
        title = "Business Analysis",
        description = Constants.business
    ),
    SEO(
        icon = Res.Icon.seo,
        imageDesc = "Megaphone Icon",
        title = "SEO Marketing",
        description = Constants.SeO
    )
}