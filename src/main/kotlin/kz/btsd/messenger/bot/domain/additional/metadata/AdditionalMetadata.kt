package kz.btsd.messenger.bot.domain.additional.metadata

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.lang.Exception

data class AdditionalMetadata(
        @JsonProperty("data_template_result")
        var dataTemplateResult: String? = null,
        @JsonProperty("form")
        var formContent: SubmittedForm? = null,
        @JsonProperty("private_data")
        var privateData: PrivateData? = null,
        @JsonProperty("hidden_metadata")
        var hiddenMetadata: String? = null,
        @JsonProperty("logging_metadata")
        var loggingMetadata: LoggingMetadata? = null
) {
    companion object {
        private val JSON = jacksonObjectMapper()

        init {
            JSON.setSerializationInclusion(JsonInclude.Include.NON_NULL)
        }

        fun of(json: String): AdditionalMetadata {
            return JSON.readValue(json, AdditionalMetadata::class.java)
        }

        fun ofOrNull(json: String): AdditionalMetadata? {
            return try {
                this.of(json)
            } catch (e: Exception) {
                null
            }
        }
    }

    fun toJson(): String {
        return AdditionalMetadata.JSON.writeValueAsString(this)
    }
}
