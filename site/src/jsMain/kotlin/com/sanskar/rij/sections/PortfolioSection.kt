package com.sanskar.rij.sections

import androidx.compose.runtime.Composable
import com.sanskar.rij.components.PortfolioCard
import com.sanskar.rij.components.SectionTitle
import com.sanskar.rij.model.Portfolio
import com.sanskar.rij.model.Sections
import com.sanskar.rij.style.PortfolioArrowStyle
import com.sanskar.rij.util.Constants.Section_Width
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowLeft
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowRight
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun PortfolioSection(){
    Box(modifier = Modifier
        .id(Sections.Portfolio.id)
        .padding(top =100.px , bottom = 100.px)
        .maxWidth(Section_Width.px),
        contentAlignment = Alignment.Center
    ){
        PortfolioContent()
    }
}

@Composable
fun PortfolioContent(){
    val breakpoint: Breakpoint = rememberBreakpoint()

    Column(modifier =Modifier
        .fillMaxWidth(
            if(breakpoint >= Breakpoint.MD)
                100.percent
            else
                90.percent),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        SectionTitle(
            modifier = Modifier.fillMaxWidth()
                .margin(bottom = 25.px),
            sections = Sections.Portfolio
        )

        PortfolioCards(breakpoint)
        PortfolioNavigation()
    }
}

@Composable
fun PortfolioCards(breakpoint: Breakpoint){
    Row(modifier = Modifier
        .id("scrollableContainer")
        .margin(25.px)
        .fillMaxWidth()
        .maxWidth(
            if(breakpoint >Breakpoint.MD) //if we are using larger devices
            800.px
            else if( breakpoint > Breakpoint.SM)
            525.px
            else
            275.px
        )
        .overflow(Overflow.Hidden)
        .scrollBehavior(ScrollBehavior.Smooth)
    ) {

        Portfolio.entries.forEach {port->

            PortfolioCard(modifier = Modifier.margin(right = if(port != Portfolio.Six) 25.px else 0.px),
                portfolio = port,
                link = port.link)
        }
    }
}


//for navigatin arrows
@Composable
fun  PortfolioNavigation(){

    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center) {
        //Fa means fontawesome website we can use their icons

        FaArrowLeft(
            modifier = PortfolioArrowStyle.toModifier()
                .margin(right = 40.px)
                .cursor(Cursor.Pointer)
                .onClick {
                    document
                        .getElementById("scrollableContainer")?.scrollBy(x = -275.0, y = 0.0)
                },
            size = IconSize.LG
        )

        FaArrowRight(
            modifier = PortfolioArrowStyle.toModifier()
                .cursor(Cursor.Pointer)
                .onClick {
                    document
                        .getElementById("scrollableContainer")?.scrollBy(x = 275.0, y = 0.0)
                },
            size = IconSize.LG
        )

    }

}