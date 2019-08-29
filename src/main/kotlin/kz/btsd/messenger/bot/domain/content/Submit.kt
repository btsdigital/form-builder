package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.FormAction
import kz.btsd.messenger.bot.domain.Options

data class Submit(
        override val id: String,
        override val type: String,
        var title: String,
        @JsonProperty("form_action")
        var formAction: FormAction,
        var options: Options? = null
) : Content
