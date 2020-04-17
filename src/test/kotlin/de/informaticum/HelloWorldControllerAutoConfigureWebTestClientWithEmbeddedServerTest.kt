package de.informaticum

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.core.ParameterizedTypeReference
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.test.web.reactive.server.expectBody

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, properties = ["spring.main.web-application-type=reactive"])
@AutoConfigureWebTestClient
class HelloWorldControllerAutoConfigureWebTestClientWithEmbeddedServerTest {
    @Test
    fun `test ping request`(@Autowired client: WebTestClient) {
        client.run {
            get().uri("/hello/world").exchange().expectStatus().isOk.expectBody<String>().isEqualTo("Hello World!")
        }
    }
}
