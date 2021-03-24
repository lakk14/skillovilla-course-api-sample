package com.skillovilla.service;

import org.springframework.stereotype.Service;

import com.skillovilla.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Override
	public Course getCourseDetails(int courseId) {

		// This place is supposed to connect and fetch data from Database
		Course course = new Course("1", "Data Structures using C++	",
				"Learn Data structures in C++ from Industry Experts",
				"This course Data Structures and Algorithms focus on building concepts of students in this domain. Data Structures like Trees, Linked list and others are explained in depth so that students have better understanding of these topics and coding lectures are helpful in getting depth understanding.Coding lectures beside graphical explanation in this course make it easier to understand things. Algorithms are explained and coded so that students learn better.So this course is for students who want to learn in fun and easy way, and get understanding of things in Data Structures and Algorithms.",
				4.5, "/iconImage.png", "/banner.webp", "t1", 1999, 1499, true, "INR", "One time");

		// Assuming there is only one course with courseID "1"
		if (courseId != 1) {
			return null;
		} else {
			return course;
		}

	}

}
