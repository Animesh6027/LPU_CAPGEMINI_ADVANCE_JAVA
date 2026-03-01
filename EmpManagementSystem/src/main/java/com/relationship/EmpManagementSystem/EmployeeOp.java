package com.relationship.EmpManagementSystem;

import java.awt.datatransfer.Transferable;
import java.util.Scanner;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Employee;
public class EmployeeOp{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

	}
	public void saveEmployee(SessionFactory factory, Employee employee) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee DepartMent: ");
		String department = sc.nextLine();
		
		System.out.println("Enter Employee Salary: ");
		double salary = sc.nextDouble();
		
		Session session = null;
		Transaction transaction = null;
		
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			employee = new Employee(id, name, department, salary);
			session.persist(employee);
			
			transaction.commit();
			System.out.println("Employee inserted successfully");
		}catch(Exception e){
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}
	
	
	public void 
}