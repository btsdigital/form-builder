package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.ValidationRules

data class Date(
        override val id: String,
        override val type: String = "date_time",
        var title: String? = null,
        var placeholder: String? = null,
        @JsonProperty("validations_rules")
        var validationRules: MutableList<ValidationRules>? = null
) : Content
