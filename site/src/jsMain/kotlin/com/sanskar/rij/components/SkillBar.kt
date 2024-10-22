package com.sanskar.rij.components

import androidx.compose.runtime.Composable
import com.sanskar.rij.model.Theme
import com.sanskar.rij.util.Constants.Font_Family
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun SkillBar(
    title:String,
    index:Int,
    percentage:CSSSizeValue<CSSUnit.percent> = 50.percent,
    progressBarHeight:CSSSizeValue<CSSUnit.px> =5.px,
    animatedPercentage:Int){

    Column(modifier = Modifier
        .fillMaxWidth()
        .maxWidth(500.px)
        .padding (top = 5.px , bottom = 5.px)) {

        Row(modifier = Modifier
            .margin(bottom = 5.px)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween) {

            P(
                attrs = Modifier
                    .fontFamily(Font_Family)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text(title)
            }
            P(
                attrs = Modifier
                    .fontFamily(Font_Family)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text("$animatedPercentage %")
            }
        }

            Box(modifier =  Modifier.fillMaxWidth()) {
                Box(modifier = Modifier
                    .height(progressBarHeight)
                    .fillMaxWidth()
                    .backgroundColor(Theme.LightGray.rgb))

                Box(modifier = Modifier
                    .height(progressBarHeight)
                    .fillMaxWidth(percentage)
                    .backgroundColor(Theme.Primary.rgb)
                    .transition(
                        Transition.of(
                            property = "width",
                            duration = 1000.ms,
                            timingFunction = null,
                            delay = 100.ms * index
                        )
                    ))
            }

    }
}