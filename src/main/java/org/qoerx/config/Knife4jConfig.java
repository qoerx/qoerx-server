package org.qoerx.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Knife4j整合Swagger3 Api接口文档配置类
 * Author: wangshuo
 * Date: 2024/12/22 上午10:46
 */
@Configuration
public class Knife4jConfig {

    /**
     * 创建了一个api接口的分组
     * 除了配置文件方式创建分组，也可以通过注册bean创建分组
     */
    @Bean
    public GroupedOpenApi QoerxApi() {
        return GroupedOpenApi.builder()
                // 分组名称
                .group("qoerx-api")
                // 接口请求路径规则
                .pathsToMatch("/**")
                // 扫描的包路径
                .packagesToScan("org.qoerx.modules")
                .build();
    }

    /**
     * 配置基本信息
     */
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        // 标题
                        .title("Qoerx Api接口文档")
                        // 描述Api接口文档的基本信息
                        .description("Qoerx后端接口服务...")
                        // 版本
                        .version("v1.0.0")
                        // 设置OpenAPI文档的联系信息，姓名，邮箱。
                        .contact(new Contact().name("wangshuo").email("18615498639@163.com"))
                );
    }
}
