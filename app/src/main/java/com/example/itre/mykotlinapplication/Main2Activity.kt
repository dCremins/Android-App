package com.example.itre.mykotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

import io.objectbox.Box

class Main2Activity : AppCompatActivity() {

    lateinit var notesBox: Box<Note>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        notesBox = (application as App).boxStore.boxFor(Note::class.java)

        val messageSTR = intent.getStringExtra("message")
        textView.text = messageSTR
    }
}
