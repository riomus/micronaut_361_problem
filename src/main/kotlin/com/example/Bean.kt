package com.example

import io.micronaut.liquibase.LiquibaseConfigurationProperties
import io.micronaut.liquibase.LiquibaseMigrator
import jakarta.inject.Named
import jakarta.inject.Singleton
import org.slf4j.LoggerFactory
import javax.sql.DataSource
import javax.transaction.Transactional

@Singleton
open class Bean(
    private val migrator: LiquibaseMigrator,
    @Named("default") private val conf: LiquibaseConfigurationProperties,
    private val dataSource: DataSource,
)  {

        @Transactional
        open fun runLiquibase() {
            migrator.run(conf, dataSource)
        }

}

