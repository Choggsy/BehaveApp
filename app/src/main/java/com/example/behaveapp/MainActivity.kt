package com.example.behaveapp

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: InfoIconAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // Set GridLayoutManager with 2 columns

        val jsonFileString = getJsonDataFromAsset(this)
        val gson = Gson()
        val listInfoCardType = object : TypeToken<List<InfoCard>>() {}.type
        val infoCards: List<InfoCard> = gson.fromJson(jsonFileString, listInfoCardType)

        adapter = InfoIconAdapter(infoCards)
        recyclerView.adapter = adapter
    }

    private fun getJsonDataFromAsset(context: Context): String? {
        return try {
            val inputStream: InputStream = context.assets.open("data.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            String(buffer, Charsets.UTF_8)
        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }
}
