package com.ards.heru.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swager {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.ards.heru.controller"))
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(apiEndPointsInfo());
    }

    public ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("Corona Virus Indonesia")
                .description("Information Corona Virus Indonesia")
                .license("Ards 16.02")
                .licenseUrl("https://www.facebook.com/cah.punk.7399/")
                .version("1.0.0")
                .contact(new Contact("Heru ardiansah", "https://www.facebook.com/cah.punk.7399/", "Ardiansyah.ha99@gmail.com"))
                .build();
    }
}
