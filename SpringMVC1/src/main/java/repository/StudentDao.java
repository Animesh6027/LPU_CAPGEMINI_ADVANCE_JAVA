package repository;

import org.springframework.stereotype.Repository;

import model.Student;
@Repository
public class StudentDao {
	public void saveStudent(Student student) {
		System.out.println("Saved to DB:"+student.getName());
	}

}