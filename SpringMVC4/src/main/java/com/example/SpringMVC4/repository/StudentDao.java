package com.example.SpringMVC4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringMVC4.model.Student;


@Repository
public interface StudentDao extends JpaRepository<Student, Long>{
//	public void saveStudent(Student student) {
//		System.out.println("Saved to DB:"+student.getName());
//	}

}