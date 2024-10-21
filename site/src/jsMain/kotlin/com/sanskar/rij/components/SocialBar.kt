package com.sanskar.rij.components

import androidx.compose.runtime.Composable
import com.sanskar.rij.style.SocialLinkStyle
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun SocialBar(){
    Column(modifier = Modifier
        .margin(right = 25.px)
        .padding { topBottom(25.px) }
        .minWidth(40.px)
        .borderRadius(r = 20.px)
        .backgroundColor(Colors.White.toRgb()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        SocialLinks()
    }
}

@Composable
private fun SocialLinks(){
    Link(
        path = "https://www.facebook.com/profile.php?id=100007549637597",
    ){
        FaFacebook(modifier = SocialLinkStyle.toModifier()
            .margin(bottom = 40.px),
            size = IconSize.LG)
    }
    Link(
        path = "https://github.com/Sanskar-Rijal",
    ){
        FaGithub(modifier = SocialLinkStyle.toModifier()
            .margin(bottom = 40.px),
            size = IconSize.LG)
    }
    Link(
        path = "https://www.instagram.com/sans_kar_7_/",
    ){
        FaInstagram(modifier =SocialLinkStyle.toModifier()
            .margin(bottom = 40.px),
            size = IconSize.LG)
    }
    Link(
        path = "https://www.linkedin.com/in/sanskar-rizal-8bb58a264/",
    ){
        FaLinkedin(modifier = SocialLinkStyle.toModifier()
            .margin(bottom = 40.px),
            size = IconSize.LG)
    }
}