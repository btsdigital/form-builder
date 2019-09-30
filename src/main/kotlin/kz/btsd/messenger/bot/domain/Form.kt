package kz.btsd.messenger.bot.domain

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import kz.btsd.messenger.bot.domain.content.Content
import kz.btsd.messenger.bot.domain.validation.SimpleCatalogValidator

data class Form(
        var form: Backdrop?
) {

    companion object {
        private val JSON = jacksonObjectMapper()

        init {
            JSON.setSerializationInclusion(JsonInclude.Include.NON_NULL)
        }

        fun of(json: String): Form {
            val form = JSON.readValue(json, Form::class.java)
            form.validate()
            return form
        }

        fun validation(json: String): String {
            val form = of(json)
            form.validate()
            return form.toJson()
        }
    }

    fun validate() {
        SimpleCatalogValidator.validate(this)
    }

    fun toJson(): String {
        this.validate()
        return JSON.writeValueAsString(this)
    }

    fun findContent(type: Class<out Content>, id: String? = null, searchCondition: SearchCondition? = null): Content? {
        return this.form?.content?.find {
            type.name.equals(it::class.java.name)
                    && (id == null || it.id == id)
                    && (searchCondition == null || searchCondition.invoke(it))
        }
    }
}

typealias SearchCondition = (content: Content) -> Boolean

