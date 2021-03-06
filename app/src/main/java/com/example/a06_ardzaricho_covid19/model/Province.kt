package com.example.a06_ardzaricho_covid19.model

import com.google.gson.annotations.SerializedName

data class Province(
    @SerializedName("kode_provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus_Posi")
    val positive: Int,
    @SerializedName("Kasus_Semb ")
    val recover: Int,
    @SerializedName("Kasus_Meni")
    val death: Int,
)