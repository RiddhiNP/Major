package com.example.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int videoId;

	public Video() {
		super();
	}

	private String videoName;
	private String videoDesc;
	private String videoPath;
}
