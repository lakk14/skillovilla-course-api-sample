package com.skillovilla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skillovilla.model.Course;
import com.skillovilla.service.CourseService;
import com.skillovilla.util.Messages.MessageResponse;
import com.skillovilla.util.ResponseCodes.HttpStatusCode;
import com.skillovilla.util.ResponseMessage;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping(path = "/course/{courseId}")
	public ResponseEntity<ResponseMessage<Course>> getCourses(final HttpEntity<String> httpEntity,
			@PathVariable final int courseId) {
		final ResponseMessage<Course> responseMessage = new ResponseMessage<>();

		Course course = courseService.getCourseDetails(courseId);

		if (course != null) {
			responseMessage.setStatus(HttpStatusCode.OK.getCode());
			responseMessage.setMessage(HttpStatusCode.OK.getDesc());
			responseMessage.setResult(course);
			return new ResponseEntity<>(responseMessage, HttpStatus.OK);
		} else {
			responseMessage.setStatus(HttpStatusCode.BAD_REQUEST.getCode());
			responseMessage.setMessage(MessageResponse.FAIL.getMessage());
			responseMessage.setResult(null);
			return new ResponseEntity<>(responseMessage, HttpStatus.BAD_REQUEST);
		}
	}
}
