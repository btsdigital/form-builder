package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.Options
import kz.btsd.messenger.bot.domain.ValidationRules

class TextArea (
        override val id: String,
        override val type: String,
        var title: String? = null,
        var text: String? = null,
        var placeholder: String? = null,
        @JsonProperty("validations_rules")
        var validationRules: MutableList<ValidationRules>? = null,
        var options: Options? = null
) : Content
