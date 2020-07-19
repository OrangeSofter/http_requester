package ru.orangefor.httprequester

import com.beust.klaxon.Klaxon
import org.junit.Test

import java.lang.Exception
import java.net.URL

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class HttpUnitTest {
    @Test
    fun getAndParseHttpTest() {
        var rawResponse = ""
        try {
            rawResponse = URL("https://api.openweathermap.org/data/2.5/weather?lat=37&lon=53&appid=e178f530705ccbc7abe485cdbc68bd4a").readText()
        } catch (ex: Exception) {
            println("не получилось ${ex.message}")
            assert(false)
        }

        val parsedResponse = Klaxon().parse<Response>(rawResponse)
        assert(parsedResponse?.cod == 200 && parsedResponse.CountryName == "Jūybār")

        /*println("давление ${parsedResponse?.pressure}")
        assert(parsedResponse?.pressure == 1010)*/


    }
}