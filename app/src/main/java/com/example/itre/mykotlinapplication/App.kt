package com.example.itre.mykotlinapplication

import android.app.Application
import io.objectbox.BoxStore

/**
 * Created by itre on 7/28/17.
 */
class App : Application() {
    companion object Constants {
        const val TAG = "ObjectBoxExample"
        const val EXTERNAL_DIR = false
    }

    lateinit var boxStore: BoxStore
        private set

    override fun onCreate() {
        super.onCreate()

        boxStore = MyObjectBox.builder().androidContext(this).build()
    }
}