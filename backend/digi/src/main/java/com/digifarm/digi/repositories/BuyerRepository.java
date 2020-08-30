package com.digifarm.digi.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.digifarm.digi.models.Buyer;

public interface BuyerRepository extends MongoRepository<Buyer, Long> {
	Buyer findBy_id(ObjectId _id);
}
