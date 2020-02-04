package de.informaticum

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@WebMvcTest(HelloWorldController::class)
class HelloWorldControllerWebMvcTest {
    @Test
    fun `test ping request`(@Autowired mvc: MockMvc) {
        mvc.perform(MockMvcRequestBuilders.get("/hello/world")).andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("Hello World!"))
    }
}
