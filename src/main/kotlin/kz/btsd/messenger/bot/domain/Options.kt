package kz.btsd.messenger.bot.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class Options(
        var title: String? = null,
        var fullscreen: Boolean? = null,
        var type: String? = null,
        @JsonProperty("item_type")
        var itemType: String? = null,
        @JsonProperty("columns_count")
        var columnsCount: Int? = null,
        @JsonProperty("search_enabled")
        var searchEnabled: Boolean? = null,
        var closeable: Boolean? = null,
        @JsonProperty("media_type")
        var mediaType: String? = null,
        @JsonProperty("choice_type")
        var choiceType: String? = null,
        @JsonProperty("text_size")
        var textSize: String? = null,
        @JsonProperty("max_count")
        var maxCount: Int? = null,
        @JsonProperty("max_length")
        var maxLength: Int? = null,
        @JsonProperty("text_style")
        var textStyle: String? = null,
        @JsonProperty("text_color")
        var textColor: String? = null,
        var width: Int? = null,
        var height: Int? = null,
        @JsonProperty("show_divider")
        var showDivider: Boolean? = null,
        @JsonProperty("item_right_icon_resource")
        var itemRightIconResource: String? = null,
        var shape: String? = null,
        @JsonProperty("indent_inner")
        var indentInner: Indent? = null,
        @JsonProperty("indent_outer")
        var indentOuter: Indent? = null,
        @JsonProperty("input_type")
        var inputType: String? = null,
        @JsonProperty("should_open_editor")
        var shouldOpenEditor: Boolean? = null,
        @JsonProperty("background_color")
        var backgroundColor: String? = null,
        @JsonProperty("item_left_icon_resource")
        var itemLeftIconResource: String? = null,
        @JsonProperty("flex_options")
        var flexOptions: FlexOptions? = null,
        var background: String? = null,
        var alignment: String? = null,
        @JsonProperty("divider_type")
        var dividerType: String? = null,
        @JsonProperty("has_back_action")
        var hasBackAction: Boolean? = null,
        var orientation: String? = null,
        var currency: String? = null,
        @JsonProperty("min_date")
        var minDate: String? = null,
        @JsonProperty("max_date")
        var maxDate: String? = null,
        @JsonProperty("title_lines_count")
        var titleLinesCount: Int? = null,
        @JsonProperty("subtitle_lines_count")
        var subtitleLinesCount: Int? = null
)
