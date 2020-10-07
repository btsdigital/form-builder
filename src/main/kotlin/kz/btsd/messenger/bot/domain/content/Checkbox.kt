package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.Options
import kz.btsd.messenger.bot.domain.ValidationRules

data class Checkbox(
        override val id: String,
        override val type: String = "checkbox",
        var title: String,
        @JsonProperty("default_state")
        var defaultState: Boolean? = true,
        @JsonProperty("validations_rules")
        var validationRules: MutableList<ValidationRules>? = null,
        var options: Options? = null
) : Content
