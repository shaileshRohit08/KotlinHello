package com.kotlinexample.ui

import android.os.Bundle
import android.os.PersistableBundle
import com.kotlinexample.R

/**
 * Created by shailesh.rohit on 29-05-2018.
 */
class MainClass : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast("Hello")
    }
}