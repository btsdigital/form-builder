package kz.btsd.messenger.bot.domain.content

import kz.btsd.messenger.bot.domain.Options

data class LabeledText (
        override val id: String,
        override val type: String,
        var label: String,
        var title: String,
        var options: Options? = null
) : Content
