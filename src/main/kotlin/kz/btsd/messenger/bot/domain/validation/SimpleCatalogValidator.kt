package kz.btsd.messenger.bot.domain.validation

import kz.btsd.messenger.bot.domain.Form
import kz.btsd.messenger.bot.domain.content.SimpleCatalog
import java.lang.IllegalStateException

class SimpleCatalogValidator {
    companion object {
        fun validate(form: Form) {
            form.findContent(SimpleCatalog::class.java) {
                it as SimpleCatalog
                it.options?.searchEnabled == true
            }?.let {
                if (form.form?.content?.size?.compareTo(1) != 0)
                    throw IllegalStateException("There should only be 1 element of the content array " +
                            "when it is a SimpleCatalog with searchEnabled: true")
            }
        }
    }
}
