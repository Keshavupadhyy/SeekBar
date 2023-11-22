package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var seekBar: SeekBar
    private lateinit var textViewProgress: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar = findViewById(R.id.seekBar)
        textViewProgress = findViewById(R.id.textViewProgress)

        seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Toast.makeText(this@MainActivity,"onProgressChange",Toast.LENGTH_SHORT).show()
                textViewProgress.text = "Rate =" + seekBar?.progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(this@MainActivity,"onStartTrackingTouch",Toast.LENGTH_SHORT).show()
                textViewProgress.text = "Middle rate=" + seekBar?.progress.toString()

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(this@MainActivity,"onStopTrackingTouch",Toast.LENGTH_SHORT).show()
                textViewProgress.text ="final rate=" + seekBar?.progress.toString()

            }


        })
    }
}