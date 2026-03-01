package com.relationship.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {
	private final PaymentService creditCard;
    private final PaymentService paymentService;
    
    @Autowired
    private TransactionLogger logger;
    
    public PaymentProcessor(
    		PaymentService creditCard,
    		@Qualifier("upiPayment") PaymentService paymentService) {
    	this.creditCard = creditCard;
    	this.paymentService=paymentService;
    }
    
    
    public void makePay(double amount) {
//    	creditCard.processPayment(amount);
//    	paymentService.processPayment(amount);
    	creditCard.processPayment(1000);
    	paymentService.processPayment(5000);
    	logger.log("Completed Transaction Amount: " + amount);
    	
    }
}
