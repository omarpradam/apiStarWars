package com.example.repository.infrastructure;

import com.example.entity.Movie;

public interface MovieServiceRepository {

	public Movie createMovie(Movie movie);
	public Movie DeleteMovie(Movie movie);
	public Movie searchByIdEpisode(Long idEpisode);
	

}
