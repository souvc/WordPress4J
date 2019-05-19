package com.wordpress4j.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author souvc
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.wordpress4j.repository")
@EntityScan(basePackages = {"com.wordpress4j.entity"})
@EnableTransactionManagement
public class JpaConfig {

}
