package kz.btsd.messenger.bot.domain.additional.metadata

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

data class SubmittedForm(
        val id: String,
        var content: MutableList<ContentSubmittedForm>
)

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes(
        JsonSubTypes.Type(value = CheckboxContentSubmittedForm::class, name = "checkbox"),
        JsonSubTypes.Type(value = MediaPickerContentSubmittedForm::class, name = "media_picker"),
        JsonSubTypes.Type(value = DatePickerContentSubmittedForm::class, name = "date_picker"),
        JsonSubTypes.Type(value = SwitchContentSubmittedForm::class, name = "switch"),
        JsonSubTypes.Type(value = TextAreaContentSubmittedForm::class, name = "text_area"),
        JsonSubTypes.Type(value = CatalogContentSubmittedForm::class, name = "catalog"),
        JsonSubTypes.Type(value = InputContentSubmittedForm::class, name = "input"),
        JsonSubTypes.Type(value = RadiogroupContentSubmittedForm::class, name = "radiogroup"),
        JsonSubTypes.Type(value = SliderContentSubmittedForm::class, name = "slider")
)

interface ContentSubmittedForm {
    val type: String
    val id: String
}

data class CheckboxContentSubmittedForm(
        override val type: String,
        override val id: String,
        @JsonProperty("value")
        val value: Boolean

) : ContentSubmittedForm

/*
"value": null - если значение не выбрано
OR
"value": [
"7788e259-b209-11e9-9bb7-ba2b204a0365",
"7775f9d2-b209-11e9-9f3b-0a2f1ba866bc"
] - если выбрано: массив объектов "string"
*/
data class MediaPickerContentSubmittedForm(
        override val type: String,
        override val id: String,
        @JsonProperty("value")
        val value: List<String>?
) : ContentSubmittedForm

/*
"value": "29.07.2019" - если выбрано - string в формате "DD.MM.YYYY"
OR
"value": null - если значение не выбрано
*/
data class DatePickerContentSubmittedForm(
        override val type: String,
        override val id: String,
        @JsonProperty("value")
        val value: String?
) : ContentSubmittedForm

data class SwitchContentSubmittedForm(
        override val type: String,
        override val id: String,
        @JsonProperty("value")
        val value: Boolean
) : ContentSubmittedForm

/*
"value": "text" - значение string
OR
"value": null - если никакой текст не введен
*/
data class TextAreaContentSubmittedForm(
        override val type: String,
        override val id: String,
        @JsonProperty("value")
        val value: String?
) : ContentSubmittedForm


/*
"value": "item_id" - если значение выбрано - string с id елемента
OR
"value": null - если значение не выбрано
*/
data class CatalogContentSubmittedForm(
        override val type: String,
        override val id: String,
        @JsonProperty("value")
        val value: String?
) : ContentSubmittedForm


/*
"value": "text" - значение string
OR
"value": null - если никакой текст не введен
*/
data class InputContentSubmittedForm(
        override val type: String,
        override val id: String,
        @JsonProperty("value")
        val value: String?
) : ContentSubmittedForm

/*
"value": "item_id" - если значение выбрано - string с id елемента
OR
"value": null - если значение не выбрано
*/
data class RadiogroupContentSubmittedForm(
        override val type: String,
        override val id: String,
        @JsonProperty("value")
        val value: String?
) : ContentSubmittedForm

/*
"value": "item_id" - id выбранного элемента
 ( что либо всегда выбрано т.к. иначе компонент не отобразиться у пользователя )
*/
data class SliderContentSubmittedForm(
        override val type: String,
        override val id: String,
        @JsonProperty("value")
        val value: String
) : ContentSubmittedForm
