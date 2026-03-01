package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionService {
	
	@Autowired
	private EmailService emailService;

//	public EmailService getEmailService() {
//		return emailService;
//	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public void sendMsg() {
		System.out.println("Setter Injection Called...");
		emailService.send();
	}
	
	
	
}
