package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.FormAction

class ContentType(
        override val id: String,
        override val type: String,
        var title: String,
        var alignment: String? = null,
        @JsonProperty("form_action")
        var formAction: FormAction? = null
) : Content
