package com.ancile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ancile.bean.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	Employee e = (Employee) context.getBean("employeebean");
    	System.out.println(e);
    }
}
