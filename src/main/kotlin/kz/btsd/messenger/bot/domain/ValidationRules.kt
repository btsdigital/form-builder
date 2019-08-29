package kz.btsd.messenger.bot.domain

data class ValidationRules(
        var type: String,
        var value: String,
        var error: String
)
