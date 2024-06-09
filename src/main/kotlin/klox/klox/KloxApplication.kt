package klox.klox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KloxApplication

fun main(args: Array<String>) {
	runApplication<KloxApplication>(*args)
}
