package com.example.umbrella_mongoDB.umbreallaInfo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository<Store, String> {
}
