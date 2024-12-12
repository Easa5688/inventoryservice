package com.example.inventoryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/{name}")
	public int getStock(@PathVariable("name") String name) {
		
		return service.getStock(name);
		
	}
	
	@PostMapping("/update")
	public String updateStock(@RequestBody Inventory inventory) {
		
		 service.updateStock(inventory);
		 
		 return "stock updated";
	}

}
