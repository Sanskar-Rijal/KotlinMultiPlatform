package com.sanskar.rij.style

import com.sanskar.rij.model.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.anyLink
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms

val NavigationStyle by ComponentStyle(){
    base {
        Modifier
            .color(Theme.Secondary.rgb)
            .transition(Transition.of(property = "color", duration = 200.ms, timingFunction = null, delay = null))
    }
    anyLink{
        Modifier
            .color(Theme.Secondary.rgb)
    }
    hover{
        Modifier
            .color(Theme.Primary.rgb)
    }
}

val LogoStyle by ComponentStyle{
    base {
        Modifier
            .transform {
                rotate(0.deg)
            }
            .transition(Transition.of(property = "transform", duration = 200.ms, timingFunction = null, delay = null))
    }
    hover{
        Modifier
            .transform { rotate((-10).deg) }
    }
}

val  SocialLinkStyle  by ComponentStyle{
    base {
        Modifier.color(Theme.Gray.rgb)
    }
    hover{
        Modifier.color(Theme.Primary.rgb)
    }
}