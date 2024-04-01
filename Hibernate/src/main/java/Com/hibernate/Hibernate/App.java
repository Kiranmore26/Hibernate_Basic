package Com.hibernate.Hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	Scanner sc= new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App a=new App();
//        a.Basic();
        a.insert2();
        
    }
    
    
    //Method Too insert Value as per the Old Way
    public void insert()
    {
    	
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Cricketers c = new Cricketers();
    	System.out.println("Enter Your Name");
    	c.setName(sc.next());
    	System.out.println("Enter No of Matches Played");
    	c.setMatch_played(sc.nextInt());
    	System.out.println("Enter total no of Score");
    	c.setTotal_Score(sc.nextInt());
    	
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(c);
    	tx.commit();
    	session.close();
    }
    
    
    //method too insert the value through new way
    public void insert2() 
    {
    	
    	
		Session session=HibernateUtil.getSession();
		
		Cricketers c = new Cricketers();
    	System.out.println("Enter Your Name");
    	c.setName(sc.next());
    	System.out.println("Enter No of Matches Played");
    	c.setMatch_played(sc.nextInt());
    	System.out.println("Enter total no of Score");
    	c.setTotal_Score(sc.nextInt());
    	
    	Transaction tx=session.beginTransaction();
    	session.save(c);
    	tx.commit();
    	session.close();
    }
    
    
    public void display()
    {
    	
    }
    
}
