package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
	// Field Injection
	@Autowired
	private final EmailService emailService;
	private final SmsService smsService;
	
	// Setter Injection
//	@Autowired
//	public void setEmailService(EmailService emailService) {
//		this.emailService = emailService;
//	} 

	// Constructor Injection
	// Autowired - it will auto inject the dependencies
	
	@Autowired
	public MessageService(EmailService emailService, SmsService smsService) {
		this.emailService = emailService;
		this.smsService = smsService;
	}
	
	public void sendMessage() {
		System.out.println("\n"
				+ "Sending message....");
		emailService.send();
		smsService.sendSms();
	}

}
