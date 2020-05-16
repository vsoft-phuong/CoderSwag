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

/**
 * Optimize
 * class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

 ||
 ||
class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {
 */
class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        var holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

            holder = ViewHolder()
            holder.img = categoryView.findViewById<ImageView>(R.id.categoryImg)
            holder.txt = categoryView.findViewById<TextView>(R.id.categoryTxt)

            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories.get(position)
        holder.txt?.text = category.title

        val resourceId =
            context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.img?.setImageResource(resourceId)

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

    //View holder
    private class ViewHolder {
        var img: ImageView? = null
        var txt: TextView? = null

    }
}