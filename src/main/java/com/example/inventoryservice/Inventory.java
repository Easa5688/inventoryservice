package com.example.inventoryservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Inventory {
    
	@Id
	private String product;
	private int Stock;
	    
	
	
}
