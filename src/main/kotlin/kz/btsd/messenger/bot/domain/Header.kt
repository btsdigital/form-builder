package kz.btsd.messenger.bot.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class Header(
        var type: String,
        var title: String,
        var options: Options? = null,
        @JsonProperty("form_action")
        var formAction: FormAction? = null
)
