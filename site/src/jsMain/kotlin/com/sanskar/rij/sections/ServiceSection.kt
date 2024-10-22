package com.sanskar.rij.sections

import androidx.compose.runtime.Composable
import com.sanskar.rij.components.SectionTitle
import com.sanskar.rij.components.ServiceCard
import com.sanskar.rij.model.Sections
import com.sanskar.rij.model.Service
import com.sanskar.rij.util.Constants
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ServiceSection(){
    Box(modifier = Modifier
        .id(Sections.Service.id)
        .maxWidth(Constants.Section_Width.px)
        .padding (topBottom = 150.px),
        contentAlignment = Alignment.Center) {
        ServiceContent()
    }
}

@Composable
fun ServiceContent(){

    val breakpoint:Breakpoint = rememberBreakpoint()

    Column(modifier =Modifier
        .fillMaxWidth(
            if(breakpoint >= Breakpoint.MD)
            100.percent
            else
            90.percent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //to show i'm reallly good at
        SectionTitle(modifier = Modifier
            .margin(bottom = 20.px)
            .fillMaxWidth(),
            alignment =Alignment.CenterHorizontally ,
            sections = Sections.Service)

       SimpleGrid(numColumns = numColumns(base = 1, sm = 2, md = 3)){


           Service.entries.forEach {value->
               ServiceCard(service = value)

           }
       }
    }

}