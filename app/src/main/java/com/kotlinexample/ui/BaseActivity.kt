package com.kotlinexample.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by shailesh.rohit on 29-05-2018.
 */
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun showToast(message: String){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }


}