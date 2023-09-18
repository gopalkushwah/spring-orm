package com.springorm.JavaConfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springorm.JavaConfigDao.CourseDao;
import com.springorm.JavaConfigEntity.Course;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		CourseDao courseDaoImpl = context.getBean("courseDaoImpl",CourseDao.class);
		Course course = context.getBean("course",Course.class);
		
//		course.setCourseId(106);
//		course.setCourseName("React");
//		course.setCoursePrice(5000.0);
		
//		int insert = courseDaoImpl.insert(course);
//		if(insert>0)
//			System.out.println("inserted");
//		else
//			System.out.println("error");
		
//		boolean update = courseDaoImpl.update(course);
//		if(update)
//			System.out.println("updated");
//		else
//			System.out.println("error");
//		
//		boolean delete = courseDaoImpl.delete(course);
//		if(delete)
//			System.out.println("deleted");
//		else
//			System.out.println("error");
		
//		course = courseDaoImpl.getSingleCourse(102);
//		System.out.println(course.getCourseId());
//		System.out.println(course.getCourseName());
//		System.out.println(course.getCoursePrice());
		
		List<Course> list = courseDaoImpl.getAll();
		for(Course co : list) {
			System.out.println(co.getCourseId());
			System.out.println(co.getCourseName());
			System.out.println(co.getCoursePrice());
			System.out.println("----------------------------------------------");
		}
		
	}

}
