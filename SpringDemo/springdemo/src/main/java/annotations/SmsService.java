package annotations;

import org.springframework.stereotype.Component;

@Component
public class SmsService {
	public void sendSms() {
		System.out.println("Through SMS..");
	}
}
