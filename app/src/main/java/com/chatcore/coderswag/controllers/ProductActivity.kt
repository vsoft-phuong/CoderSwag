package com.chatcore.coderswag.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chatcore.coderswag.R
import com.chatcore.coderswag.utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
