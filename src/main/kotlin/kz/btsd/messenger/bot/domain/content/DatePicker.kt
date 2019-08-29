package kz.btsd.messenger.bot.domain.content

import com.fasterxml.jackson.annotation.JsonProperty
import kz.btsd.messenger.bot.domain.Options

data class DatePicker(
        override val id: String,
        override val type: String,
        var title: String? = null,
        var placeholder: String? = null,
        @JsonProperty("selected_date")
        var selectedDate: String? = null,
        var options: Options? = null
) : Content
