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
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    private String courseName;
    private String courseDesc;
    private String courseLogo;
    private int coursePrice;
    
//    @OneToMany(targetEntity = Like.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name="courseId", referencedColumnName = "courseId")
//    List<Like> likes;
    
    @ManyToMany(targetEntity = Video.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Video> video;
    
   
}
