package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Instructor;
import com.example.demo.entity.InstructorDetail;
import com.example.demo.service.InstructorService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class HibernateMappintOne2oneuniApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(HibernateMappintOne2oneuniApplication.class, args);
		
		
		InstructorService instructorService=context.getBean("instructorServiceImpl",InstructorService.class);
		Instructor instructor =new Instructor(1, "Marry", "Public","marry@email.com");
		InstructorDetail details=new InstructorDetail(1, "channel-1", "Guiter");
		instructor.setInstructorDetail(details);
		Instructor i=instructorService.createInstructor(instructor);
		log.info("Instructor  Created {} {}",i);
		/*
		 * List<Instructor> list=instructorService.displayAllInstructor();
		 * //log.info("{}",list); System.out.println(list);
		 */
	}

}
