package com.example.java.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;
    private String categoryName;
    private String categoryDesc;
    private String categoryLogo;
    
//    @OneToMany(targetEntity = Course.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name="categoryId", referencedColumnName = "categoryId")
//    List<Course> courses;

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDesc="
				+ categoryDesc + ", categoryLogo=" + categoryLogo  + "]";
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getCategoryLogo() {
		return categoryLogo;
	}

	public void setCategoryLogo(String categoryLogo) {
		this.categoryLogo = categoryLogo;
	}
    
    
}
