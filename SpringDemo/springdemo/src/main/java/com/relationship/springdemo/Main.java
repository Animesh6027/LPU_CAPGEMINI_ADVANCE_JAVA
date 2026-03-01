package com.relationship.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	MessageService messageService = context.getBean(MessageService.class); // Singleton type - Only one Instance
    	MessageService messageService1 = context.getBean(MessageService.class); // Singleton type - Only one Instance
    	
    	messageService.sendMessage();  // method calling from Message class
    	messageService.displayMessage(); // method calling from Message class
    	System.out.println();
    	
    	System.out.println(messageService);
    	System.out.println(messageService1);
    	System.out.println(messageService==messageService1); // true - because address is same as it is singleton
    	System.out.println();
    	
    	EmailService emailService = context.getBean(EmailService.class); // Bean scope Prototype - multiple Instances
    	EmailService emailService1 = context.getBean(EmailService.class);// Bean scope Prototype - multiple Instances
    	
    	System.out.println(emailService);
    	System.out.println(emailService1);
    	System.out.println(emailService==emailService1); // false - because address is different as it is prototype
    	
    	emailService.destroy();
    	
    	((ClassPathXmlApplicationContext)context).close();
    }
}
