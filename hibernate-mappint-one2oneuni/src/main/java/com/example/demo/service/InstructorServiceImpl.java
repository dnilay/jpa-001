package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.dao.InstructorDao;
import com.example.demo.dao.InstructorDetailDao;
import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class InstructorServiceImpl implements InstructorService{
	
	private final InstructorDao instructorDao;
	//private final InstructorDetailDao instructorDetailDao;

	@Override
	public Instructor createInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		return instructorDao.save(instructor);
	}

	@Override
	public List<Instructor> displayAllInstructor() {
		// TODO Auto-generated method stub
		return instructorDao.findAll();
	}

	/*
	 * @Override public InstructorDetail createInstructorDetails(InstructorDetail
	 * instructorDetail) { // TODO Auto-generated method stub return
	 * instructorDetailDao.save(instructorDetail); }
	 * 
	 * @Override public List<InstructorDetail> fetchAllInstructorDetails() { // TODO
	 * Auto-generated method stub return instructorDetailDao.findAll(); }
	 */
	

}
