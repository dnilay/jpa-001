package com.example.demo;

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
		
		InstructorDetail instructorDetail=new InstructorDetail(1, "youtube-channel-1","Coading" );
		Instructor instructor=new Instructor(1, "John", "Doe", "john@email.com", instructorDetail);
		InstructorService instructorService=context.getBean("instructorServiceImpl",InstructorService.class);
		
		Instructor temp=instructorService.createInstructor(instructor);
		log.info("Instructor Created {}",temp);
	}

}
