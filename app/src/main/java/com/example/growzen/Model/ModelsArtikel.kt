package com.example.growzen.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelsArtikel(
    val imgArtikel: Int,
    val titleIndex: Int,
    val descriptionIndex: Int
) : Parcelable


