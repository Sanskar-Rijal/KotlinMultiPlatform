package com.sanskar.rij.pages

import androidx.compose.runtime.*
import com.sanskar.rij.sections.AboutSection
import com.sanskar.rij.sections.MainSection
import com.sanskar.rij.sections.ServiceContent
import com.sanskar.rij.sections.ServiceSection
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page


@Page
@Composable
fun HomePage() {
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        MainSection()
        AboutSection()
        ServiceSection()
    }
}
