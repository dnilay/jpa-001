package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;

public interface InstructorService {
	
	public Instructor createInstructor(Instructor instructor);
	
	public List<Instructor> displayAllInstructor();

	/*
	 * public InstructorDetail createInstructorDetails(InstructorDetail
	 * instructorDetail); public List<InstructorDetail> fetchAllInstructorDetails();
	 */}
