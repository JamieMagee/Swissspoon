package dk.jamiemagee.swissspoon.module1

import org.springframework.shell.standard.ShellComponent
import org.springframework.shell.standard.ShellMethod
import org.springframework.shell.standard.ShellOption

@ShellComponent
class Module1 {

    @ShellMethod("Echo a string back")
    fun echo(input: String) = input

    @ShellMethod("Add 2 numbers together")
    fun add(
            @ShellOption("First number") a: Int,
            @ShellOption("Second number") b: Int
    ): Int {
        return a + b
    }
}