package com.example.inventoryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	RestTemplate resttemplate;
	@Autowired
	Repository repository;
	
	public int getStock(String name) {
	
		int stock=0;
		
	 try {
		 
//		String uri= "http://localhost:8080/stock/"+name;
//	    stock= resttemplate.exchange(uri,HttpMethod.GET, null, Products.class).getBody().getStock();
		Inventory inventory= repository.findById(name).orElse(null);
		
		return inventory.getStock();
		}
	 catch(Exception e){
		 
		//System.out.println(e);
		 return stock;
	 }
	
	}
	
	public void updateStock(Inventory inventory) {
		
		//String uri = "http://localhost:8081/products/name/"+inventory.getProduct();
	   // Products product = resttemplate.exchange(uri,HttpMethod.GET, null, Products.class).getBody();
//	    int updated_stock=product.getStock()-order_quantity;
	    
	     
	   // product.setStock(inventory.getStock());
	    
	    //uri="http://localhost:8081/products/"+inventory.getProduct();
	   
	   // HttpEntity<Products> productentity = new HttpEntity<Products>(product);
	  
	    //resttemplate.exchange(uri,HttpMethod.PUT, productentity, String.class);
	    
	    repository.save(inventory);
	    

	    
	}

}
