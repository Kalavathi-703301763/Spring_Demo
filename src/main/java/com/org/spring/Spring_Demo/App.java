package com.org.spring.Spring_Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        HelloWorldService service=(HelloWorldService) con.getBean("hello");
        MyBean bean=(MyBean) con.getBean("hi");
        
       String m1= service.InfoData();
        
        System.out.println(m1);
        
        //set new name
        service.setName("Spring");
        service.setAddress("java");
        m1 = service.InfoData();
        System.out.println(m1);
        System.out.println( "Hello World!" );
        String m2= bean.InfoData();
        
        System.out.println(m2);
        
        //set new name
        bean.setName(" corona ");
        bean.setAddress(" china ");
        m2 = bean.InfoData();
        System.out.println(m2);
        
        				
        
    }
}
