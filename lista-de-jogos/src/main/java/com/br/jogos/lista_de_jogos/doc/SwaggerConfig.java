package com.br.jogos.lista_de_jogos.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.spel.ast.OpAnd;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI swagger(){
        return new OpenAPI()
                .info(new Info()
                        .title("lista de jogos")
                        .version("1.0")
                        .description("Site de busca de jogos, lista com mais de 100 jogos")
                        .contact(new Contact()
                                .name("hui ling")
                                .url("https://www.seusite.com")
                                .email("vitinhomiguel80@gmail.com")
                        )
                );
    }


}