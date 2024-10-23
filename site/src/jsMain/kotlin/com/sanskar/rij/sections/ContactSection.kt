package com.sanskar.rij.sections

import androidx.compose.runtime.Composable
import com.sanskar.rij.components.ContactForm
import com.sanskar.rij.components.SectionTitle
import com.sanskar.rij.model.Sections
import com.sanskar.rij.util.Constants.Section_Width
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ContactSection() {
    Box(
        modifier = Modifier
            .id(Sections.Contact.id)
            .padding(top = 100.px, bottom = 100.px)
            .maxWidth(Section_Width.px),
        contentAlignment = Alignment.Center
    ) {
       ContactContent()
    }
}


@Composable
fun ContactContent() {
    val breakpoint:Breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD)
                    100.percent
                else
                    90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //title for contact me
        SectionTitle(modifier = Modifier
            .fillMaxWidth()
            .margin(bottom = 25.px)
        , sections = Sections.Contact,
            alignment = Alignment.CenterHorizontally)

        ContactForm(breakpoint=breakpoint)
    }
}
