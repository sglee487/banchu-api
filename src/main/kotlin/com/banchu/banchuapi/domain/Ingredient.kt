package com.banchu.banchuapi.domain

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.mongodb.core.mapping.Document
import java.net.URL
import java.time.LocalDateTime

@Document(collection = "man_receipt")
data class Ingredient(
        val id: Long,
        val url: String,
        val name: String,
        val image: URL,
        val datePublished: LocalDateTime,
        val description: String?,
        val totalTime: String?,
        val author: String,
        val ingredients: List<String>,
        val ingredientName: List<String>,
        val ingredientAmount: List<String?>,
        val hits: Int,
        @JsonProperty("duration_time")
        val durationTime: String?,
        val difficulty: String?
        )
