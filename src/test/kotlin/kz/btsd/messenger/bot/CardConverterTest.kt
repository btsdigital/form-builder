package kz.btsd.messenger.bot

import kz.btsd.messenger.bot.domain.card.CardContainer
import org.junit.Assert
import org.junit.Test

class CardConverterTest {
    private val jsonStr = JsonConverterTest::class.java.getResource("/AllCards.json").readText()

    @Test
    fun testJsonToFormConversion() {
        Assert.assertEquals(ArrayList::class, CardContainer.of(jsonStr)::class)
    }
}