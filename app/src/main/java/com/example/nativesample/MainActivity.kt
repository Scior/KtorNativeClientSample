package com.example.nativesample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import org.kotlin.mpp.mobile.getGoogle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        findViewById<TextView>(R.id.main_text).text = createApplicationScreenMessage()

        val handler = Handler()
        getGoogle {
            handler.post {
                findViewById<TextView>(R.id.main_text).text = it
            }
        }
    }
}
