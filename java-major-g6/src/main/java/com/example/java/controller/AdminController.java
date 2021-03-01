package com.example.java.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.model.Category;
import com.example.java.service.CategoryServiceImpl;

@RestController
public class AdminController {
	
	@Autowired
	private CategoryServiceImpl csi;
	
	@GetMapping("/category")
	public  List<Category> AllCategory(){
		
		List<Category> li = csi.getAllCategory();
		for(Category l:li) {
			System.out.println(l);
		}
		return li;
		
	}
	@GetMapping("/category/{id}")
	
	public Optional<Category> CategoryById(@PathVariable int id) {
		System.out.println(id);
		return csi.getCategoryById(id);
		
	}
	@PostMapping("/category")
	public boolean addCategory(@RequestBody Category c) {
		return csi.addCategory(c);
		
	}

}
