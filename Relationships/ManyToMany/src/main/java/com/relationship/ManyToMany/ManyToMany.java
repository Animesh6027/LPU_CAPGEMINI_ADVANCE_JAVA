package com.relationship.ManyToMany;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import ManyToMany.*;

public class ManyToMany {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Scanner sc = new Scanner(System.in);

        while (true) {

            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student in Course");
            System.out.println("4. View All Students");
            System.out.println("5. Update Student Name");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();

                    Student student = new Student();
                    student.setStudentName(sname);

                    session.persist(student);
                    System.out.println("Student Added!");
                    break;

                case 2:
                    System.out.print("Enter Course Name: ");
                    String cname = sc.nextLine();

                    Course course = new Course();
                    course.setCourseName(cname);

                    session.persist(course);
                    System.out.println("Course Added!");
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();

                    System.out.print("Enter Course ID: ");
                    int cid = sc.nextInt();

                    Student s = session.get(Student.class, sid);
                    Course c = session.get(Course.class, cid);

                    if (s != null && c != null) {
                        s.addCourse(c);
                        session.merge(s);
                        System.out.println("Enrollment Successful!");
                    } else {
                        System.out.println("Invalid Student or Course ID!");
                    }
                    break;

                case 4:
                    List<Student> students =
                        session.createQuery(
                            "select distinct s from Student s left join fetch s.courses",
                            Student.class).list();

                    for (Student st : students) {
                        System.out.println("\nID: " + st.getStudentId());
                        System.out.println("Name: " + st.getStudentName());

                        for (Course cr : st.getCourses()) {
                            System.out.println("   Course: " + cr.getCourseName());
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    Student updateStudent =
                            session.get(Student.class, updateId);

                    if (updateStudent != null) {
                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();
                        updateStudent.setStudentName(newName);
                        session.update(updateStudent);
                        System.out.println("Student Updated!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter Student ID: ");
                    int deleteId = sc.nextInt();

                    Student deleteStudent =
                            session.get(Student.class, deleteId);

                    if (deleteStudent != null) {
                        session.delete(deleteStudent);
                        System.out.println("Student Deleted!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 7:
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
