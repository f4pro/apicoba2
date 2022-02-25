package com.faizil.apicoba2

import com.faizil.apicoba2.data.Kabupaten
import com.faizil.apicoba2.data.Kecamatan
import com.faizil.apicoba2.data.Kelurahan
import com.faizil.apicoba2.data.Provinsi

data class PostResponseItem(
    val id: Int,
    val kabupaten: Kabupaten,
    val kecamatan: Kecamatan,
    val kelurahan: Kelurahan,
    val nama: String,
    val provinsi: Provinsi
)