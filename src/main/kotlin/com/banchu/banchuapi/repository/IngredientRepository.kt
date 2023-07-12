package com.banchu.banchuapi.repository

import com.banchu.banchuapi.domain.Ingredient
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface IngredientRepository : MongoRepository<Ingredient, Long> {


}