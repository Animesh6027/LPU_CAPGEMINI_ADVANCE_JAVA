package com.relationship.springdemo;

public class MessageService {
	private EmailService emailService;
	


	// Constructor Injection
//	public MessageService(EmailService emailService) {
//		super();
//		this.emailService = emailService;
//	}


	//Setter Injection
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public void displayMessage() {
		System.out.println("New message is being sent");
		emailService.displaySend();
	}

	public void sendMessage() {
		System.out.println("\nMessage is being sent!!");
		emailService.send();
	}
}
