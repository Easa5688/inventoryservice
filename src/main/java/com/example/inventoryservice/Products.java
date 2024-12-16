package com.example.inventoryservice;



import jakarta.annotation.Nullable;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Products {
	private long id;
	private String product_name;
	
	@Nullable
	private String description;
	private int price;
	
	@Transient
	private int stock;
	
	

}
