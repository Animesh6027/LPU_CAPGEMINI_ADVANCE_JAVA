package primary_qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryQualifierDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrimaryQualifierConfig.class);
		NotificationManager manager = context.getBean(NotificationManager.class);
		manager.sendNotification();
		manager.sendEmailNotification();
		manager.sendPushNotification();
		context.close();
		
	}
}
