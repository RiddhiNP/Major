package com.example.java.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Likes")
public class Like {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int likeId;
	
	@ManyToOne(targetEntity = Course.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="courseId", referencedColumnName = "courseId")
	private Course course;
	
}
