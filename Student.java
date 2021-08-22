package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name : Raja");
	}
	
	public void studentDept() {
		System.out.println("Student Department : IT");
	}
	
	public void studentId() {
		System.out.println("Student ID : 55");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentObj= new Student();
		
		studentObj.collegeName();
		studentObj.collegeCode();
		studentObj.collegeRank();
		studentObj.deptName();
		studentObj.studentName();
		studentObj.studentDept();
		studentObj.studentId();
		
	}

}
