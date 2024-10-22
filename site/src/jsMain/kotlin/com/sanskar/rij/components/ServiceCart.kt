package com.sanskar.rij.components

import androidx.compose.runtime.Composable
import com.sanskar.rij.model.Service
import com.sanskar.rij.model.Theme
import com.sanskar.rij.style.AboutTextStyle
import com.sanskar.rij.util.Constants
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Col
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ServiceCard(service: Service){
    Column(modifier = Modifier
        .maxWidth(300.px)
        .margin (all=20.px)
        .padding(all = 20.px)
        .border(width = 2.px,
            style = LineStyle.Solid,
            color = Theme.LightGray.rgb)
    ) {

        Box(modifier = Modifier
            .padding(10.px)
            .margin(bottom = 20.px)
            .border (width = 2.px, style = LineStyle.Solid,
                color = Theme.Primary.rgb)
            .borderRadius(
                topLeft = 20.px,
                topRight = 20.px,
                bottomLeft = 20.px,
                bottomRight =0.px
            )
        ) {
            Image(
                modifier = Modifier.size(40.px),
                src = service.icon,
                description = "icon"
            )

        }


            //text below image  which specifies icon name like andorid/ios etc
            P(
                attrs = AboutTextStyle.toModifier()
                    .fillMaxWidth()
                    .margin(top = 0.px, bottom = 10.px)
                    .fontFamily(Constants.Font_Family)
                    .fontSize(18.px)
                    .color(Theme.Secondary.rgb)
                    .fontWeight(FontWeight.Bold)
                    .toAttrs()
            ) {
                Text(service.title)
            }



            P(
                attrs = AboutTextStyle.toModifier()
                    .fillMaxWidth()
                    .margin(top = 0.px, bottom = 0.px)
                    .fontFamily(Constants.Font_Family)
                    .fontSize(15.px)
                    .color(Theme.Secondary.rgb)
                    .fontWeight(FontWeight.Normal)
                    .toAttrs()
            ) {
                Text(service.description)
            }

    }
}