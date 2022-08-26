package com.example
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.micronaut.transaction.async.AsyncTransactionOperations

@MicronautTest
class DuplicatedBeansTest(private val bean: AsyncTransactionOperations<Any>): StringSpec({

    "should not fail" {
        true shouldBe true
    }
})
