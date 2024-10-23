package com.sanskar.rij.style

import com.sanskar.rij.model.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val PortfolioSectionStyle = CssStyle {
    cssRule(" > #columnParent > #boxParent > #greenOverlay") {
        Modifier
            .width(0.px)
            .transition(Transition.of(property = "width", duration = 500.ms, timingFunction = null, delay = null))
    }

    cssRule(":hover > #columnParent > #boxParent > #greenOverlay") {
        Modifier.width(250.px)
    }

    cssRule(" > #columnParent > #boxParent > #greenOverlay > #linkIcon") {
        Modifier.visibility(Visibility.Hidden)
    }

    cssRule(":hover > #columnParent > #boxParent > #greenOverlay > #linkIcon") {
        Modifier.visibility(Visibility.Visible)
    }

    cssRule(" > #columnParent > #portfolioTitle") {
        Modifier
            .color(Theme.Secondary.rgb)
            .translateX(0.percent)
            .transition(
                Transition.of(property = "color", duration = 200.ms, timingFunction = null, delay = null),
                Transition.of(property = "translate", duration = 200.ms, timingFunction = null, delay = null)
            )
    }

    cssRule(":hover > #columnParent > #portfolioTitle") {
        Modifier
            .color(Theme.Primary.rgb)
            .translateX(5.percent)  //willl move the text 5% in the X axis
    }

    cssRule(" > #columnParent > #portfolioDesc") {
        Modifier
            .translateX(0.percent)
            .transition(Transition.of(property = "translate", duration = 200.ms, timingFunction = null, delay = null))
    }

    cssRule(":hover > #columnParent > #portfolioDesc") {
        Modifier.translateX(5.percent) // will move the text 5% in X axis
    }
}

val PortfolioArrowStyle = CssStyle {
    base {
        Modifier.color(Theme.Gray.rgb)
            .transition(Transition.of(property = "color", duration = 200.ms))
    }
    hover{
        Modifier.color(Theme.Primary.rgb)
    }
}