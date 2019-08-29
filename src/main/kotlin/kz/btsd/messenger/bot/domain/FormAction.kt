package kz.btsd.messenger.bot.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class FormAction(
        var action: String,
        @JsonProperty("data_template")
        var dataTemplate: String?,
        @JsonProperty("hidden_metadata")
        var hiddenMetadata: String?
)
