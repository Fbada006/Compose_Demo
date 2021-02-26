package com.example.composeapp

import androidx.annotation.DrawableRes

data class Recipe(
    @DrawableRes val imageResource: Int,
    val title: String,
    val ingredients: List<String>
)
