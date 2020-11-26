package com.performance.appstart

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.squareup.moshi.JsonAdapter

import com.squareup.moshi.Moshi
import retrofit2.converter.moshi.MoshiConverterFactory
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type


class MainActivity<C> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.button).setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("d", TestBean(5, "7"))
            startActivity(intent)
        }
    }
}

fun  Intent.putExtra(name: String, value: Any): Intent {
    val moshi = Moshi.Builder().build()
    val type: Type = value::class.java
    val jsonAdapter: JsonAdapter<Any> = moshi.adapter(type)
//Serialize
    val jsonStr = jsonAdapter.toJson(value)
    putExtra(name, jsonStr)
    return this

}


fun <V> Intent.getObjectExtra(name: String, cls: Class<V>): V? {
    val moshi = Moshi.Builder().build()
    val jsonStr = getStringExtra(name)
    return if (jsonStr == null) null else moshi.adapter(cls).fromJson(jsonStr)
}
