package com.klu.Dependencyinjectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeen.xml");

        Student s1 = context.getBean("student", Student.class);
        Student s2 = (Student)context.getBean("student", Student.class);
       // s2.regNo=101;
        // s2.name ="raju";
   
        s2.displayInfo();
    }
}
