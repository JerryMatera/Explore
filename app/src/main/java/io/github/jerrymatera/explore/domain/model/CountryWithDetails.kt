package io.github.jerrymatera.explore.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class CountryWithDetails(
    val name: String,
    val capital: String,
    val population: Int,
    val region: String,
    val languages: String,
    val independent: Boolean?,
    val unMember: Boolean,
    val area: String,
    val isLandLocked: Boolean,
    val currency:String? = null,
    val currencySymbol: String? = null,
    val timeZone: String,
    val diallingCode: String,
    val drivingSide: String,
    val geographicalLocation: String,
    val flagImage: String,
    val flagImageSVG: String,
    val coatOfArmsImage: String?,
    val coatOfArmsImageSVG: String?
)
