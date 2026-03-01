package primary_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {
	
	

	private final NotificationService primaryService;
	private final NotificationService emailService;
	private final NotificationService pushService;
	
	@Autowired
	public NotificationManager(
			NotificationService primaryService,
			@Qualifier("emailNotificationService") NotificationService emailService,
			@Qualifier("pushNotification") NotificationService pushService) 
	{
		this.primaryService=primaryService;
		this.emailService=emailService;
		this.pushService=pushService; 	
	}
	
//	@Autowired
//	public NotificationManager(NotificationService primaryService, NotificationService emailService,
//			NotificationService pushService) {
//		this.primaryService = primaryService;
//		this.emailService = emailService;
//		this.pushService = pushService;
//	}


	public void sendNotification() {
		System.out.println("--- @Primary (SMS)");
		primaryService.sendMsg("Hello Via Primary");
	}
	
	public void sendEmailNotification() {
		System.out.println("\n--- @Email Service Using @Qualifier---");
		emailService.sendMsg("Hello via Email Service");
	}
	
	public void sendPushNotification() {
		System.out.println("\n--- @Push Notification Service Using @Qualifier ---");
		pushService.sendMsg("Hello via Push Service");
	}
		
}
