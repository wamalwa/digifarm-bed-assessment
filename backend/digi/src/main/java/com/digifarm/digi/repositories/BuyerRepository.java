package com.digifarm.digi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.digifarm.digi.models.Buyer;

public interface BuyerRepository extends MongoRepository<Buyer, Long> {

}
