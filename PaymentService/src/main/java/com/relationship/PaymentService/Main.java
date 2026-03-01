package com.relationship.PaymentService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PaymentProcessor paymentProcessor = context.getBean(PaymentProcessor.class);
//		paymentProcessor.makePay(1000);
		paymentProcessor.makePay(5000);
		
		
		
		context.close();
	}
}
