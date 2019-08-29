package kz.btsd.messenger.bot

import kz.btsd.messenger.bot.domain.InterfaceView
import kz.btsd.messenger.bot.domain.card.CardContainer
import org.junit.Assert
import org.junit.Test

class InterfaceViewConverterTest {
    private val jsonStr = InterfaceViewConverterTest::class.java.getResource("/interfaceView.json").readText()

    @Test
    fun testJsonToInterfaceViewConversion() {
        Assert.assertEquals(InterfaceView::class, InterfaceView.of(jsonStr)::class)
    }
}