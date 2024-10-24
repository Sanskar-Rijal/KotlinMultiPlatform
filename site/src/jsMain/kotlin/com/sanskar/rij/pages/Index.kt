package com.sanskar.rij.pages

import androidx.compose.runtime.*
import com.sanskar.rij.components.BackToTopButton
import com.sanskar.rij.components.OverflowMenuButton
import com.sanskar.rij.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Footer


@Page
@Composable
fun HomePage() {

    var menuOpened by remember{
        mutableStateOf(false)
    }

 Box(modifier = Modifier.fillMaxSize()) {
     Column(modifier = Modifier
         .fillMaxSize(),
         verticalArrangement = Arrangement.Top,
         horizontalAlignment = Alignment.CenterHorizontally) {
         MainSection(onMenuClicked = {
             menuOpened=true
         })
         AboutSection()
         ServiceSection()
         PortfolioSection()
         ContactSection()
         FooterSection()
     }
     BackToTopButton()
     if (menuOpened){
         OverflowMenuButton(onMenuClosed = {
             menuOpened=false
         })
     }
 }
}
