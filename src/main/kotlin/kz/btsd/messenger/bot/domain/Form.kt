package kz.btsd.messenger.bot.domain

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

data class Form(
        var form: Backdrop?
) {

    companion object {
        private val JSON = jacksonObjectMapper()

        init {
            JSON.setSerializationInclusion(JsonInclude.Include.NON_NULL)
        }

        fun of(json: String): Form {
            return JSON.readValue(json, Form::class.java)
        }

        fun validation(json: String): String {
            val form = of(json)
            return form.toJson()
        }
    }

    fun toJson(): String {
        return JSON.writeValueAsString(this)
    }
}
