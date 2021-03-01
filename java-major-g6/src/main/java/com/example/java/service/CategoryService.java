package com.example.java.service;

import java.util.List;
import java.util.Optional;

import com.example.java.model.Category;

public interface CategoryService {
	public List<Category> getAllCategory();
	public Optional<Category> getCategoryById(int id);
	public boolean addCategory(Category c);
	public void deleteCategory(Category c);
	
}
