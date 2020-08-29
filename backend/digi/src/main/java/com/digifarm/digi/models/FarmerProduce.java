package com.digifarm.digi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "farmer_produce")
public class FarmerProduce {
	@Transient
    public static final String SEQUENCE_NAME = "farmer_produce_sequence";
	
	@Id
	private Long id;
	private Long farmerId;
	private String produceName;
	private Double price;
	public FarmerProduce() {
		
	}
	public FarmerProduce(Long id, Long farmerId, String produceName, Double price) {
		this.id = id;
		this.farmerId = farmerId;
		this.produceName = produceName;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(Long farmerId) {
		this.farmerId = farmerId;
	}
	public String getProduceName() {
		return produceName;
	}
	public void setProduceName(String produceName) {
		this.produceName = produceName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
