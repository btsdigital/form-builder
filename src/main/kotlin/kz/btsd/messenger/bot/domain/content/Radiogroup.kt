package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.Options
import kz.btsd.messenger.bot.domain.ValidationRules

data class Radiogroup(
        override val id: String,
        override val type: String,
        @JsonInclude(JsonInclude.Include.NON_NULL)
        var title: String? = null,
        var items: MutableList<RadioItem>? = null,
        @JsonProperty("validations_rules")
        var validationRules: MutableList<ValidationRules>? = null,
        var options: Options? = null
) : Content

data class RadioItem(
        var id: String,
        var title: String? = null
)
