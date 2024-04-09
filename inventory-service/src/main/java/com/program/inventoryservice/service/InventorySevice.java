package com.program.inventoryservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.inventoryservice.repostitory.InventoryRepostitory;

@Service
public class InventorySevice {
	@Autowired
	private InventoryRepostitory inventoryRepostitory;
	public boolean isInStock(String skucode) {	
	boolean res=inventoryRepostitory.findBySkucode(skucode).isPresent();
		return res;
	}

}
