package com.faizil.apicoba2

data class ListDataItem(
    val id: String,
    val kabupaten: Kabupaten,
    val kecamatan: Kecamatan,
    val kelurahan: Kelurahan,
    val nama: String,
    val provinsi: Provinsi
)