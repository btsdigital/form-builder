package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.ValidationRules

data class Date(
        override val id: String,
        override val type: String,
        var title: String? = null,
        var placeholder: String?,
        @JsonProperty("validations_rules")
        var validationRules: MutableList<ValidationRules>? = null
) : Content
