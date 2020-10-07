package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.FormAction
import kz.btsd.messenger.bot.domain.Options

data class SimpleCatalog(
        override val id: String,
        override val type: String = "simple_catalog",
        var options: Options? = null,
        var items: MutableList<Item>
) : Content {
    data class Item(
            val id: String,
            @JsonProperty("photo_url")
            var photoUrl: String? = null,
            var title: String? = null,
            var subtitle: String? = null,
            var description: String? = null,
            @JsonProperty("form_action")
            var formAction: FormAction? = null,
            @JsonProperty("file_metadata")
            var fileMetaData: FileMetaData? = null,
            @JsonProperty("item_buttons")
            var itemButtons: MutableList<ItemButton>? = null,
            var options: Options? = null

    )

    data class ItemButton(
            var title: String,
            @JsonProperty("form_action")
            var formAction: FormAction
    )
}
