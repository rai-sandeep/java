package com.sandeep.springboot.autoconfigure.demo;

import org.davidmoten.rxjava3.jdbc.Database;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootAutoconfigureDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAutoconfigureDemoApplication.class, args);
		// With --debug flag set, should see the below in the console if autoconfiguration worked:
		// Loading source class com.sandeep.springboot.autoconfigure.demo.SpringbootAutoconfigureDemoApplication
		// Under CONDITIONS EVALUATION REPORT -> Positive matches, should see:
		//    RxJava3JdbcDatabaseAutoConfiguration matched:
		//      - @ConditionalOnClass found required class 'org.davidmoten.rxjava3.jdbc.Database' (OnClassCondition)
	}

	@Bean
	public InitializingBean runner(Database database) {
		return () -> {
			System.out.println("Database bean found: " + database);
		};
		// If autoconfiguration worked, should see something like this in the console:
		// Database bean found: org.davidmoten.rxjava3.jdbc.Database@332f25c8
		// If autoconfiguration worked, should see bean not found error.
	}

}
