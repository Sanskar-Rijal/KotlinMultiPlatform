package com.sanskar.rij.sections

import androidx.compose.runtime.Composable
import com.sanskar.rij.components.Header
import com.sanskar.rij.components.SocialBar
import com.sanskar.rij.model.Sections
import com.sanskar.rij.model.Theme
import com.sanskar.rij.style.MainButtonStyle
import com.sanskar.rij.util.Constants
import com.sanskar.rij.util.Constants.Font_Family
import com.sanskar.rij.util.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainSection(){
    Box(modifier = Modifier
        .id(Sections.Home.id)
        .maxWidth(1920.px),
        contentAlignment = Alignment.TopCenter
    ) {
        MainBackground()
        MainContent()
    }
}

@Composable
fun MainBackground(){
    Image(
        modifier = Modifier
            .fillMaxSize()
            .objectFit(objectFit = ObjectFit.Cover),  //Css property
        src = Res.Image.background,
        description = "background "
    )
}


@Composable
fun MainContent() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Header()
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SimpleGrid(
                modifier = Modifier
                    .fillMaxWidth(
                        if (breakpoint >= Breakpoint.MD)
                            80.percent
                        else
                            100.percent
                    ),
                numColumns = numColumns(base = 1, md = 2)
            ) {
                MainText(breakpoint)
                //if(breakpoint >= Breakpoint.MD)
                Photo()
            }
        }
    }
}

@Composable
fun MainText(breakpoint: Breakpoint){
    Row(horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {

       // if(breakpoint > Breakpoint.MD)
        SocialBar()

        Column(modifier = Modifier){
            P(attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(Font_Family)
                .fontSize(if(breakpoint >= Breakpoint.LG) 45.px else 30.px)
                .fontWeight(FontWeight.Normal)
                .color(Theme.Primary.rgb)
                .toAttrs()
            ){
                Text("Hello, I'm")
            }

            P(attrs = Modifier
                .margin(top = 20.px , bottom = 0.px)
                .fontFamily(Font_Family)
                .fontSize(if(breakpoint >= Breakpoint.LG) 68.px else 35.px)
                .fontWeight(FontWeight.Bolder)
                .color(Theme.Secondary.rgb)
                .toAttrs()
            ){
                Text("Sanskar Rijal")
            }

            P(attrs = Modifier
                .margin(top = 10.px , bottom = 5.px)
                .fontFamily(Font_Family)
                .fontSize(25.px)
                .fontWeight(FontWeight.Bold)
                .color(Theme.Secondary.rgb)
                .toAttrs()
            ){
                Text("Android Developer/Undergraduate Computer Engineering Student")
            }


            P(attrs = Modifier
                .margin(bottom = 25.px)
                .fontFamily(Font_Family)
                .fontSize(15.px)
                .maxWidth(400.px)
                .fontStyle(FontStyle.Italic)
                .fontWeight(FontWeight.Bold)
                .color(Theme.Secondary.rgb)
                .toAttrs()
            ){
                Text(Constants.About)
            }

            Button(attrs = MainButtonStyle.toModifier()
                .height(40.px)
                .border (width=0.px)
                .borderRadius(r=5.px)
                .backgroundColor(Theme.Primary.rgb)
                .color(Colors.White)
                .cursor(Cursor.Pointer)
                .toAttrs(),
                ) {
               Link(
                   modifier = Modifier
                       .color(Colors.White)
                       .textDecorationLine(TextDecorationLine.None),
                        text = "Hire me",
                   path = Sections.Contact.path
               )
            }
        }
    }
}


@Composable
fun Photo(){
    Column(modifier = Modifier
        .fillMaxSize(60.percent)
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom){
        Image(
            src =Res.Image.pic,
            modifier = Modifier.fillMaxSize(),
            description = "main image",
        )
    }
}
