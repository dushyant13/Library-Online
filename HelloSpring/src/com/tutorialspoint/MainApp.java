package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld2");
      HelloWorld obj3 = (HelloWorld) context.getBean("helloMessage");
      obj.getMessage();
      obj2.getMessage();
      obj3.getMessage2();
      // This is the first update to the file to check the change on git.
      // just for checking if its getting updated to develpment branch.
   }
}