package com.mingus.msa.config;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ConfigurationProperties
public class SwaggerConfig implements WebMvcConfigurer {
    @Setter
    private String dbMode;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("MSA_PLATFORM")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/**"))
                .build();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/v2/api-docs","/v2/api-docs");
        registry.addRedirectViewController("/swagger-resources/configuration/ui","/swagger-resources/configuration/ui");
        registry.addRedirectViewController("/swagger-resources/configuration/security","/swagger-resources/configuration/security");
        registry.addRedirectViewController("/swagger-resources","/swagger-resources");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/swagger-ui.html**").addResourceLocations("classpath:/META-INF/resources/swagger-ui.html");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Msa-Platform")
                .description("MsaAPIlist")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .build();
    }
}