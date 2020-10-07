package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.FormAction
import kz.btsd.messenger.bot.domain.Options

data class Button(
        override val id: String,
        override val type: String = "button",
        var title: String? = null,
        @JsonProperty("button_type")
        var buttonType: String? = null,
        var options: Options? = null,
        @JsonProperty("form_action")
        var formAction: FormAction? = null
) : Content
