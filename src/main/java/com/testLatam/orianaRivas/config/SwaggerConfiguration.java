package com.testLatam.orianaRivas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.testLatam.orianaRivas.controller"))
                .build()
                .apiInfo(apiInfo());
    }

    public ApiInfo apiInfo(){
        return new ApiInfo(
                "Latam Test Oriana Rivas",
                "API REST SWAGGER",
                "v1.0",
                "",
                new Contact("latamTest", "", "oriana.rivas@zentagroup.com"),
                "License of API","API license URL", Collections.emptyList());

    }
}
