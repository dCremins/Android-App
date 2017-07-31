package com.example.itre.mykotlinapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random = Random()
        val strategies = resources.getStringArray(R.array.oblique_strategies)

        getStrategyButton.setOnClickListener {
            val message = strategies[random.nextInt(strategies.size)]
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("message", message)
            startActivity(intent)
        }
    }

}
