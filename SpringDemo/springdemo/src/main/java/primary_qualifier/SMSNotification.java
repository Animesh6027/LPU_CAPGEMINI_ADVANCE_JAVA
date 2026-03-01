package primary_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Primary
@Service("primaryService")
public class SMSNotification implements NotificationService {
	
	@Override
	public void sendMsg(String message) {
		System.out.println("SMS: " + message);
	}
}
