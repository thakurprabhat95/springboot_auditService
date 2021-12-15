package com.audit.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class AuditSwaggerConfig   {
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("audit service").apiInfo(apiInfo()).select()
				.paths(regex("/api/v1/audit.*")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("audit Service")
				.description("Sample Documentation Generateed Using SWAGGER2 for our audit service Rest API")
			.build();
	}
	
	
	 
}
