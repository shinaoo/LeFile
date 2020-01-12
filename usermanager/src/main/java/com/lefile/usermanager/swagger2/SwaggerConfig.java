package com.lefile.usermanager.swagger2;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/").select().apis(RequestHandlerSelectors.basePackage("com.lefile.usermanager.controller"))
                .paths(PathSelectors.any()).build()
                .apiInfo(new ApiInfoBuilder().title("Manager Apis").description("test").version("0.0.1")
                        .contact(new Contact("Unknow","Unknow","Unknown"))
                        .license("Unknown").licenseUrl("Unknown").build());
    }

}
