package com.springorm.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.springorm.dao.StudentDao;
import com.springorm.springorm.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/springorm/config.xml");
        StudentDao studentDaoImpl = context.getBean("studentDaoImpl",StudentDao.class);
        Student student = context.getBean("student",Student.class);
        student.setStudentId(103);
        student.setStudentName("Anish");
        student.setStudentCity("Bhopal");
        int isInserted = studentDaoImpl.insert(student);
        if(isInserted>0)
        	System.out.println("Data Insertded "+isInserted);
        else
        	System.out.println("Something went wrong!");
        	
        
    }
}
