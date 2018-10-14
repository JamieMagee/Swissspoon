package dk.jamiemagee.swissspoon.module2

import mu.KotlinLogging
import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod
import java.io.File

private val logger = KotlinLogging.logger {}


@ShellComponent
class Module2 {

    @ShellMethod("Log some stuff to STDOUT")
    fun logSomething(): Unit {
        logger.info { "Aren't logs fun?" }
    }

    @ShellMethod("Load a file")
    fun loadFile(file: File): String {
        return file.readText()
    }
}
