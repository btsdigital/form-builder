package kz.btsd.messenger.bot

import kz.btsd.messenger.bot.domain.Form
import kz.btsd.messenger.bot.utils.stripJson
import org.junit.Assert.*
import org.junit.Test

class JsonConverterTest {

    private val jsonStr = JsonConverterTest::class.java.getResource("/example.json").readText()
    private val form = Form.of(jsonStr)

    @Test
    fun testMapFormToJson() {
        assertEquals(jsonStr.stripJson(), form.toJson().stripJson())
    }

    @Test
    fun testJsonToFormConversion() {
        assertEquals(Form::class, Form.of(jsonStr)::class)
    }

    @Test
    fun testConversionWithoutNullValuesFromJson() {
        val form = Form.of(jsonStr)
        assertNull(form.form?.options?.fullscreen)
    }

    @Test
    fun testConversionWithoutNullValuesToJson() {
        val form = Form.of(jsonStr)
        val jsonResult = form.toJson()
        assertFalse(jsonResult.contains("null"))
    }

    @Test
    fun testConversionWithNullInJson() {
        val jsonStr = JsonConverterTest::class.java.getResource("/exampleWithNulls.json").readText()
        val form = Form.of(jsonStr)
        val jsonResult = form.toJson()
        assertFalse(jsonResult.contains("null"))
    }
}