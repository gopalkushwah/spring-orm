package com.springorm.JavaConfigDao;

import java.util.List;

import com.springorm.JavaConfigEntity.Course;

public interface CourseDao {
	public int insert(Course course);
	public boolean delete(Course course);
	public boolean update(Course course);
	public Course getSingleCourse(int courseId);
	public List<Course> getAll();
	
}
