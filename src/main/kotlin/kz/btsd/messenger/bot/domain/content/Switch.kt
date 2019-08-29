package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.Options

data class Switch(
        override val id: String,
        override val type: String,
        var title: String? = null,
        @JsonProperty("default_state")
        var defaultState: Boolean? = true,
        var options: Options? = null
) : Content
