package BeanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("===Container Starting===\n");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
		
		System.out.println("\n===Using Bean===");
		DbConnection dbConnection = context.getBean(DbConnection.class);
		dbConnection.executeQuery();
		
		System.out.println("\n===Container Closing===");
		
		context.close();
	}
}
