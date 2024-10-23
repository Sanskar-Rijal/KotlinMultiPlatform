package com.sanskar.rij.sections

import androidx.compose.runtime.Composable
import com.sanskar.rij.model.Sections
import com.sanskar.rij.util.Constants.Section_Width
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.px

@Composable
fun ContactSections() {
    Box(
        modifier = Modifier
            .id(Sections.Contact.id)
            .padding(top = 100.px, bottom = 100.px)
            .maxWidth(Section_Width.px),
        contentAlignment = Alignment.Center
    ) {

    }
}

