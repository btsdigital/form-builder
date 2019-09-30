package kz.btsd.messenger.bot

import kz.btsd.messenger.bot.domain.Form
import kz.btsd.messenger.bot.utils.stripJson
import org.junit.Assert.*
import org.junit.Test
import java.lang.IllegalStateException

class ValidationSimpleCatalogTest {

    private val jsonWithError = ValidationSimpleCatalogTest::class.java.getResource("/ValidationSimpleCatalogWithError.json").readText()

    private val jsonWithoutError = ValidationSimpleCatalogTest::class.java.getResource("/ValidationSimpleCatalogWithoutError.json").readText()

    @Test(expected = IllegalStateException::class)
    fun validationFormWithError() {
        Form.of(jsonWithError)
    }

    @Test(expected = Test.None::class)
    fun validationFormWithoutError() {
        Form.of(jsonWithoutError)
    }

}