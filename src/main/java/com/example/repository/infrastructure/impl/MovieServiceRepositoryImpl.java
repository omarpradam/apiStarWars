package com.example.repository.infrastructure.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Movie;
import com.example.repository.MovieRepository;
import com.example.repository.infrastructure.MovieServiceRepository;

@Service("MovieServiceRepositoryImpl")
public class MovieServiceRepositoryImpl implements MovieServiceRepository {

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public Movie createMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieRepository.save(movie);
	}

	@Override
	public Movie DeleteMovie(Movie movie) {
		 movieRepository.delete(movie);
		return null;
	}

	@Override
	public Movie searchByIdEpisode(Long idEpisode) {
		// TODO Auto-generated method stub
		return movieRepository.findByIdEpisode(idEpisode);
	}

}
