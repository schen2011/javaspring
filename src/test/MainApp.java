package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   AbstractApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
      
      HelloSpring spring = (HelloSpring) context.getBean("getdata");
      //objA.setMessage("I'm object A");
      //objA.getMessage1();
      //((AbstractApplicationContext) context).registerShutdownHook();
      
      spring.getMessage();
      //HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      //objB.getMessage();
      
      objA.getMessage1();
      objA.getMessage2();

      HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
      objB.getMessage1();
      objB.getMessage2();
      objB.getMessage3();
   }
}