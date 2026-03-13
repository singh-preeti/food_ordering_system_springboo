package com.food.config;



import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI foodManagementAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Food Management API")
                        .description("Spring Boot Food Ordering System")
                        .version("1.0"));
    }
}
