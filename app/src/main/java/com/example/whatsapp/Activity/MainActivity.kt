package com.example.whatsapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding!!.root
        setContentView(view)

        val linearLayoutManager = LinearLayoutManager(this)
        binding!!.rcv.layoutManager = linearLayoutManager
    }
}