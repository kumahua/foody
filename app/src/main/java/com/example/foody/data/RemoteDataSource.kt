package com.example.foody.data

import com.example.foody.models.FoodRecipe
import com.example.foody.data.network.FoodRecipesApi
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val foodRecipesApi: FoodRecipesApi) {

    suspend fun getRecipes(quires: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(quires)
    }
}