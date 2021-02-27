package com.example.composeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun RecipeCard(recipe: Recipe, modifier: Modifier) {
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp, modifier = modifier) {
        val image = painterResource(id = recipe.imageResource)
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = image,
                contentDescription = "Image of the ${recipe.title} recipe",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(144.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(recipe.title, style = MaterialTheme.typography.h4)
                for (ingredient in recipe.ingredients) {
                    Text("• $ingredient")
                }
            }
        }
    }
}
