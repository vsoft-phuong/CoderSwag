package com.chatcore.coderswag.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.chatcore.coderswag.R
import com.chatcore.coderswag.adapters.CategoryAdapter
import com.chatcore.coderswag.models.Category
import com.chatcore.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

//    lateinit var adapter: ArrayAdapter<Category>
    lateinit var adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)
        adapter = CategoryAdapter(this, DataService.categories)
        lvCategory.adapter = adapter
    }
}
