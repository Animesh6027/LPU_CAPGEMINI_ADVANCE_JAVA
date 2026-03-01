package com.relationship.PaymentService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TransactionLogger {
//	private final PaymentService paymentService;
//	
//	public TransactionLogger(PaymentService paymentService) {
//		this.paymentService=paymentService;
//	}
	
	public void log(String message) {
        System.out.println("Transaction Log: " + message);
    }
	
	@PostConstruct
	public void postConst() {
		System.out.println("Logger Initialized");
	}
	
	@PreDestroy
	public void preDest() {
		System.out.println("Logger Destroyed");
	}
	
}
