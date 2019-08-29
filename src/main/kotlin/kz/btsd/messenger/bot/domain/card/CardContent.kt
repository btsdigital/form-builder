package kz.btsd.messenger.bot.domain.card

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import kz.btsd.messenger.bot.domain.content.Text
import kz.btsd.messenger.bot.domain.content.Divider
import kz.btsd.messenger.bot.domain.content.Image

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type", visible = true
)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = CardContainer::class, name = "custom_container"),
    JsonSubTypes.Type(value = CardContainer::class, name = "card_container"),
    JsonSubTypes.Type(value = Text::class, name = "text"),
    JsonSubTypes.Type(value = Divider::class, name = "divider"),
    JsonSubTypes.Type(value = Image::class, name = "image")
])

interface CardContent
