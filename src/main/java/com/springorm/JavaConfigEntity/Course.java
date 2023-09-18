package com.springorm.JavaConfigEntity;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Table(name="course_details")
public class Course {

	@Id
	@Column(name="course_id",nullable = false)
	private int courseId;
	@Column(name="course_name",nullable = false)
	private String courseName;
	@Column(name="course_price",nullable = false)
	private double coursePrice;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
}
