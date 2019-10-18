package org.koushik.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.koushik.javabrains.dto.UserDetails;

import com.hibernate.compositekey.Accounts;
import com.hibernate.compositekey.CompoundKey;

public class HibernateTest 
{
	public static void main(String[] args)
	{
		  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		  Session session = sessionFactory.openSession(); 
		  session.beginTransaction(); 
		  
		  CompoundKey key1 = new CompoundKey(100,1001);
		  Accounts savings= new Accounts();
		  savings.setCompoundkey(key1);
		  savings.setAccountBalance(8500);
		  
		  CompoundKey key2 = new CompoundKey(100,2001);
		  Accounts checkings= new Accounts();
		  checkings.setCompoundkey(key2);
		  checkings.setAccountBalance(9400);
		  
		  session.save(savings);
		  session.save(checkings);
		  session.getTransaction().commit();
		 
	}
}
