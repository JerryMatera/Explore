package io.github.jerrymatera.explore.data.models

import com.google.gson.annotations.SerializedName

data class Name(
    @SerializedName("common")
    val common: String,
    @SerializedName("nativeName")
    val nativeName: HashMap<String, NativeNameDetail> = HashMap(),
    @SerializedName("official")
    val official: String
)