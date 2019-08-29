package kz.btsd.messenger.bot.domain.additional.metadata

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

data class AdditionalMetadata(
        @JsonProperty("data_template_result")
        var dataTemplateResult: String?,
        @JsonProperty("form")
        var formContent: SubmittedForm?,
        @JsonProperty("private_data")
        var privateData: PrivateData?,
        @JsonProperty("hidden_metadata")
        var hiddenMetadata: String?,
        @JsonProperty("logging_metadata")
        var loggingMetadata: LoggingMetadata?
){
        companion object {
                private val JSON = jacksonObjectMapper()

                init {
                        JSON.setSerializationInclusion(JsonInclude.Include.NON_NULL)
                }

                fun of(json: String): AdditionalMetadata {
                        return JSON.readValue(json, AdditionalMetadata::class.java)
                }

                fun validation(json: String): String {
                        val additionalMetadata = of(json)
                        return additionalMetadata.toJson()
                }
        }

        fun toJson(): String {
                return AdditionalMetadata.JSON.writeValueAsString(this)
        }
}
