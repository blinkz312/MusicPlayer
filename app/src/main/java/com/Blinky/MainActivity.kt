package com.Blinky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.sql.Time
import java.util.Locale
import java.util.Timer

class MainActivity : AppCompatActivity() {
    private var seconds = 0
    private var running = false
    private var wasRunning = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
    }
