package com.example.SpringMVC4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringMVC4.model.Student;
import com.example.SpringMVC4.repository.StudentDao;


@Service

public class StudentService {
	@Autowired
	private StudentDao studentDao;
	public void saveStudent(Student student) {
		studentDao.save(student);
			
	}
	

}