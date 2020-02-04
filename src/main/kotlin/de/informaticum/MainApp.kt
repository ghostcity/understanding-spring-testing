package de.informaticum

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(excludeName = ["org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration"])
class MainApp {
}
fun main(args: Array<String>) {

    runApplication<MainApp>(*args) {
        setBannerMode(Banner.Mode.LOG)
    }
}
