package com.sit.adbs.nativeimageex2

import org.junit.jupiter.api.Test
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.ImportAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration
import org.springframework.cloud.context.scope.refresh.RefreshScope
import org.springframework.context.annotation.Bean

@SpringBootTest
class NativeImageEx2ApplicationTests {

    @Test
    fun contextLoads() {
    }

    @TestConfiguration
    @EnableAutoConfiguration
    class ControllerTestConfig {
        @Bean
        fun refreshScope() = RefreshScope()
    }
}
