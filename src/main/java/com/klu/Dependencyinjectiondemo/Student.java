package com.klu.Dependencyinjectiondemo;

public class Student {

    private int regNo;
    private String name;
    private double percentage;

    public Student() {
        System.out.println("Student Default Constructor");
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void displayInfo() {
        System.out.println("Inside displayInfo()");
        System.out.println("Register No : " + regNo);
        System.out.println("Name : " + name);
        System.out.println("Percentage : " + percentage);
    }
}