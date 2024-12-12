package com.example.inventoryservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Inventory,String> {

}
