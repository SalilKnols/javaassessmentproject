package com.knoldus.javastudio.configuration;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

//http://localhost:8082/swagger-ui/index.html --> url
@Configuration

        @OpenAPIDefinition(info =
        @Info(
                title = "",
                version = "2.1.0",
                license = @License(url = "https://www.google.com/search?channel=fs&client=ubuntu&q=knoldus+inc",  name = "KnoldusInc| Part of NashTech"),
                contact = @Contact(name = "Salil Verma", email = "salil.verma@knoldus.com")
        ))
public class SwaggerConfig {

}
