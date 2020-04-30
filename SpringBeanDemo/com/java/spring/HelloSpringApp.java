package com.java.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        //load spring configuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        //call methods on bean
        System.out.println(theCoach.getFortune());
        //close context
        context.close();

    }
}
