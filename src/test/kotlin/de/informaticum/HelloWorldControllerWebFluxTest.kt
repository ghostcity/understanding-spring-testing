package de.informaticum

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.core.ParameterizedTypeReference
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.test.web.reactive.server.expectBody

@WebFluxTest(HelloWorldController::class)
class HelloWorldControllerWebFluxTest {
    @Test
    fun `test ping request`(@Autowired client: WebTestClient) {
        client.get().uri("/hello/world").exchange().expectStatus().isOk.expectBody<String>().isEqualTo("Hello World!")
    }
}
