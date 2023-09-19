package com.test.springdemo.SpringDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.test.springdemo.bean.*;
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
         Employee emp=(Employee)context.getBean("empBean");
         System.out.println(emp);
    }
}
