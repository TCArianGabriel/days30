package org.dsm.days30

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import org.dsm.days30.data.CookingSuggestion
import org.dsm.days30.ui.components.CookingCardList
import org.dsm.days30.ui.theme.Days30Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Days30Theme {
                // Un contenedor de superficie que usa el color de fondo del tema
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Inicializa la lista de sugerencias directamente en el composable raíz
                    val suggestions = remember {
                        listOf(
                            CookingSuggestion(
                                day = 1,
                                dishName = "Pasta con salsa de tomate fresca",
                                description = "Aprende a hacer una salsa de tomate casera y deliciosa desde cero.",
                                imageUrl = R.drawable.day1_pasta
                            ),
                            CookingSuggestion(
                                day = 2,
                                dishName = "Ensalada mediterránea con vinagreta de limón",
                                description = "Prepara una ensalada refrescante y saludable con sabores mediterráneos.",
                                imageUrl = R.drawable.day2_salad
                            ),
                            CookingSuggestion(
                                day = 3,
                                dishName = "Pollo al horno con hierbas provenzales",
                                description = "Domina la técnica para hornear pollo jugoso y aromático.",
                                imageUrl = R.drawable.day3_chicken
                            ),
                            CookingSuggestion(
                                day = 4,
                                dishName = "Sopa de lentejas casera",
                                description = "Cocina una sopa nutritiva y reconfortante ideal para cualquier día.",
                                imageUrl = R.drawable.day4_soup
                            ),
                            CookingSuggestion(
                                day = 5,
                                dishName = "Tortilla de patatas española",
                                description = "Aprende los secretos para hacer una tortilla de patatas perfecta.",
                                imageUrl = R.drawable.day5_tortilla
                            ),
                            CookingSuggestion(
                                day = 6,
                                dishName = "Hamburguesa casera con pan artesanal",
                                description = "Prepara hamburguesas deliciosas con pan hecho en casa.",
                                imageUrl = R.drawable.day6_burger
                            ),
                            CookingSuggestion(
                                day = 7,
                                dishName = "Pizza margarita casera",
                                description = "Haz tu propia masa de pizza y disfruta de una clásica margarita.",
                                imageUrl = R.drawable.day7_pizza
                            ),
                            CookingSuggestion(
                                day = 8,
                                dishName = "Curry de verduras con arroz basmati",
                                description = "Explora los sabores de la India con un curry de verduras aromático.",
                                imageUrl = R.drawable.day8_curry
                            ),
                            CookingSuggestion(
                                day = 9,
                                dishName = "Salmón a la plancha con espárragos",
                                description = "Cocina un plato saludable y rápido con salmón fresco.",
                                imageUrl = R.drawable.day9_salmon
                            ),
                            CookingSuggestion(
                                day = 10,
                                dishName = "Tacos de carne asada con guacamole",
                                description = "Prepara unos auténticos tacos de carne asada con guacamole casero.",
                                imageUrl = R.drawable.day10_tacos
                            ),
                            CookingSuggestion(
                                day = 11,
                                dishName = "Risotto de champiñones",
                                description = "Aprende a hacer un risotto cremoso y lleno de sabor.",
                                imageUrl = R.drawable.day11_risotto
                            ),
                            CookingSuggestion(
                                day = 12,
                                dishName = "Quiche lorraine",
                                description = "Hornea una deliciosa quiche lorraine con tocino y queso.",
                                imageUrl = R.drawable.day12_quiche
                            ),
                            CookingSuggestion(
                                day = 13,
                                dishName = "Lasaña boloñesa",
                                description = "Prepara una lasaña clásica con salsa boloñesa y bechamel.",
                                imageUrl = R.drawable.day13_lasagna
                            ),
                            CookingSuggestion(
                                day = 14,
                                dishName = "Pad Thai de pollo",
                                description = "Cocina un plato tailandés popular con fideos de arroz y pollo.",
                                imageUrl = R.drawable.day14_padthai
                            ),
                            CookingSuggestion(
                                day = 15,
                                dishName = "Brownies de chocolate caseros",
                                description = "Hornea unos brownies fudgy y deliciosos para darte un capricho.",
                                imageUrl = R.drawable.day15_brownies
                            ),
                            CookingSuggestion(
                                day = 16,
                                dishName = "Gazpacho andaluz",
                                description = "Prepara una sopa fría refrescante típica de Andalucía.",
                                imageUrl = R.drawable.day16_gazpacho
                            ),
                            CookingSuggestion(
                                day = 17,
                                dishName = "Paella valenciana",
                                description = "Atrévete a cocinar una auténtica paella valenciana con arroz y mariscos.",
                                imageUrl = R.drawable.day17_paella
                            ),
                            CookingSuggestion(
                                day = 18,
                                dishName = "Hummus casero con pan pita",
                                description = "Aprende a hacer hummus suave y delicioso para acompañar con pan pita.",
                                imageUrl = R.drawable.day18_hummus
                            ),
                            CookingSuggestion(
                                day = 19,
                                dishName = "Tarta de manzana clásica",
                                description = "Hornea una tarta de manzana tradicional con una masa crujiente.",
                                imageUrl = R.drawable.day19_applepie
                            ),
                            CookingSuggestion(
                                day = 20,
                                dishName = "Enchiladas de pollo con salsa verde",
                                description = "Prepara unas enchiladas de pollo cubiertas con una salsa verde picante.",
                                imageUrl = R.drawable.day20_enchiladas
                            ),
                            CookingSuggestion(
                                day = 21,
                                dishName = "Lomo de cerdo asado con puré de patatas",
                                description = "Cocina un lomo de cerdo tierno y jugoso acompañado de un puré cremoso.",
                                imageUrl = R.drawable.day21_porkloin
                            ),
                            CookingSuggestion(
                                day = 22,
                                dishName = "Sopa de tomate y albahaca",
                                description = "Prepara una sopa reconfortante con el sabor fresco de los tomates y la albahaca.",
                                imageUrl = R.drawable.day22_tomatosoup
                            ),
                            CookingSuggestion(
                                day = 23,
                                dishName = "Crepes dulces y saladas",
                                description = "Aprende a hacer crepes versátiles que puedes rellenar con ingredientes dulces o salados.",
                                imageUrl = R.drawable.day23_crepes
                            ),
                            CookingSuggestion(
                                day = 24,
                                dishName = "Albóndigas en salsa",
                                description = "Cocina unas albóndigas tiernas en una salsa sabrosa.",
                                imageUrl = R.drawable.day24_meatballs
                            ),
                            CookingSuggestion(
                                day = 25,
                                dishName = "Tiramisú casero",
                                description = "Prepara un postre italiano clásico con capas de bizcocho, café y crema de mascarpone.",
                                imageUrl = R.drawable.day25_tiramisu
                            ),
                            CookingSuggestion(
                                day = 26,
                                dishName = "Burritos de frijoles negros y arroz",
                                description = "Prepara unos burritos vegetarianos llenos de sabor.",
                                imageUrl = R.drawable.day26_burritos
                            ),
                            CookingSuggestion(
                                day = 27,
                                dishName = "Pescado blanco al papillote con verduras",
                                description = "Cocina pescado de forma saludable y sabrosa al vapor dentro de papel de aluminio.",
                                imageUrl = R.drawable.day27_fishpapillote
                            ),
                            CookingSuggestion(
                                day = 28,
                                dishName = "Galletas de avena y pasas",
                                description = "Hornea unas galletas saludables y deliciosas para la merienda.",
                                imageUrl = R.drawable.day28_oatmealcookies
                            ),
                            CookingSuggestion(
                                day = 29,
                                dishName = "Ensalada de quinoa con aguacate y mango",
                                description = "Prepara una ensalada nutritiva y refrescante con quinoa, aguacate y mango.",
                                imageUrl = R.drawable.day29_quinosalad
                            ),
                            CookingSuggestion(
                                day = 30,
                                dishName = "Celebra tu progreso culinario con tu plato favorito",
                                description = "Elige tu receta favorita de este mes y disfrútala para celebrar tus logros en la cocina.",
                                imageUrl = R.drawable.day30_favorite
                            )
                        )
                    }
                    // Muestra la lista de tarjetas de cocina, pasando la lista directamente
                    CookingCardList(suggestions = suggestions)
                }
            }
        }
    }
}