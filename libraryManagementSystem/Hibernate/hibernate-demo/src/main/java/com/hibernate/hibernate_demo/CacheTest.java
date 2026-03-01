package com.hibernate.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.hibernate_demo.entity.Student;

public class CacheTest {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        // Enable statistics
        factory.getStatistics().setStatisticsEnabled(true);

        System.out.println("===== First Session =====");

        Session session1 = factory.openSession();
        Student s1 = session1.get(Student.class, 1);
        System.out.println("Student: " + s1.getName());
        session1.close();

        System.out.println("\n===== Second Session =====");

        Session session2 = factory.openSession();
        Student s2 = session2.get(Student.class, 1);
        System.out.println("Student: " + s2.getName());
        session2.close();

        System.out.println("\n===== Cache Statistics =====");
        System.out.println("Second Level Cache Hit Count: "
                + factory.getStatistics().getSecondLevelCacheHitCount());
        System.out.println("Second Level Cache Put Count: "
                + factory.getStatistics().getSecondLevelCachePutCount());

        factory.close();
    }
}
