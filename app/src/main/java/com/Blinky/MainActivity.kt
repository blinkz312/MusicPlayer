package com.Blinky

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val play = findViewById<Button>(R.id.startBtn)
        val pause = findViewById<Button>(R.id.pauseBtn)
        val image = findViewById<ImageView>(R.id.img)
        //Creating a mediaplayer object
        var mediaPlayer = MediaPlayer.create(this,R.raw.music1)
        //Creating onClickListener object to play
        play.setOnClickListener {
                image.setImageResource(R.drawable.baseline_play_circle_24)
                mediaPlayer.start()
        }
        //Creating onCLickListener object to pause
        pause.setOnClickListener {
            image.setImageResource(R.drawable.baseline_pause_circle_outline_24)
            mediaPlayer.pause()
        }
        }
    }