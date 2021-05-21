package com.sit.adbs.nativeimageex2.config

import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory
import org.springframework.boot.web.embedded.netty.NettyServerCustomizer
import org.springframework.boot.web.server.WebServerFactoryCustomizer
import org.springframework.stereotype.Component

@Component
class WebServerConfig: WebServerFactoryCustomizer<NettyReactiveWebServerFactory> {

    override fun customize(factory: NettyReactiveWebServerFactory) {
        factory.addServerCustomizers(NettyServerCustomizer { server ->
            server.httpRequestDecoder {
                it.maxHeaderSize(65536)
                it.maxInitialLineLength(65536)
            }
        })
    }

}