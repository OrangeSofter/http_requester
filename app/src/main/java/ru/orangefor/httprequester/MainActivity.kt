package ru.orangefor.httprequester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.net.URL
import  kotlinx.coroutines.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private  val appId = "e178f530705ccbc7abe485cdbc68bd4a"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var response = ""


        val t =  thread(start = true) {
                try {
                    response = URL("https://api.openweathermap.org/data/2.5/weather?lat=37&lon=53&appid=e178f530705ccbc7abe485cdbc68bd4a").readText()
                } catch (ex: Exception) {
                    println("не получилось ${ex.message}")
                }

                println(response)

        }
    }
}
