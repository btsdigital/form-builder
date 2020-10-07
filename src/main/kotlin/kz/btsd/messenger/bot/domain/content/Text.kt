package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.FormAction
import kz.btsd.messenger.bot.domain.Options
import kz.btsd.messenger.bot.domain.card.CardContent

data class Text(
        override val id: String? = null,
        override val type: String = "text",
        var title: String,
        var options: Options? = null,
        @JsonProperty("form_action")
        var formAction: FormAction? = null,
        @JsonProperty("text_color")
        var textColor: String? = null
) : Content, CardContent
