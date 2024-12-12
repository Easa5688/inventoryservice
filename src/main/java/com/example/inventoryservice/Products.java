package com.example.inventoryservice;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Products {
	private long id;
	private String product_name;
	private String description;
	private int price;
	private int stock;
	
	

}
