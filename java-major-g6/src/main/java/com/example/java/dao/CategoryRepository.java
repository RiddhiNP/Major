package com.example.java.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.java.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

	

}
