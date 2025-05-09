package org.dsm.days30.data

import androidx.annotation.DrawableRes

data class CookingSuggestion(
    val day: Int, // Número del día
    val dishName: String, // Nombre del plato
    val description: String, // Descripción de la receta o sugerencia
    @DrawableRes val imageUrl: Int // Nombre del archivo de la imagen en drawable
)