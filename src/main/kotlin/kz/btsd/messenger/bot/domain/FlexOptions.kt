package kz.btsd.messenger.bot.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class FlexOptions(
        @JsonProperty("flex_grow")
        var flexGrow: Double? = null,
        @JsonProperty("flex_basis")
        var flexBasis: Double? = null,
        @JsonProperty("flex_direction")
        var flexDirection: String? = null,
        @JsonProperty("flex_wrap")
        var flexWrap: String? = null,
        @JsonProperty("align_items")
        var alignItems: String? = null,
        @JsonProperty("align_self")
        var alignSelf: String? = null,
        @JsonProperty("justify_content")
        var justifyContent: String? = null
)
