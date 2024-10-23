package com.sanskar.rij.components

import androidx.compose.runtime.Composable
import com.sanskar.rij.model.Theme
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun ContactForm(breakpoint: Breakpoint){
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
            attrs = Modifier
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
            attrs = Modifier
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
        TextArea (
            attrs = Modifier
                .id("inputMessage")
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
                }
                .backgroundColor(Theme.LightGray.rgb)
                .toAttrs()
        )
    }
}