package com.springorm.springorm.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.springorm.entity.Student;


public class StudentDaoImpl implements StudentDao{

	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	@Override
	public int insert(Student student) {
		Integer saved = (Integer)hibernateTemplate.save(student);
		return saved;
	}
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
