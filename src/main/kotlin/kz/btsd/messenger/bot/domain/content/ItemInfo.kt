package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.Options

data class ItemInfo(
        override val id: String,
        override val type: String = "item_info",
        @JsonProperty("photo_url")
        var photoUrl: String? = null,
        var title: String,
        var subtitle: String? = null,
        @JsonProperty("file_metadata")
        var fileMetaData: FileMetaData?,
        var options: Options? = null
) : Content
