package kz.btsd.messenger.bot.domain

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import kz.btsd.messenger.bot.domain.content.Content

data class InterfaceView(
        val type: String,
        val id: String? = null,
        var content: MutableList<Content>
) {
    companion object {
        private val JSON = jacksonObjectMapper()

        init {
            JSON.setSerializationInclusion(JsonInclude.Include.NON_NULL)
        }

        fun of(json: String): InterfaceView {
            return JSON.readValue(json, InterfaceView::class.java)
        }

        fun validation(json: String): String {
            val interfaceView = InterfaceView.of(json)
            return interfaceView.toJson()
        }

    }

    fun toJson(): String {
        return InterfaceView.JSON.writeValueAsString(this)
    }
}
