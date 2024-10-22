package com.sanskar.rij.sections

import androidx.compose.runtime.Composable
import com.sanskar.rij.components.PortfolioCard
import com.sanskar.rij.components.SectionTitle
import com.sanskar.rij.model.Portfolio
import com.sanskar.rij.model.Sections
import com.sanskar.rij.util.Constants.Section_Width
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
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
    }
}

@Composable
fun PortfolioCards(breakpoint: Breakpoint){
    Row(modifier = Modifier
        .fillMaxWidth()
        .maxWidth(
            if(breakpoint >Breakpoint.MD) //if we are using larger devices
            800.px
            else if( breakpoint > Breakpoint.SM)
            525.px
            else
            300.px
        )
        .overflow(Overflow.Hidden)
        .scrollBehavior(ScrollBehavior.Smooth)
    ) {


        Portfolio.entries.forEach {port->

            PortfolioCard(modifier = Modifier.margin(right = 25.px),
                portfolio = port,
                link = port.link)
        }
    }
}