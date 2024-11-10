/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.dessertclicker.data

import com.example.dessertclicker.R
import com.example.dessertclicker.model.Dessert

/**
 * [Datasource] generates a list of [Dessert]
 */
object Datasource {
    val dessertList = listOf(
        Dessert("Cake", R.drawable.cupcake, 5, 0),
        Dessert("Cake", R.drawable.donut, 10, 5),
        Dessert("Cake", R.drawable.eclair, 15, 20),
        Dessert("Cake", R.drawable.froyo, 30, 50),
        Dessert("Cake", R.drawable.gingerbread, 50, 100),
        Dessert("Cake", R.drawable.honeycomb, 100, 200),
        Dessert("Cake", R.drawable.icecreamsandwich, 500, 500),
        Dessert("Cake", R.drawable.jellybean, 1000, 1000),
        Dessert("Cake", R.drawable.kitkat, 2000, 2000),
        Dessert("Cake", R.drawable.lollipop, 3000, 4000),
        Dessert("Cake", R.drawable.marshmallow, 4000, 8000),
        Dessert("Cake", R.drawable.nougat, 5000, 16000),
        Dessert("Cake", R.drawable.oreo, 6000, 20000)
    )
}
