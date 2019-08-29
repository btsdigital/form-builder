package kz.btsd.messenger.bot.utils

fun String.stripJson() = this.replace(Regex("\\s+"), "")