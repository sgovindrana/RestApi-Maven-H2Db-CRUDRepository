package com.example.Stream.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
 	@GeneratedValue(strategy=GenerationType.AUTO)
	 int id;
	 String name;
	 int age;
	
	
	public Employee() {
		super();
	
	}

	public Employee(int id, String name, int age) {
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
	

	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	

	
}