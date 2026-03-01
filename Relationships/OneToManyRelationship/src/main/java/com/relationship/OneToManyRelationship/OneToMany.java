package com.relationship.OneToManyRelationship;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import OneToMany.Department;
import OneToMany.Employee;

public class OneToMany {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Scanner sc = new Scanner(System.in);

        while (true) {

            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Department with Employees");
            System.out.println("2. View All Departments");
            System.out.println("3. Add Employee to Existing Department");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Delete Department");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // 1️⃣ Add Department
                case 1:
                    System.out.print("Enter Department Name: ");
                    String deptName = sc.nextLine();

                    System.out.print("Enter Location: ");
                    String location = sc.nextLine();

                    Department dept = new Department();
                    dept.setDeptName(deptName);
                    dept.setLocation(location);

                    System.out.print("How many employees? ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 1; i <= n; i++) {

                        System.out.println("Employee " + i);

                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Salary: ");
                        double salary = sc.nextDouble();
                        sc.nextLine();

                        Employee emp = new Employee();
                        emp.setEmpName(name);
                        emp.setSalary(salary);

                        dept.addEmployee(emp);
                    }

                    session.persist(dept);
                    System.out.println("Department Added!");
                    break;

                // 2️⃣ View All
                case 2:
                    List<Department> departments =
                            session.createQuery("from Department", Department.class).list();

                    for (Department d : departments) {
                        System.out.println("\nDept ID: " + d.getDeptId());
                        System.out.println("Name: " + d.getDeptName());
                        System.out.println("Location: " + d.getLocation());

                        for (Employee e : d.getEmployee()) {
                            System.out.println("   Employee: " + e.getEmpName()
                                    + " | Salary: " + e.getSalary());
                        }
                    }
                    break;

                // 3️⃣ Add Employee to Existing Dept
                case 3:
                    System.out.print("Enter Department ID: ");
                    int deptId = sc.nextInt();
                    sc.nextLine();

                    Department existingDept =
                            session.get(Department.class, deptId);

                    if (existingDept != null) {

                        System.out.print("Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Salary: ");
                        double salary = sc.nextDouble();
                        sc.nextLine();

                        Employee emp = new Employee();
                        emp.setEmpName(name);
                        emp.setSalary(salary);

                        existingDept.addEmployee(emp);

                        session.merge(existingDept);
                        System.out.println("Employee Added!");
                    } else {
                        System.out.println("Department Not Found!");
                    }
                    break;

                // 4️⃣ Update Employee Salary
                case 4:
                    System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();

                    Employee empToUpdate =
                            session.get(Employee.class, empId);

                    if (empToUpdate != null) {
                        System.out.print("Enter New Salary: ");
                        double newSalary = sc.nextDouble();
                        empToUpdate.setSalary(newSalary);
                        session.update(empToUpdate);
                        System.out.println("Salary Updated!");
                    } else {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                // 5️⃣ Delete Department
                case 5:
                    System.out.print("Enter Department ID to Delete: ");
                    int deleteId = sc.nextInt();

                    Department deptToDelete =
                            session.get(Department.class, deleteId);

                    if (deptToDelete != null) {
                        session.delete(deptToDelete);
                        System.out.println("Department Deleted!");
                    } else {
                        System.out.println("Department Not Found!");
                    }
                    break;

                case 6:
                    tx.commit();
                    session.close();
                    factory.close();
                    sc.close();
                    System.out.println("Exited Successfully!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }

            tx.commit();
            session.close();
        }
    }
}
