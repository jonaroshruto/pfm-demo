package com.example.pfmdemo.config;

import org.springframework.boot.autoconfigure.mongo.MongoClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;



@Configuration
@EnableMongoRepositories(basePackages = "com.example.pfmdemo.repo")
public class MongoConfig {
       @Bean
        public MongoClient mongo() throws Exception {
            final ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");
            final MongoClientSettings mongoClientSettings = MongoClientSettings.builder().applyConnectionString(connectionString).build();
            return MongoClients.create(mongoClientSettings);
        }

        @Bean
        public MongoTemplate mongoTemplate() throws Exception {
            return new MongoTemplate(mongo(), "pfm");
        }


}
