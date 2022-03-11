package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.InstructorDetail;
@Repository
public interface InstructorDetailDao extends JpaRepository<InstructorDetail, Integer> {

}
