package com.digifarm.digi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.digifarm.digi.models.Farmer;

public interface FarmerRepository extends MongoRepository<Farmer, Long> {

}
