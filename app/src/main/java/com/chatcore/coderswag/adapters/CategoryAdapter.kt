package com.chatcore.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.chatcore.coderswag.R
import com.chatcore.coderswag.models.Category

class CategoryAdapter(context:Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View

        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImg = categoryView.findViewById<ImageView>(R.id.categoryImg)
        val categoryTxt = categoryView.findViewById<TextView>(R.id.categoryTxt)


        val category = categories.get(position)
        categoryTxt.text = category.title

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImg.setImageResource(resourceId)

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
}