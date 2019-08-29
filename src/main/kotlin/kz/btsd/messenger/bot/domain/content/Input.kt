package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.Options
import kz.btsd.messenger.bot.domain.ValidationRules

data class Input(
        override val id: String,
        override val type: String,
        @JsonInclude(JsonInclude.Include.NON_NULL)
        var title: String? = null,
        var text: String? = null,
        var placeholder: String? = null,
        var mask: String? = null,
        @JsonProperty("default_state")
        var defaultState: Boolean? = null,
        @JsonProperty("validations_rules")
        var validationRules: MutableList<ValidationRules>? = null,
        var options: Options? = null
) : Content
