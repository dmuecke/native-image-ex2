package com.sit.adbs.nativeimageex2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class NativeImageEx2Application

fun main(args: Array<String>) {
    runApplication<NativeImageEx2Application>(*args)
}
