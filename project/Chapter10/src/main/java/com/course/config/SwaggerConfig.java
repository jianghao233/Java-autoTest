package com.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) 	//方法
                .pathMapping("/")  	//配置访问路径
                .select()
                .paths(PathSelectors.regex("/.*"))	//添加PathSelectors选择器与正则表达式验证路径
                .build();
    }

    private ApiInfo apiInfo() {
        return  new ApiInfoBuilder().title("我的接口文档")
                .contact(new Contact("dazhou","","42197393@qq.com"))
                .description("这是我的swaggerui生成的接口文档")
                .version("1.0.0.0")
                .build();

    }
}
