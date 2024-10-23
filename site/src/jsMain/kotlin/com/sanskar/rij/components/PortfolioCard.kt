package com.sanskar.rij.components

import androidx.compose.runtime.Composable
import com.sanskar.rij.model.Portfolio
import com.sanskar.rij.model.Theme
import com.sanskar.rij.style.AboutTextStyle
import com.sanskar.rij.style.PortfolioSectionStyle
import com.sanskar.rij.util.Constants
import com.sanskar.rij.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.MoonIcon
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun PortfolioCard(
    modifier: Modifier = Modifier,
    portfolio: Portfolio,
    link:String){

    Link(
        modifier = PortfolioSectionStyle.toModifier()
        .textDecorationLine(TextDecorationLine.None),
        path = link,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB //when link is pressed it will open link  in new atb

    ){
        Column(modifier= modifier
            .id("columnParent")
            .width(Width.MaxContent)
                 ) {
            Box( modifier= Modifier
                .id("boxParent")
                .fillMaxWidth()
                .maxWidth(500.px)
                .margin (bottom = 20.px)) {

                Image(
                    modifier = Modifier
                        .height(500.px)
                        .width(250.px)
                        .objectFit(ObjectFit.Inherit),
                    src = portfolio.image,
                    description = "projects image"
                )
                Box(modifier = Modifier
                    .id("greenOverlay")
                    .fillMaxHeight()
                    .backgroundColor(com.varabyte.kobweb.compose.ui.graphics.Color.argb(a = 0.5f, r = 80, g = 216, b = 230)),
                    contentAlignment = Alignment.Center
                    //a value is the opacity
                ) {
                    Image(modifier = Modifier
                        .id("linkIcon")
                        .size(32.px),
                        src = Res.Icon.link,
                        description = "icon")
                }

            }
                P(
                    attrs = Modifier
                        .id("portfolioTitle")
                        .fillMaxWidth()
                        .margin(topBottom = 0.px)
                        .fontFamily(Constants.Font_Family)
                        .fontSize(18.px)
                        .fontWeight(FontWeight.Bold)
                        .toAttrs()
                ) {
                    Text(portfolio.title)
                }
                P(
                    attrs =Modifier
                        .id("portfolioDesc")
                        .fillMaxWidth()
                        .margin(topBottom = 0.px)
                        .fontFamily(Constants.Font_Family)
                        .fontSize(14.px)
                        .fontWeight(FontWeight.Normal)
                        .opacity(50.percent)
                        .color(Theme.Secondary.rgb)
                        .toAttrs()) {
                    Text(portfolio.title)
                }
            }
        }
    }