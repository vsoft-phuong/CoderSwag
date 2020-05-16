package com.chatcore.coderswag.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.chatcore.coderswag.R
import com.chatcore.coderswag.adapters.CategoryRecycleAdapter
import com.chatcore.coderswag.services.DataService
import com.chatcore.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var adapter: ArrayAdapter<Category>
    lateinit var adapter: CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories){category ->
//            Toast.makeText(this, category.title, Toast.LENGTH_SHORT).show()
            val productActivity = Intent(this, ProductActivity::class.java)
            productActivity.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productActivity)
        }
        productListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        productListView.layoutManager = layoutManager
        productListView.setHasFixedSize(true)

    }
}
