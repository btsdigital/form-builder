package kz.btsd.messenger.bot.domain.content

import kz.btsd.messenger.bot.domain.Options

data class Slider(
        override val id: String? = null,
        override val type: String = "slider",
        var options: Options? = null,
        var items: MutableList<Item>
) : Content
