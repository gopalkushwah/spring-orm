package com.springorm.dao;

import java.util.List;

import com.springorm.entity.Teacher;

public interface TeacherDao {
	public int insert(Teacher teacher);
	public boolean update(Teacher teacher);
	public boolean delete(Teacher teacher);
	public Teacher getSingleTeacher(int teacherId);
	public List<Teacher> getAllTeachers();
}
