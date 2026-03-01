package com.relationship.springdemo;

public class EmailService {
	
	public EmailService() {
		System.out.println("\n1. Constructor Called");
	}
	
	public void init() {
		System.out.println("Init method called");
	}
	
	public void destroy() {
		System.out.println("\nDestroy method called");
	}
	
	public void send() {
		System.out.println("Through Email..");
	}
	public void displaySend() {
		System.out.println("Sent again through email..");
	}
}
