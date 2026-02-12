package com.hibernate.hibernate_demo;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.hibernate_demo.entity.Student;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        int choice = 0;

        do {
            System.out.println("\n===== STUDENT CRUD MENU =====");
            System.out.println("1. Create Student");
            System.out.println("2. Read Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createStudent(factory);
                    break;

                case 2:
                    readStudent(factory);
                    break;

                case 3:
                    updateStudent(factory);
                    break;

                case 4:
                    deleteStudent(factory);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        factory.close();
        sc.close();
    }

    // ================= CREATE =================
    public static void createStudent(SessionFactory factory) {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();

        Session session = null;
        Transaction transaction = null;

        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            Student student = new Student(id, name, age);
            session.persist(student);

            transaction.commit();
            System.out.println("Student inserted successfully!");

        } catch (Exception e) {

            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();

        } finally {

            if (session != null)
                session.close();
        }
    }

    // ================= READ =================
    public static void readStudent(SessionFactory factory) {

        System.out.print("Enter ID to fetch: ");
        int id = sc.nextInt();

        Session session = null;

        try {
            session = factory.openSession();

            Student student = session.get(Student.class, id);

            if (student != null) {
                System.out.println("Student Found:");
                System.out.println(student.getId() + " " +
                                   student.getName() + " " +
                                   student.getAge());
            } else {
                System.out.println("Student not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (session != null)
                session.close();
        }
    }

    // ================= UPDATE =================
    public static void updateStudent(SessionFactory factory) {

        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        Session session = null;
        Transaction transaction = null;

        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            Student student = session.get(Student.class, id);

            if (student != null) {

                System.out.println("What do you want to update?");
                System.out.println("1. Name");
                System.out.println("2. Age");
                System.out.println("3. Both");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        student.setName(newName);
                        break;

                    case 2:
                        System.out.print("Enter new age: ");
                        int newAge = sc.nextInt();
                        student.setAge(newAge);
                        break;

                    case 3:
                        System.out.print("Enter new name: ");
                        String name = sc.nextLine();
                        student.setName(name);

                        System.out.print("Enter new age: ");
                        int age = sc.nextInt();
                        student.setAge(age);
                        break;

                    default:
                        System.out.println("Invalid choice");
                        return;
                }

                transaction.commit();
                System.out.println("Student updated successfully!");

            } else {
                System.out.println("Student not found.");
            }

        } catch (Exception e) {

            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();

        } finally {

            if (session != null)
                session.close();
        }
    }


    // ================= DELETE =================
    public static void deleteStudent(SessionFactory factory) {

        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        Session session = null;
        Transaction transaction = null;

        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            Student student = session.get(Student.class, id);

            if (student != null) {

                session.remove(student);
                transaction.commit();

                System.out.println("Student deleted successfully!");

            } else {
                System.out.println("Student not found.");
            }

        } catch (Exception e) {

            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();

        } finally {

            if (session != null)
                session.close();
        }
    }
}
