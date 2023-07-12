package com.banchu.banchuapi.config

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoRepositories
class MongoConfig: AbstractMongoClientConfiguration(
) {
    override fun getDatabaseName(): String {
        return
    }

    override fun mongoClient(): MongoClient {
        val connectionString = ConnectionString()
        val mongoClientSettings = MongoClientSettings
                .builder()
                .applyConnectionString(connectionString)
                .build()

        return MongoClients.create(mongoClientSettings)
    }

}