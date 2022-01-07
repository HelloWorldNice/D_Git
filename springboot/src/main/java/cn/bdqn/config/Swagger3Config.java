package cn.bdqn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableOpenApi
@Configuration
public class Swagger3Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30) .pathMapping("/")
                .apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("cn.bdqn.controller")) .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("毕业设计项目").version("1.0").build();
    }
}
