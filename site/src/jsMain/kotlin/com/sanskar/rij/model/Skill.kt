package com.sanskar.rij.model

import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.percent

enum class Skill(  val title: String,
                   val percentage: CSSSizeValue<CSSUnit.percent>
) {
    Creative(
        title = "Creative",
        percentage = 95.percent
    ),
    Accountable(
        title = "Accountable",
        percentage = 80.percent
    ),
    HardWorking(
        title = "Hard Working",
        percentage = 95.percent
    ),
    Value(
        title = "Value for Money",
        percentage = 85.percent
    ),
    Delivery(
        title = "On-Time Delivery",
        percentage = 60.percent
    )}