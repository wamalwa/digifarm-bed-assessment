package com.digifarm.digi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "farmers")
public class Farmer {
	@Transient
    public static final String SEQUENCE_NAME = "farmers_sequence";
	
	@Id
	private Long id;
	private String farmerName;
	private Long userId;
	
	public Farmer() {
		
	}

	public Farmer(Long id, String farmerName, Long userId) {
		this.id = id;
		this.farmerName = farmerName;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
