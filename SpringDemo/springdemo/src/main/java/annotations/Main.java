package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("=== Constructor Injection (@Autowired) ===");
		ConstructorInjectionService constructorInjectionService = context.getBean(ConstructorInjectionService.class);
		constructorInjectionService.display();
		
		System.out.println("=== Field Injection (@Autowired) ===");
		FieldInjectionService fieldInjectionService = context.getBean(FieldInjectionService.class);
		fieldInjectionService.sendMessage();
		
		System.out.println("=== Setter Injection (@Autowired) ===");
		SetterInjectionService setterInjectionService = context.getBean(SetterInjectionService.class);
		setterInjectionService.sendMsg();
		
		
		MessageService messageService = context.getBean(MessageService.class);
		messageService.sendMessage();
		context.close();
		
		
	}
}
