package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//xml
//java base
//annotation

//field
//constructor
//setter

public class App {
    public static void main( String[] args ) {
        ApplicationContext ap = new AnnotationConfigApplicationContext(RootConfiguration.class);
        User user = (User) ap.getBean("user");
        User user2 = (User) ap.getBean("user2");
        System.out.println(user);
        System.out.println(user2);
        AnnotationConfigApplicationContext annotationConfigApplicationContext = (AnnotationConfigApplicationContext) ap;
        annotationConfigApplicationContext.close();
    }
}
