package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.FormAction
import kz.btsd.messenger.bot.domain.Options
import kz.btsd.messenger.bot.domain.card.CardContent

data class Image(
        override val id: String? = null,
        override val type: String,
        @JsonProperty("photo_url")
        var photoUrl: String? = null,
        @JsonProperty("file_metadata")
        var fileMetaData: FileMetaData,
        var options: Options? = null,
        @JsonProperty("form_action")
        var formAction: FormAction? = null
) : Content, CardContent
