package de.informaticum

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.core.ParameterizedTypeReference
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.test.web.reactive.server.expectBody

class HelloWorldControllerWithManualWebTestClientTest {
    private var client: WebTestClient? = null
    @BeforeEach
    fun initClient() {
        client = WebTestClient.bindToController(HelloWorldController()).build()
    }

    @Test
    @Throws(Exception::class)
    fun `test ping request`() {
        client!!.get().uri("/hello/world").exchange().expectStatus().isOk.expectBody<String>().isEqualTo("Hello World!")
    }
}
