package com.sandeeprai.springboot.autoconfigure.data.rxjava;

import org.davidmoten.rxjava3.jdbc.Database;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

// Use @AutoConfiguration as per
// https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.7.0-M2-Release-Notes#new-autoconfiguration-annotation
// Also, spring.factories file is deprecated and
// META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports file should be used as per
// https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.7.0-M2-Release-Notes#deprecations-in-spring-boot-27
@AutoConfiguration
@ConditionalOnClass(Database.class)
@EnableConfigurationProperties(RxJava3JdbcDatabaseProperties.class)
public class RxJava3JdbcDatabaseAutoConfiguration {

    @Bean
    public Database database(RxJava3JdbcDatabaseProperties properties) {
        return Database.nonBlocking()
                .url(properties.getUrl())
                .user(properties.getUsername())
                .password(properties.getPassword())
                .maxPoolSize(properties.getMaxPoolSize())
                .build();
    }
}
