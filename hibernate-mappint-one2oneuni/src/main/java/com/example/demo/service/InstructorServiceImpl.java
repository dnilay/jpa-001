package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.InstructorDao;
import com.example.demo.entity.Instructor;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class InstructorServiceImpl implements InstructorService{
	
	private final InstructorDao instructorDao;

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

}
