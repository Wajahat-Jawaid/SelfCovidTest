package com.wajahat.selftest

import kotlinx.serialization.Serializable

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@Serializable
data class RecognizeResponse(val images: List<Image>? = null)