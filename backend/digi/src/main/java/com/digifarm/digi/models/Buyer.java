package com.digifarm.digi.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "buyers")
public class Buyer {
	@Transient
    public static final String SEQUENCE_NAME = "buyers_sequence";
	
	@Id
	private ObjectId _id;
	private String farmerName;
	private Long userId;
	
	public Buyer() {

	}

	public Buyer(ObjectId _id, String farmerName, Long userId) {
		this._id = _id;
		this.farmerName = farmerName;
		this.userId = userId;
	}

	// ObjectId needs to be converted to string
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
