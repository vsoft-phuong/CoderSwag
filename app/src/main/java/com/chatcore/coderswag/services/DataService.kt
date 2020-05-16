package com.chatcore.coderswag.services

import com.chatcore.coderswag.models.Category
import com.chatcore.coderswag.models.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodies Gray", "$28", "hoodie1"),
        Product("Devslopes Hoodies Red", "$32", "hoodie2"),
        Product("Devslopes Gray Hoodies", "$28", "hoodie3"),
        Product("Devslopes Black Hoodies", "$32", "hoodie4")
    )

    val shirsts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Light Gray", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")

    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        when (category) {
            "SHIRTS" -> return shirsts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGoods
        }
    }


}