package com.springorm.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.springorm.entity.Teacher;

public class TeacherDaoImpl implements TeacherDao{

	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	@Override
	public int insert(Teacher teacher) {
//		insert data
		Integer save = (Integer)hibernateTemplate.save(teacher);
		return save;
	}

	@Transactional
	@Override
	public boolean update(Teacher teacher) {
		try {
			hibernateTemplate.update(teacher);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Transactional
	@Override
	public boolean delete(Teacher teacher) {
		try {
			hibernateTemplate.delete(teacher);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public Teacher getSingleTeacher(int teacherId) {
		return this.hibernateTemplate.get(Teacher.class, teacherId);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return this.hibernateTemplate.loadAll(Teacher.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
