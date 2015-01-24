
package com.mycompany.mavenproject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = 
                new AnnotationConfigApplicationContext(BeansConfig.class);
//                new ClassPathXmlApplicationContext("context2.xml");
        Car car = applicationContext.getBean("carWithDiesel", Car.class);
        car.go();
               
    }
}
