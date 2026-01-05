package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];// [new Student(), null, null]
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
	}
	
	public void insertStudent(String name, int age, int grade, String major) {
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, int salary, String dept) {
		
	}
	
	public Employee[] printEmployee() {
		
	}
	
}