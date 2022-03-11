package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Course;
import com.example.demo.model.Instructor;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class HibernateMappintOne2manyApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(HibernateMappintOne2manyApplication.class, args);
	
	InstructorRepository instructorRepository=context.getBean("instructorRepository",InstructorRepository.class);
	Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
	Course tempCourse2 = new Course("The Pinball Masterclass");
	Instructor tempIntstInstructor=new Instructor();
	tempIntstInstructor.setFirstName("John");
	tempIntstInstructor.setLastName("Doe");
	tempIntstInstructor.setEmail("john@email.com");
	tempIntstInstructor.add(tempCourse1);
	tempIntstInstructor.add(tempCourse2);
	Instructor i= instructorRepository.save(tempIntstInstructor);
	log.info("{} ",i);
	}

}
