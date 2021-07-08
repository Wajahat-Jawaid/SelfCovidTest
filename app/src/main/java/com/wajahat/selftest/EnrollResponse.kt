package com.wajahat.selftest

import kotlinx.serialization.Serializable

/**
 * Created by Wajahat Jawaid(wajahatjawaid@gmail.com)
 */
@Serializable
data class EnrollResponse(val face_id: String)