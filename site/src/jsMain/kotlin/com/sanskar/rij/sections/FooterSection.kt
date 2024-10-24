package com.sanskar.rij.sections

import androidx.compose.runtime.Composable
import com.sanskar.rij.model.Sections
import com.sanskar.rij.model.Theme
import com.sanskar.rij.style.NavigationItemStyle
import com.sanskar.rij.util.Constants
import com.sanskar.rij.util.Res
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import kotlin.text.Typography.section

@Composable
fun FooterSection(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .maxWidth(Constants.Section_Width.px)
        .backgroundColor(Theme.LighterGray.rgb),
        contentAlignment = Alignment.TopCenter
    ) {
        FooterContent()
    }
}


@Composable
fun FooterContent(){
    val breakpoint: Breakpoint = rememberBreakpoint()

    Column(modifier = Modifier
        .fillMaxWidth(if(breakpoint >= Breakpoint.MD)
            100.percent
        else
            90.percent)
        .maxWidth(1200.px),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Image(src = Res.Image.logo,
            description = "logo",
            modifier = Modifier.size(100.px))


        if(breakpoint > Breakpoint.SM) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {

                FooterMenu()
            }
        }
        else{
            Column (
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment =Alignment.CenterHorizontally
            ) {

                FooterMenu(false)
            }
        }
    }
}

@Composable
fun FooterMenu(row:Boolean=true) {
    Sections.entries.forEach { sec ->
        Link(
            modifier = NavigationItemStyle.toModifier()
                .fontFamily()
                .padding(right = if(row)20.px else 0.px, bottom = if (row) 5.px else 13.px)
                .fontSize(14.px)
                .textDecorationLine(TextDecorationLine.None),
            path = sec.path
        ) {
                P(
                    attrs = NavigationItemStyle.toModifier()
                        .width(75.px)
                        .toAttrs()

                ) {
                    Text(sec.title)

            }
        }
    }
}
