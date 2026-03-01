package com.relationship.OnlineFoodDelivery;

import org.springframework.stereotype.Component;

@Component
public class RestaurantService {
	
	private DeliveryService deliveryService ;

	public void setDeliveryService(DeliveryService deliveryService) {
		this.deliveryService=deliveryService;
	}
	
	public void menu() {
		System.out.println("Placing Order");
		deliveryService.deliver("Placed");
	}

	
	
	
}
