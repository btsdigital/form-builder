package kz.btsd.messenger.bot.domain.utils

import kz.btsd.messenger.bot.domain.card.CardContainer

fun List<CardContainer>.toJson(): String {
    return "[${this.map { it.toJsonObject() }.joinToString(",")}]"
}
