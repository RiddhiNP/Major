package com.example.java.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
