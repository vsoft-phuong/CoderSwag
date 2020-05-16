package com.chatcore.coderswag.controllers

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.chatcore.coderswag.R
import com.chatcore.coderswag.adapters.ProductAdapter
import com.chatcore.coderswag.services.DataService
import com.chatcore.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        productAdapter = ProductAdapter(this, DataService.getProducts(categoryType))


        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
             spanCount = 4
        }

        //tablet pixel C
        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                spanCount = 5
            }else {
                spanCount = 3
            }
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = productAdapter

    }
}
