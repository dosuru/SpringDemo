package com.Tulasi.Project.SpringJdbc.engineer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Tulasi.Project.SpringJdbc.engineer.dao.EngineerDao;
import com.Tulasi.Project.SpringJdbc.engineer.dto.Engineer;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("Jdconfig.xml");
		EngineerDao dao = (EngineerDao) ctx.getBean("jt");
		
		Engineer engineer1 = new Engineer();
		engineer1.setId(13); 
		engineer1.setFirstname("Tulasirao");
		engineer1.setLastname("kohli");
		
		Engineer engineer2 = new Engineer();
		engineer1.setId(14); 
		engineer1.setFirstname("Tulasirao");
		engineer1.setLastname("King");
		
		//dao.create(engineer1);
		//dao.update(engineer1);
		dao.delete(13);
		
		

	}

}
