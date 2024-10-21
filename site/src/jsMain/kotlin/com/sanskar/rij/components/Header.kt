package com.sanskar.rij.components

import androidx.compose.runtime.Composable
import com.sanskar.rij.model.Sections
import com.sanskar.rij.model.Theme
import com.sanskar.rij.style.LogoStyle
import com.sanskar.rij.style.NavigationItemStyle
import com.sanskar.rij.util.Constants.Font_Family
import com.sanskar.rij.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun Header(){


    //creating state to make it responsive
    val breakpoint = rememberBreakpoint()

    Row(
        modifier = Modifier
            .fillMaxWidth(if(breakpoint>Breakpoint.MD)80.percent else 90.percent ) //it will cover only 80%
            .margin(topBottom = 50.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        LeftSide(breakpoint)
        if(breakpoint > Breakpoint.MD)
        RightSide()
    }
}

@Composable
fun LeftSide(breakpoint: Breakpoint){

    Row(verticalAlignment = Alignment.CenterVertically) {
        if( breakpoint <= Breakpoint.MD) {
            FaBars(   //when device is mobile or sth then it will show 3 bars to display
                modifier = Modifier.margin { right(15.px) },
                size = IconSize.XL
            )
        }
        Image(
            src = Res.Image.logo ,
            modifier = LogoStyle.toModifier(),
            description = "logo"
        )
    }
}
@Composable
fun RightSide() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .borderRadius(r = 50.px)
            .backgroundColor(Theme.LighterGray.rgb)
            .padding(all = 20.px),
        horizontalArrangement = Arrangement.End
    ) {
        Sections.entries.toTypedArray().take(6).forEach { section ->
            Link(
                modifier = NavigationItemStyle.toModifier()
                    .padding(right = 30.px)
                    .fontFamily(Font_Family)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal)
                    .textDecorationLine(TextDecorationLine.None)
                ,
                text = section.title,
                path = section.path
            )
        }
    }
}
