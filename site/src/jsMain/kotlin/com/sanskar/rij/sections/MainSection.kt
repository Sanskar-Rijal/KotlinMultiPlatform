package com.sanskar.rij.sections

import androidx.compose.runtime.Composable
import com.sanskar.rij.components.Header
import com.sanskar.rij.util.Constants.Section_Width
import com.sanskar.rij.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.maxSize
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.pc
import org.jetbrains.compose.web.css.px

@Composable
fun MainSection(){
    Box(modifier = Modifier.maxWidth(1920.px),
        contentAlignment = Alignment.TopCenter
    ) {
        MainBackground()
        Header()
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