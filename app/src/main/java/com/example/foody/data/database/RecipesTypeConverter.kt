package com.example.foody.data.database

import androidx.room.TypeConverter
import com.example.foody.models.FoodRecipe
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class RecipesTypeConverter {

    var gson = Gson()

    /**
     * 將FoodRecipe對象轉換為JSON格式的字符串，並返回該字符串
     */
    @TypeConverter
    fun foodRecipeToString(foodRecipe: FoodRecipe): String {
        return gson.toJson(foodRecipe)
    }

    /**
     * 將String類型轉換為FoodRecipe對象
     */
    @TypeConverter
    fun stringToFoodRecipe(data: String): FoodRecipe {
        val listType = object : TypeToken<FoodRecipe>() {}.type
        return gson.fromJson(data, listType)
    }
}