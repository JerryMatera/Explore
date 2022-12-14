package io.github.jerrymatera.explore.data.models


import com.google.gson.annotations.SerializedName
import io.github.jerrymatera.explore.domain.model.Country
import io.github.jerrymatera.explore.domain.model.CountryWithDetails

data class CountryDTO(
    @SerializedName( "altSpellings")
    val altSpellings: List<String>,
    @SerializedName( "area")
    val area: Double,
    @SerializedName( "borders")
    val borders: List<String>?,
    @SerializedName( "capital")
    val capital: List<String>?,
    @SerializedName( "capitalInfo")
    val capitalInfo: CapitalInfo?,
    @SerializedName( "car")
    val car: Car,
    @SerializedName( "cca2")
    val cca2: String,
    @SerializedName( "cca3")
    val cca3: String,
    @SerializedName( "ccn3")
    val ccn3: String?,
    @SerializedName( "cioc")
    val cioc: String?,
    @SerializedName( "coatOfArms")
    val coatOfArms: CoatOfArms?,
    @SerializedName( "continents")
    val continents: List<String>,
    @SerializedName( "currencies")
    val currencies: HashMap<String, CurrencyDetail>?= HashMap(),
    @SerializedName( "demonyms")
    val demonyms: Demonyms?,
    @SerializedName( "fifa")
    val fifa: String?,
    @SerializedName( "flag")
    val flag: String,
    @SerializedName( "flags")
    val flags: Flags,
    @SerializedName( "gini")
    val gini: HashMap<String, Double> = HashMap(),
    @SerializedName( "idd")
    val idd: Idd?,
    @SerializedName( "independent")
    val independent: Boolean?,
    @SerializedName( "landlocked")
    val landlocked: Boolean,
    @SerializedName( "languages")
    val languages: HashMap<String, String>? = HashMap(),
    @SerializedName( "latlng")
    val latlng: List<Double>,
    @SerializedName( "maps")
    val maps: Maps,
    @SerializedName( "name")
    val name: Name,
    @SerializedName( "population")
    val population: Int,
    @SerializedName( "postalCode")
    val postalCode: PostalCode?,
    @SerializedName( "region")
    val region: String,
    @SerializedName( "startOfWeek")
    val startOfWeek: String,
    @SerializedName( "status")
    val status: String,
    @SerializedName( "subregion")
    val subregion: String?,
    @SerializedName( "timezones")
    val timezones: List<String>,
    @SerializedName( "tld")
    val tld: List<String>?,
    @SerializedName( "translations")
    val translations: HashMap<String, TranslationDetail>? = HashMap(),
    @SerializedName( "unMember")
    val unMember: Boolean
) {


    fun toCountryWithDetails(): CountryWithDetails {
        return CountryWithDetails(
            name = this.name.common,
            population = this.population,
            capital = this.capital?.first() ?: "none",
            region = this.region,
            languages = this.languages?.values?.first() ?: "Not available",
            independent = this.independent,
            unMember = this.unMember,
            area = this.area.toString(),
            isLandLocked = this.landlocked,
            currency = this.currencies?.values?.first()?.name ?: "",
            currencySymbol = this.currencies?.values?.first()?.symbol ?: "",
            timeZone = this.timezones.first(),
            diallingCode = "${this.idd?.root ?: ""}${this.idd?.suffixes?.first() ?: ""}",
            drivingSide = this.car.side,
            geographicalLocation = "(${this.latlng[0]}, ${this.latlng[1]})",
            flagImage = this.flags.png,
            coatOfArmsImage = this.coatOfArms?.png,
            flagImageSVG = this.flags.svg,
            coatOfArmsImageSVG = this.coatOfArms?.svg
        )
    }
    fun toCountry(): Country {
        return Country(
            name = this.name.common,
            capital = this.capital?.first() ?: "none",
            flagImage = this.flags.png,
        )
    }
}