package com.chatcore.coderswag.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.chatcore.coderswag.R
import com.chatcore.coderswag.adapters.CategoryAdapter
import com.chatcore.coderswag.adapters.CategoryRecycleAdapter
import com.chatcore.coderswag.models.Category
import com.chatcore.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

//    lateinit var adapter: ArrayAdapter<Category>
    lateinit var adapter: CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        lvCategory.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        lvCategory.layoutManager = layoutManager
        lvCategory.setHasFixedSize(true)

    }
}
