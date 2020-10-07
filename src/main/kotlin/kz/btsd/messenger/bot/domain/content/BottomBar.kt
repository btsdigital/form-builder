package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.FormAction

data class BottomBar(
        override val id: String,
        override val type: String = "bottom_bar",
        var title: String,
        @JsonProperty("form_action")
        var formAction: FormAction
) : Content
