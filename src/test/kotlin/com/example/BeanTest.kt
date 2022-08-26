package com.example
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.kotest.core.spec.style.StringSpec

@MicronautTest
class BeanTest(private val bean: Bean): StringSpec({

    "should not fail" {
        bean.runLiquibase()
    }
})
