package kz.btsd.messenger.bot.domain.card

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import kz.btsd.messenger.bot.domain.FormAction
import kz.btsd.messenger.bot.domain.Options
import kz.btsd.messenger.bot.domain.content.Content
import kz.btsd.messenger.bot.domain.content.FileMetaData
import kz.btsd.messenger.bot.domain.utils.toJson

data class CardContainer(
        override val type: String,
        override val id: String? = null,
        var options: Options? = null,
        @JsonProperty("form_action")
        var formAction: FormAction? = null,
        @JsonProperty("file_metadata")
        var fileMetaData: FileMetaData? = null,
        var content: MutableList<CardContent>? = null
) : CardContent, Content {
    companion object {
        private val JSON = jacksonObjectMapper()

        init {
            JSON.setSerializationInclusion(JsonInclude.Include.NON_NULL)
        }

        fun of(json: String): List<CardContainer> {
            return JSON.readValue(json, object : TypeReference<List<CardContainer>>() {})
        }

        fun validation(json: String): String {
            val list = of(json)
            return list.toJson()
        }
    }

    fun toJsonObject(): String {
        return JSON.writeValueAsString(this)
    }

    fun toJson(): String {
        return "[${JSON.writeValueAsString(this)}]"
    }

}
