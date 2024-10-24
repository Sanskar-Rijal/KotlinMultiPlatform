package com.sanskar.rij.components

import androidx.compose.runtime.*
import com.sanskar.rij.model.Sections
import com.sanskar.rij.model.Theme
import com.sanskar.rij.style.NavigationItemStyle
import com.sanskar.rij.util.Constants.Font_Family
import com.sanskar.rij.util.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color.Companion.argb
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaXmark
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun OverflowMenuButton(onMenuClosed: () -> Unit){

    val scope = rememberCoroutineScope()
    val breakpoint= rememberBreakpoint()
    var translateX by remember {
        mutableStateOf((-100).percent)
    }
    var opacity by remember {
        mutableStateOf((0).percent)
    }

    LaunchedEffect(breakpoint){
        //we will animate the menu such that it will come from X position i.e -100 to  0 position
        translateX=0.percent
        opacity=100.percent
        if(breakpoint > Breakpoint.MD)
            scope.launch {
                translateX=(-100).percent
                opacity=0.percent
                delay(500)
                onMenuClosed()
            }
    }

    Column(modifier = Modifier
        .height(100.vh)//vh means view port height
        .position(Position.Fixed)
        .fillMaxWidth()
        .zIndex(2)
        .opacity(opacity)
        .backgroundColor(argb(a=0.5f , r= 0.0f, g= 0.0f,b = 0.0f))
        .transition(Transition.of(property = "opacity", duration = 500.ms, timingFunction = null, delay = null))
    )
    {
        Column(
            modifier = Modifier
                .padding(25.px)
                .fillMaxHeight()
                .width(
                    if (breakpoint < Breakpoint.MD)
                        50.percent
                    else
                        25.percent
                )
                .overflow(Overflow.Auto)
                .scrollBehavior(ScrollBehavior.Smooth)
                .backgroundColor(Theme.LightGray.rgb)
                .translateX(tx = translateX)
                .transition(
                    Transition.of(
                        property = "translate",
                        duration = 500.ms,
                        timingFunction = null,
                        delay = null
                    )
                )
        ) {

            Row(
                modifier = Modifier
                    .margin(bottom = 25.px), verticalAlignment = Alignment.CenterVertically
            ) {

                FaXmark(
                    modifier = Modifier
                        .cursor(Cursor.Pointer)
                        .margin(right = 20.px)
                        .onClick {
                            scope.launch {
                                translateX = (-100).percent
                                opacity = 0.percent
                                delay(500)
                                onMenuClosed()
                            }
                        },
                    size = IconSize.LG
                )
                Image(
                    modifier = Modifier.size(80.px),
                    src = Res.Image.logo,
                    alt = "Logo Image"
                )
            }
            Sections.entries.forEach { section ->
                Link(
                    modifier = NavigationItemStyle.toModifier()
                        .padding(right = 30.px)
                        .margin(bottom = 10.px)
                        .fontFamily(Font_Family)
                        .fontSize(16.px)
                        //.align(Alignment.CenterVertically)
                        .fontWeight(FontWeight.Normal)
                        .onClick {
                            scope.launch {
                                translateX = (-100).percent
                                opacity = 0.percent
                                delay(500)
                                onMenuClosed()
                            }
                        }
                        .textDecorationLine(TextDecorationLine.None),
                    path = section.path,
                    openExternalLinksStrategy = OpenLinkStrategy.IN_PLACE //when user click hom I want to navigate to same place
                ) {
                    P(
                        attrs = NavigationItemStyle.toModifier()
                            .margin(topBottom = 0.px)
                            .toAttrs()
                    ) {
                        Text(section.title)
                    }
                }

            }


        }

    }
}