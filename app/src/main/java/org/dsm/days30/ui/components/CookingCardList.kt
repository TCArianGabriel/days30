package org.dsm.days30.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.dsm.days30.data.CookingSuggestion


@Composable
fun CookingCardList(suggestions: List<CookingSuggestion>) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState()) // Permite el desplazamiento vertical
    ) {
        // Itera sobre la lista de sugerencias y muestra una tarjeta para cada una
        suggestions.forEach { suggestion ->
            CookingCard(suggestion = suggestion)
        }
    }
}