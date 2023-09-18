package com.springorm.JavaConfigDao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.JavaConfigEntity.Course;

public class CourseDaoImpl implements CourseDao{
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	@Override
	public int insert(Course course) {
		return (Integer)this.hibernateTemplate.save(course);
	}

	@Transactional
	@Override
	public boolean delete(Course course) {
		try {
			this.hibernateTemplate.delete(course);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Transactional
	@Override
	public boolean update(Course course) {
		try {
			this.hibernateTemplate.update(course);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Course getSingleCourse(int courseId) {
		return this.hibernateTemplate.get(Course.class,courseId);
	}

	@Override
	public List<Course> getAll() {
		return this.hibernateTemplate.loadAll(Course.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
