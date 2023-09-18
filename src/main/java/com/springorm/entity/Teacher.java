package com.springorm.entity;

import javax.persistence.*;

@Entity
@Table(name="teacher")
public class Teacher {
	
	@Id
	@Column(name="teacher_id",nullable = false)
	private int teacherId;
	@Column(name="teacher_name",nullable = false)
	private String teacherName;
	@Column(name="teacher_city",nullable = false)
	private String teacherCity;
	@Column(name="subject",nullable = false)
	private String subject;
	
	public Teacher() {
		super();
	}
	
	public Teacher(int teacherId, String teacherName, String teacherCity, String subject) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherCity = teacherCity;
		this.subject = subject;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherCity() {
		return teacherCity;
	}
	public void setTeacherCity(String teacherCity) {
		this.teacherCity = teacherCity;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}
