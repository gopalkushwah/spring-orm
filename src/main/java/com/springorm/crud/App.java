package com.springorm.crud;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springorm.dao.TeacherDao;
import com.springorm.entity.Teacher;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/crud/config.xml");
		Teacher teacher = context.getBean("teacher",Teacher.class);
		TeacherDao teacherDaoImpl = context.getBean("teacherDaoImpl",TeacherDao.class);
		
		teacher.setTeacherId(106);
		teacher.setTeacherName("Ritik");
		teacher.setTeacherCity("Up");
		teacher.setSubject("Hibernate");
//		Insert data
//		int insert = teacherDaoImpl.insert(teacher);
//		if (insert>0) {
//			System.out.println("Inserted");
//		}else
//			System.out.println("cant insert");
		
		
//		update data
//		boolean update = teacherDaoImpl.update(teacher);
//		if (update) {
//			System.out.println("Updated");
//		}else
//			System.out.println("cant update");
		
		
//		ḍelete data
//		boolean delete = teacherDaoImpl.delete(teacher);
//		if (delete) {
//			System.out.println("deleted");
//		}else
//			System.out.println("cant delete");
		
		
//		select/ get single object
//		Teacher teacher1 = teacherDaoImpl.getSingleTeacher(101);
//		if (teacher1!=null) {
//			System.out.println(teacher1.getTeacherId());
//			System.out.println(teacher1.getTeacherName());
//			System.out.println(teacher1.getTeacherCity());
//			System.out.println(teacher1.getSubject());
//		}else
//			System.out.println("cant get");
		
		
//		get all the data
		List<Teacher> teacherList = teacherDaoImpl.getAllTeachers();
		if (teacherList!=null) {
			for(Teacher teacher1 : teacherList) {
				System.out.println(teacher1.getTeacherId());
				System.out.println(teacher1.getTeacherName());
				System.out.println(teacher1.getTeacherCity());
				System.out.println(teacher1.getSubject());
				System.out.println("=====================================");
			}
		}else
			System.out.println("cant load");
	}

}
