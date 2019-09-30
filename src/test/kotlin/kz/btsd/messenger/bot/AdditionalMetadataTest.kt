package kz.btsd.messenger.bot

import kz.btsd.messenger.bot.domain.additional.metadata.AdditionalMetadata
import org.junit.Test

class AdditionalMetadataTest {

    private val json = AdditionalMetadataTest::class.java.getResource("/additionalMetadata.json").readText()

    @Test(expected = Test.None::class)
    fun additionalMetadataOfTest() {
        AdditionalMetadata.of(json)
    }

    @Test(expected = Test.None::class)
    fun additionalMetadataToJsonTest() {
        val additionalMetadata = AdditionalMetadata.of(json)
        additionalMetadata.toJson()
    }
}
