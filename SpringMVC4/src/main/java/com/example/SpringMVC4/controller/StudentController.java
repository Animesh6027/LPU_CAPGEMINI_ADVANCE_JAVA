package com.example.SpringMVC4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SpringMVC4.model.Student;
import com.example.SpringMVC4.service.StudentService;

import org.springframework.ui.Model;



@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/register")
	
	//  @ModelAttribute-- binding form data to student object
	public String registerStudent(@ModelAttribute Student student ,Model model) {
		// student service - to forward data to dao or repository and then recieve the response
		studentService.saveStudent(student);
		// model sends data to JSP view
		model.addAttribute("name",student.getName());
		return "Success";// return view name (success.jsp)
		
		
	}
@GetMapping("/register")
	public  String showForm() {
	return "Register";
}
	
	
	
	

}