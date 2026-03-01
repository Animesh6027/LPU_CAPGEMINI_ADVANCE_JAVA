package primary_qualifier;

import org.springframework.stereotype.Component;

@Component
public class PushNotification implements NotificationService {
	
	@Override
	public void sendMsg(String message) {
		System.out.println("Push Notification: " + message);
	}
}

