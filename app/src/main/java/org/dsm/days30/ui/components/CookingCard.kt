package org.dsm.days30.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.dsm.days30.data.CookingSuggestion


@Composable
fun CookingCard(suggestion: CookingSuggestion) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            // Muestra el número del día
            Text(
                text = "Día ${suggestion.day}",
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(8.dp))
            // Muestra la imagen del plato
            Image(
                painter = painterResource(
                    suggestion.imageUrl
                    )
                ),
                contentDescription = suggestion.dishName,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp) // Un poco más alto para platos
                    .aspectRatio(16f / 9f) // Mantener la proporción
            )
            Spacer(modifier = Modifier.height(8.dp))
            // Muestra el nombre del plato
            Text(
                text = suggestion.dishName,
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(4.dp))
            // Muestra la descripción de la receta o sugerencia
            Text(
                text = suggestion.description,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}