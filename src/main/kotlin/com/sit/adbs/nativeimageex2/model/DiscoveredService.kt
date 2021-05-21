package com.sit.adbs.nativeimageex2.model

import java.net.URI

data class DiscoveredService(val name: String,
                             val secure: Boolean,
                             val scheme: String,
                             val host: String,
                             val port: Int,
                             val stripPrefix: Int,
                             val uri: URI,
                             val includeBearerToken: Boolean = true)