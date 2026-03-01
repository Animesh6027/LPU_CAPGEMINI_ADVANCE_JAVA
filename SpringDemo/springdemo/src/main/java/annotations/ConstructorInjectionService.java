package annotations;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionService {
	
	private final EmailService emailService;

	public ConstructorInjectionService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	public void display() {
		System.out.println("Constructor Injection Service");
		emailService.send();
	}
	
}
