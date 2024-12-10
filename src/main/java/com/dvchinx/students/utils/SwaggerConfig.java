package com.dvchinx.students.utils;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Student API Rest",
                version = "1.0.0",
                description = "API for managing students",
                contact = @Contact(
                        name = "API Support",
                        email = "support@dvchinx.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html"
                )
        ),
        servers = {
                @Server(
                        url = "http://localhost:8080/v1/api/",
                        description = "Home page for the application"
                ),
                @Server(
                        url = "jdbc:postgresql://localhost:5432/school",
                        description = "PostgreSQL Data Base"
                ),
                @Server(
                        url = "http://localhost:8080/swagger-ui/index.html",
                        description = "Documentation URL for swagger"
                )
        }

)
public class SwaggerConfig {}