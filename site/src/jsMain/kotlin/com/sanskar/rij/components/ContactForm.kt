package com.sanskar.rij.components

import androidx.compose.runtime.Composable
import com.sanskar.rij.model.Theme
import com.sanskar.rij.style.InputStyle
import com.sanskar.rij.style.MainButtonStyle
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.style.KobwebComposeStyleSheet.attr
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.builders.TextAreaAttrsScope
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun ContactForm(breakpoint: Breakpoint) {
    Form(action = "") {
        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs()
        )
        {
            Text("Name")
        }
        Input(
            type = InputType.Text,
            attrs = InputStyle.toModifier()
                .id("inputName")
                .classNames("form-control")
                .margin(bottom = 12.px)
                .width(
                    if (breakpoint >= Breakpoint.MD)
                        500.px
                    else
                        250.px
                )
                .attrsModifier {
                    attr("placeholder", "Sans Rijal")
                    attr("required", "true")
                }
                .backgroundColor(Theme.LightGray.rgb)
                .toAttrs()
        )

        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs()
        )
        {
            Text("Email")
        }
        Input(
            type = InputType.Text,
            attrs = InputStyle.toModifier()
                .id("inputEmail")
                .classNames("form-control")
                .margin(bottom = 12.px)
                .width(
                    if (breakpoint >= Breakpoint.MD)
                        500.px
                    else
                        250.px
                )
                .attrsModifier {
                    attr("placeholder", "xyz@gmail.com")
                    attr("required", "true")
                }
                .backgroundColor(Theme.LightGray.rgb)
                .toAttrs()
        )

        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs()
        )
        {
            Text("Message")
        }
        TextArea(
            attrs = InputStyle.toModifier()
                .id("inputMessage")
                .height(180.px)
                .classNames("form-control")
                .margin(bottom = 20.px)
                .width(
                    if (breakpoint >= Breakpoint.MD)
                        500.px
                    else
                        250.px
                )
                .attrsModifier {
                    attr("placeholder", "Your Messge")
                    attr("required", "true")
                }
                .backgroundColor(Theme.LightGray.rgb)
                .toAttrs()
        )

        //addding submit button
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Button(
                attrs = MainButtonStyle.toModifier()
                    .height(40.px)
                    .border(width = 0.px)
                    .borderRadius(r = 5.px)
                    .backgroundColor(Theme.Primary.rgb)
                    .color(Colors.White)
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Text("Submit")
            }
        }
    }
}