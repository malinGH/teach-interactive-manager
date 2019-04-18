package com.teach.manager.teachmanager.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: teach-interactive-manager
 * @ClassName: SwaggerConfig
 * @description: swagger配置文件类
 * @author: malin
 * @create: 2019-04-18 16:34
 **/
@EnableSwagger2
@PropertySource("classpath:global.properties")
@Configuration
public class SwaggerConfig {

    @Value(value = "${swagger.enabled}")
    private Boolean enabled;

    @Value(value = "${swagger.title}")
    private String title;

    @Value(value = "${swagger.description}")
    private String description;

    @Value(value = "${swagger.contact}")
    private String contact;

    @Value(value = "${swagger.version}")
    private String version;

    @Value(value = "${swagger.backPackage}")
    private String backPackage;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                // 是否开启
                .enable(enabled).select()
                // 扫描的路径包
                .apis(RequestHandlerSelectors.basePackage(backPackage))
                // 指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any()).build().pathMapping("/");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                // 作者信息
                .contact(contact)
                .version(version)
                .build();
    }
}
