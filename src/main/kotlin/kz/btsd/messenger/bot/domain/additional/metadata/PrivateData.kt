package kz.btsd.messenger.bot.domain.additional.metadata

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes(
        JsonSubTypes.Type(value = PhonePrivateData::class, name = "phone_number"),
        JsonSubTypes.Type(value = GeoPrivateData::class, name = "geo")
)
interface PrivateData

data class PhonePrivateData(
        @JsonProperty("value")
        val value: Phone?
) : PrivateData

data class GeoPrivateData(
        @JsonProperty("value")
        val value: Geo?
) : PrivateData

data class Phone(
        @JsonProperty("phone_number")
        val phoneNumber: String?,
        @JsonProperty("metadata")
        val metadata: String?
)
data class Geo(
        @JsonProperty("latitude")
        val latitude: Double?,
        @JsonProperty("longitude")
        val longitude: Double?,
        @JsonProperty("metadata")
        val metadata: String?
)
