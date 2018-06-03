package com.sopra.referentielcollab.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = { "com.sopra.referentielcollab.pojo" })
@EnableJpaRepositories(basePackages = { "com.sopra.referentielcollab.repository" })
@EnableTransactionManagement
public class RepositoryConfiguration {

}
