package de.informaticum

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders

class HelloWorldControllerWithManualMockMvcTest {
    private lateinit var mvc: MockMvc
    @BeforeEach
    fun initClient() {
        mvc = MockMvcBuilders.standaloneSetup(HelloWorldController()).build()
    }

    @Test
    fun `test ping request`() {
        mvc.perform(MockMvcRequestBuilders.get("/hello/world")).andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("Hello World!"))
    }
}
