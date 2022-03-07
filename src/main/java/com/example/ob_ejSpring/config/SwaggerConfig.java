package com.example.ob_ejSpring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * http://localhost:8081/swagger-ui/
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket userApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails()).select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiDetails(){
        Contact myContact = new Contact("Diabolik", "https://fragnito.neocities.org/", "davidepie90@gmail.com");
        return new ApiInfo("Spring-Boot User API REST",
                "Library API REST Docs", "1.0",
                "https://campus.open-bootcamp.com/", myContact,
                "MIT","https://campus.open-bootcamp.com/", Collections.emptyList());
    }
}
