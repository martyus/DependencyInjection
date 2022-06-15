package com.version1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Engine e = (Engine) context.getBean("engineBean");
        Car c = new Car("BMW", e, 4, 50);
        System.out.println(c);

        ((ConfigurableApplicationContext)context).close();
    }
}
