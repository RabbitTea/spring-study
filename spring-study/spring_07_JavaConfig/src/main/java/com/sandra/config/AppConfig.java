package com.sandra.config;

import com.sandra.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 配置类；
 * 替换xml配置；
 * @Configuration 标识的类也会被Spring托管;
 * @ComponentScan 与@Bean等价的另一种注入方式，参数为要扫描@Component注解的包；没写会自动扫描当前配置类所在的包；
 * @Import 与xml中的<import></import>标签相同，导入另一个配置类的配置
 */

@Configuration
@ComponentScan("com.sandra.pojo")
@Import(AppConfig2.class)
public class AppConfig {

    @Bean
    public User getUser() {
        return new User();
    }
}
