package lazy_Demo;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {
	public EagerBean() {
		System.out.println("Eager Bean Created at startup");
	}
	
	public void run() {
		System.out.println("Eager Bean has been started");
	}
}
