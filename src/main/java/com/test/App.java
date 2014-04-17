package com.test;

import com.test.components.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )  {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        SomeService someService = context.getBean(SomeService.class);
        System.out.println( "Hello World!" + someService.getSomeSum() );
    }
}
