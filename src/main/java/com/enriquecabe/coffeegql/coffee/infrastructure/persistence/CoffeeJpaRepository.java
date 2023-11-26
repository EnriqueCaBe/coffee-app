package com.enriquecabe.coffeegql.coffee.infrastructure.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeJpaRepository extends MongoRepository<CoffeeJpaEntity, String> {
}
