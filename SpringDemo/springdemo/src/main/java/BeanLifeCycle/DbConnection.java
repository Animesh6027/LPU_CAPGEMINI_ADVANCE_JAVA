package BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class DbConnection {
	
//	private String dbName;
	public DbConnection() {
		System.out.println("DB Constructor is being called!!");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("DB Init method is being called!!");
	} 
	 
	public void executeQuery() {
		System.out.println("Query is being executed!!");
		System.out.println("SELECT * FROM EMP");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method is being called before Object Destruction!!");
	}
	
	
}
