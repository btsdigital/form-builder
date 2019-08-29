package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonTypeInfo.As
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id
import kz.btsd.messenger.bot.domain.card.CardContainer


@JsonTypeInfo(use = Id.NAME, include = As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = CardContainer::class, name = "custom_container"),
    JsonSubTypes.Type(value = BottomBar::class, name = "bottom_bar"),
    JsonSubTypes.Type(value = Date::class, name = "date_time"),
    JsonSubTypes.Type(value = Divider::class, name = "divider"),
    JsonSubTypes.Type(value = Image::class, name = "image"),
    JsonSubTypes.Type(value = Input::class, name = "input"),
    JsonSubTypes.Type(value = ItemInfo::class, name = "item_info"),
    JsonSubTypes.Type(value = LabeledText::class, name = "labeled_text"),
    JsonSubTypes.Type(value = MediaPicker::class, name = "media_picker"),
    JsonSubTypes.Type(value = TextArea::class, name = "text_area"),
    JsonSubTypes.Type(value = SimpleCatalog::class, name = "simple_catalog"),
    JsonSubTypes.Type(value = Submit::class, name = "submit"),
    JsonSubTypes.Type(value = Text::class, name = "text"),
    JsonSubTypes.Type(value = CatalogForm::class, name = "catalog"),
    JsonSubTypes.Type(value = UserInfo::class, name = "user_info"),
    JsonSubTypes.Type(value = Button::class, name = "button"),
    JsonSubTypes.Type(value = Switch::class, name = "switch"),
    JsonSubTypes.Type(value = Checkbox::class, name = "checkbox"),
    JsonSubTypes.Type(value = DatePicker::class, name = "date_picker"),
    JsonSubTypes.Type(value = Slider::class, name = "slider"),
    JsonSubTypes.Type(value = Radiogroup::class, name = "radiogroup"),
    JsonSubTypes.Type(value = ContentType::class, name = "content_type")
])

interface Content {
    val type: String
    val id: String?
}
