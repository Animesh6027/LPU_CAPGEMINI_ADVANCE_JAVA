package lazy_Demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("Container Creation");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyConfig.class);
		
		
		LazyBean lazyBean = context.getBean(LazyBean.class);
		System.out.println("Container has started");
		lazyBean.start();
		
		EagerBean eagerBean = context.getBean(EagerBean.class);
		eagerBean.run();
		
		
		context.close();
	}
}
