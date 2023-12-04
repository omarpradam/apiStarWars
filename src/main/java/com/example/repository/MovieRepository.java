package com.example.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Movie;

@Repository("movieRepository")
public interface MovieRepository extends JpaRepository<Movie, Serializable>{
	
	Movie findByIdEpisode(Long idEpisode);


}
