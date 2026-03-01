package com.hibernate.hibernate_demo.entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Id;

@Cacheable
@Entity
@Table(name="Student_Table")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class Student {
	
	@Id
	private int id;
	private String name;
	private int age;
	
	public Student() {}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//	@Override
//	public String toString() {
//	    return "Student [id=" + id + 
//	           ", name=" + name + 
//	           ", age=" + age + "]";
//	}
	
}
