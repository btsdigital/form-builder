package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.Options
import kz.btsd.messenger.bot.domain.ValidationRules

data class MediaPicker(
        override val id: String,
        override val type: String = "media_picker",
        var title: String,
        var options: Options? = null,
        @JsonProperty("validations_rules")
        var validationRules: MutableList<ValidationRules>? = null
) : Content
