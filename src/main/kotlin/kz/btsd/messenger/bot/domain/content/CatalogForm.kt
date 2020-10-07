package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.Options
import kz.btsd.messenger.bot.domain.ValidationRules

data class CatalogForm(
        override val id: String,
        override val type: String = "catalog",
        var title: String? = null,
        var placeholder: String? = null,
        @JsonProperty("default_value")
        var defaultValue: Item? = null,
        @JsonProperty("validations_rules")
        var validationRules: MutableList<ValidationRules>? = null,
        var catalog: Catalog
) : Content {
    fun changeDefaultValue(id: String) {
        val item = this.catalog.items.find { it.id.equals(id, true) }
        if (item != null) {
            this.defaultValue = item
        }
    }
}

data class Item(
        var id: String,
        var title: String? = null,
        @JsonProperty("photo_url")
        var photoUrl: String? = null,
        var description: String? = null,
        @JsonProperty("file_metadata")
        var fileMetaData: FileMetaData? = null
)

data class Catalog(
        var options: Options,
        var items: MutableList<Item>
)

data class FileMetaData(
        @JsonProperty("file_type")
        var fileType: String,
        @JsonProperty("file_id")
        var fileId: String,
        var filename: String
)

