package ru.orangefor.httprequester

import com.beust.klaxon.Json

data class Response(
    @Json(name = "name")
    val CountryName: String,

    @Json(name = "cod")
    val cod: Int

   /* @Json(name = "main.pressure")
    val pressure: Int*/
)

/*@Json(name = "main.pressure")
data class Weather(
    @Json(name = "name")
    val CountryName: String,

)*/


