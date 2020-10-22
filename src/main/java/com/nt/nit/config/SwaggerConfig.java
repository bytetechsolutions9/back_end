package com.nt.nit.config;




import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket configure() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
		        .apis(RequestHandlerSelectors.basePackage("com.nt.nit.controller"))
		        .paths(PathSelectors.regex("/api.*"))
		        .build();
		        //.apiInfo(apiInfo());
		        		
		
	}
	
	  private ApiInfo apiInfo() { return new ApiInfo("NIT BOOT APP", "SIMPLE CURD",
	  "3.1", "http://nareshit.in", new Contact("RR",
	  "https://nareshit.in/","adminnit@gmail.com"), "NIT LICENCE",
	  "https://nareshit.in/",new ArrayList<>()); }
	 

}
