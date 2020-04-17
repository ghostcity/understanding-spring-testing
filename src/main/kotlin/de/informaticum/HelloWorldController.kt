package de.informaticum

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(path = ["/hello"])
class HelloWorldController {
    @GetMapping(path = ["/world"])
    fun greeting(): String {
        return "Hello World!"
    }
}

