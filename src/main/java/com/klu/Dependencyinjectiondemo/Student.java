package com.klu.Dependencyinjectiondemo;

public class Student {
int regNo;
public Student(int regNo, String name) {
	super();
	this.regNo = regNo;
	this.name = name;
}
public Student(int regNo) {
	super();
	this.regNo = regNo;
}
String name;
public Student() {
	System.out.println("Student constructor");
}
public void displayInfo() {
	System.out.println("displayInfo()");
	System.out.println("register no:"+regNo);
	System.out.println("name:"+name);
}
}
