package com.example.java.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java.model.Video;

public interface VideoRepository extends JpaRepository<Video, Integer>{

}
