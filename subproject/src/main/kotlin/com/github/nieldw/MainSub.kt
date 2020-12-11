package com.github.nieldw

import org.kodein.di.*

fun main() {
    val di = DI {
        // TODO : Fix JVM target warning
        bind<Service>() with singleton { ServiceImpl() }
    }

    Main(di)
        .hello()
}

internal class Main(override val di: DI) : DIAware {
    // TODO : Fix JVM target warning
    private val service: Service by instance()

    fun hello() = println("Hello Convention Plugins!")
}