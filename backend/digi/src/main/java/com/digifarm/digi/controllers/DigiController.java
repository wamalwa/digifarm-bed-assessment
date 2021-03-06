package com.digifarm.digi.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.digifarm.digi.models.Buyer;
import com.digifarm.digi.models.Farmer;
import com.digifarm.digi.repositories.BuyerRepository;
import com.digifarm.digi.repositories.FarmerRepository;
import com.digifarm.digi.services.SequenceGeneratorService;

@RestController
public class DigiController {
	@Autowired
	private FarmerRepository farmerRepository;

	@Autowired
	private BuyerRepository buyerRepository;

	@Autowired
	private SequenceGeneratorService sequenceGenerator;

	// Add new farmer
	@RequestMapping(value = "farmers", method = RequestMethod.POST)
	public ResponseEntity<?> addFarmer(@RequestBody Farmer farmer) {
		Farmer newFarmer = new Farmer();

		farmer.setId(sequenceGenerator.generateSequence(Farmer.SEQUENCE_NAME));

		newFarmer = farmerRepository.save(farmer);

		return ResponseEntity.ok(newFarmer);
	}

	// Update farmer
	@RequestMapping(value = "farmers", method = RequestMethod.PUT)
	public ResponseEntity<?> updateFarmer(@RequestBody Farmer farmer) {
		Farmer newFarmer = new Farmer();

		newFarmer = farmerRepository.save(farmer);

		return ResponseEntity.ok(newFarmer);
	}

	// Get all farmers
	@RequestMapping(value = "farmers", method = RequestMethod.GET)
	public ResponseEntity<?> getFarmer() {
		List<Farmer> farmers = farmerRepository.findAll();
		return ResponseEntity.ok(farmers);
	}

	// Delete farmer
	@RequestMapping(value = "farmers", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteFarmer(@RequestBody Farmer farmer) {
		farmerRepository.delete(farmer);
		return ResponseEntity.ok("Farmer deleted successfully");
	}

	// Add new buyer
	@RequestMapping(value = "buyers", method = RequestMethod.POST)
	public ResponseEntity<?> addBuyer(@RequestBody Buyer buyer) {
		Buyer newBuyer = new Buyer();

		//buyer.set_id(sequenceGenerator.generateSequence(Buyer.SEQUENCE_NAME));
		buyer.set_id(ObjectId.get());

		newBuyer = buyerRepository.save(buyer);

		return ResponseEntity.ok(newBuyer);
	}

	// Update buyer
	@RequestMapping(value = "buyers", method = RequestMethod.PUT)
	public ResponseEntity<?> updateBuyer(@RequestBody Buyer buyer) {
		Buyer newBuyer = new Buyer();

		newBuyer = buyerRepository.save(buyer);

		return ResponseEntity.ok(newBuyer);
	}

	// Get one buyer
	@RequestMapping(value = "buyers/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getBuyer(@PathParam("id") ObjectId buyerId) {
		System.out.println(buyerId);
		Buyer buyer = buyerRepository.findBy_id(buyerId);
		return ResponseEntity.ok(buyer);
	}

	// Get all buyers
	@RequestMapping(value = "buyers", method = RequestMethod.GET)
	public ResponseEntity<?> getAllBuyers() {
		List<Buyer> buyers = buyerRepository.findAll();
		return ResponseEntity.ok(buyers);
	}

	// Delete buyer
	@RequestMapping(value = "buyers", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteBuyer(@RequestBody Buyer buyer) {
		buyerRepository.delete(buyer);
		return ResponseEntity.ok("Buyer deleted successfully");
	}
}
