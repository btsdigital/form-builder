package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.Options

data class UserInfo(
        override val type: String = "user_info",
        override val id: String,
        @JsonProperty("user_id")
        val userId: String,
        var options: Options? = null
) : Content
