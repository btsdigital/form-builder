package kz.btsd.messenger.bot.domain

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.content.BottomBar
import kz.btsd.messenger.bot.domain.content.Content

data class Backdrop(
        val id: String,
        var header: Header,
        var content: MutableList<Content>,
        var options: Options? = null,
        @JsonProperty("bottom_bar")
        var bottomBar: BottomBar? = null
)
