package dk.jamiemagee.swissspoon

import mu.KotlinLogging
import org.jline.utils.AttributedString
import org.jline.utils.AttributedStyle
import org.jline.utils.AttributedStyle.DEFAULT
import org.jline.utils.AttributedStyle.YELLOW
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.annotation.Bean
import org.springframework.shell.jline.PromptProvider


private val logger = KotlinLogging.logger {}

@SpringBootApplication
class Swissspoon {

    @Bean
    fun promptProvider() = PromptProvider {
        AttributedString("swissspoon:>", DEFAULT.foreground(YELLOW))
    }
}

fun main(args: Array<String>) {
    SpringApplicationBuilder()
            .bannerMode(Banner.Mode.CONSOLE)
            .sources(Swissspoon::class.java)
            .logStartupInfo(false)
            .run()
}
