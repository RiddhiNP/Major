package com.example.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java.dao.CategoryRepository;
import com.example.java.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository cr;
	

	@Override
	public Optional<Category> getCategoryById(int id) {
		
		return cr.findById(id);
	}


	@Override
	public List<Category> getAllCategory() {
		return cr.findAll();
		
	}


	@Override
	public boolean addCategory(Category c) {
		return cr.save(c) != null;
	}


	@Override
	public void deleteCategory(Category c) {
		cr.delete(c);
	}

}
