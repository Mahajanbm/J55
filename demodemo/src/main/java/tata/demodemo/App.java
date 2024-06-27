package tata.demodemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emple.demo.Org;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
       Org o1=(Org) c1.getBean("mmmm");
       o1.data();
    }
}
