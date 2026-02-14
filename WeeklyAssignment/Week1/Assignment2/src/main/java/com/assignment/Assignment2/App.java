package com.assignment.Assignment2;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Menu;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        int choice = 0;

        do {
            System.out.println("\n===== RESTAURANT MENU =====");
            System.out.println("1. Add Menu Item");
            System.out.println("2. View All Items");
            System.out.println("3. Update Price");
            System.out.println("4. Delete Item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addItem(factory);
                    break;

                case 2:
                    viewItems(factory);
                    break;

                case 3:
                    updatePrice(factory);
                    break;

                case 4:
                    deleteItem(factory);
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

    public static void addItem(SessionFactory factory) {

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Is Available (true/false): ");
        boolean available = sc.nextBoolean();

        Session session = null;
        Transaction transaction = null;

        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            Menu item = new Menu(name, price, category, available);
            session.persist(item);

            transaction.commit();
            System.out.println("Menu Item Added Successfully!");

        } catch (Exception e) {

            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();

        } finally {

            if (session != null)
                session.close();
        }
    }

    public static void viewItems(SessionFactory factory) {

        Session session = null;

        try {
            session = factory.openSession();

            List<Menu> items = session
                    .createQuery("from Menu", Menu.class)
                    .list();

            if (items.isEmpty()) {
                System.out.println("No menu items found.");
            } else {
                for (Menu item : items) {
                    System.out.println(item);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            if (session != null)
                session.close();
        }
    }

    public static void updatePrice(SessionFactory factory) {

        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        Session session = null;
        Transaction transaction = null;

        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            Menu item = session.get(Menu.class, id);

            if (item != null) {

                System.out.print("Enter new price: ");
                double newPrice = sc.nextDouble();
                item.setPrice(newPrice);

                transaction.commit();
                System.out.println("Price Updated Successfully!");

            } else {
                System.out.println("Item not found.");
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

    public static void deleteItem(SessionFactory factory) {

        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        Session session = null;
        Transaction transaction = null;

        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            Menu item = session.get(Menu.class, id);

            if (item != null) {

                session.remove(item);
                transaction.commit();
                System.out.println("Item Deleted Successfully!");

            } else {
                System.out.println("Item not found.");
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
