package com.sanskar.rij.components

import androidx.compose.runtime.Composable
import com.sanskar.rij.model.Sections
import com.sanskar.rij.model.Theme
import com.sanskar.rij.util.Constants.Font_Family
import com.sanskar.rij.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Th

@Composable
fun Header(){
    Row(
        modifier = Modifier
            .fillMaxWidth(80.percent) //it will cover only 80%
            .margin(topBottom = 50.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        LeftSide()
        RightSide()
    }
}

@Composable
fun LeftSide(){
    Row {
        Image(
            src =Res.Image.logo ,
            description = "logo"
        )
    }
}
@Composable
fun RightSide(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .borderRadius(r = 50.px)
        .backgroundColor(Theme.White.rgb)
        .padding(20.px),
        horizontalArrangement = Arrangement.End) {
        Sections.values().take(6).forEach {section->
            Link(
                modifier = Modifier
                    .padding(right = 30.px)
                    .fontFamily(Font_Family)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal),
                path = section.path,
                text = section.title
            )
        }
    }
}