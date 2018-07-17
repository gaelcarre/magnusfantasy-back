package fr.gaelcarre.magnusfantasy.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = { "fr.gaelcarre.magnusfantasy.pojo" })
@EnableJpaRepositories(basePackages = { "fr.gaelcarre.magnusfantasy.repository" })
@EnableTransactionManagement
public class RepositoryConfiguration {

}
