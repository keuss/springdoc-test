package com.example.swagger.test.swaggertest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;


@Configuration
@OpenAPIDefinition(info = @Info(title = "REST API", version = "1.0",
        description = "REST API description...",
        contact = @Contact(name = "Guillaume GALLOIS"))
)
public class Oas3Config {

    // https://www.baeldung.com/spring-rest-openapi-documentation
    // https://stackoverflow.com/questions/74614369/how-to-run-swagger-3-on-spring-boot-3
    // https://springdoc.org/
    // http://localhost:8080/v3/api-docs
    // http://localhost:8080/v3/api-docs.yaml
    // http://localhost:8080/swagger-ui/index.html
}
