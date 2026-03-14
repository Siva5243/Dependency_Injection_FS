package com.klu.Dependencyinjectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("springbeans.xml");

        Student st2 = (Student) context.getBean("student");

        st2.displayInfo();
    }
}