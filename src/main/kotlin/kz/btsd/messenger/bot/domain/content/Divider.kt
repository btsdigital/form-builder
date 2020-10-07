package kz.btsd.messenger.bot.domain.content

import kz.btsd.messenger.bot.domain.Options
import kz.btsd.messenger.bot.domain.card.CardContent

data class Divider(
        override val id: String? = null,
        override val type: String = "divider",
        var options: Options? = null
) : Content, CardContent
