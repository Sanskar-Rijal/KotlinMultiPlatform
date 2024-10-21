package com.sanskar.rij.sections

import androidx.compose.runtime.Composable
import com.sanskar.rij.components.SectionTitle
import com.sanskar.rij.components.SkillBar
import com.sanskar.rij.model.Sections
import com.sanskar.rij.model.Skill
import com.sanskar.rij.model.Theme
import com.sanskar.rij.style.AboutImageStyle
import com.sanskar.rij.style.AboutTextStyle
import com.sanskar.rij.util.Constants
import com.sanskar.rij.util.Constants.Font_Family
import com.sanskar.rij.util.Constants.Section_Width
import com.sanskar.rij.util.Res
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.SimpleGridStyle
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutSection(){
    Box(modifier = Modifier
        .id(Sections.About.id)
        .padding(top =100.px , bottom = 100.px)
        .maxWidth(Section_Width.px),
        contentAlignment = Alignment.Center
    ) {
        AboutContent()
    }
}

@Composable
fun AboutContent(){
    val breakpoint:Breakpoint = rememberBreakpoint()

    Column(modifier = Modifier
        .fillMaxWidth(if(breakpoint >= Breakpoint.MD)
            100.percent
        else
            90.percent)
        .maxWidth(1200.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        SimpleGrid(modifier = Modifier
            .fillMaxWidth(
                if(breakpoint >= Breakpoint.MD)
                    90.percent
                else
                    100.percent
            ),
            numColumns= numColumns(base = 1, md = 2)){

            if(breakpoint >= Breakpoint.MD){
                //about image
                AboutImage()
            }
            //about me section

            AboutMe(breakpoint)

        }

    }
}

//for image
@Composable
fun AboutImage(){
    Box(modifier = AboutImageStyle.toModifier(),
        contentAlignment = Alignment.Center) {


        Image(src = Res.Image.money ,
            description = "About image",
            modifier = Modifier.fillMaxSize(80.percent))
    }
}


//for text
@Composable
fun AboutMe(breakpoint:Breakpoint){
    Column(modifier = Modifier
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center){

        SectionTitle(sections = Sections.About
        , alignment = Alignment.CenterHorizontally)

        P(attrs = AboutTextStyle.toModifier()
            .margin(topBottom = 20.px)
            .maxWidth(500.px)
            .fontFamily(Font_Family)
            .fontSize(
                if (breakpoint >= Breakpoint.MD)
                    45.px
                else
                    20.px)
            .color(Theme.Secondary.rgb)
            .fontSize(20.px)
            .fontStyle(FontStyle.Italic)
            .fontWeight(FontWeight.Normal)
            .toAttrs()) {
            Text( Constants.hireme)
        }

        Skill.values().forEach {skill ->
            SkillBar(title = skill.title,
                 percentage = skill.percentage,
                index = skill.ordinal)
        }

    }
}
