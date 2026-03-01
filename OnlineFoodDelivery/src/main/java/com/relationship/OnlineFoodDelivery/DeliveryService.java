package com.relationship.OnlineFoodDelivery;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class DeliveryService {
	
	public void delivery() {
		System.out.println("Delivery Service called");
	}
	@PostConstruct
	public void postConst() {
		System.out.println("Delivery Service Ready");
	}
	
	@PreDestroy
	public void preDest() {
		System.out.println("Delivery Service Closed");
	}
	public void deliver(String message) {
		System.out.println("Order is: " + message);
	}
}
