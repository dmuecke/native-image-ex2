package com.sit.adbs.nativeimageex2.config

import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class RouteFilterConfig {

    @RefreshScope
    @Bean("gatewayRouteLocator")
    fun routeLocator(routeBuilder: RouteLocatorBuilder): RouteLocator {
        return routeBuilder.routes().build()
    }
}