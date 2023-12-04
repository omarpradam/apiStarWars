package com.example.infrastructure.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.MovieDto;
import com.example.dto.MovieResponService;
import com.example.entity.Movie;
import com.example.infrastructure.MovieService;
import com.example.repository.infrastructure.impl.MovieServiceRepositoryImpl;

@Service("MovieServiceImpl")
public class MovieServiceImpl implements MovieService {

	
	@Autowired
	private MovieServiceRepositoryImpl movieServiceRepositoryImpl;

	@Override
	public MovieResponService updateMovie(MovieDto movieDto) throws Exception {
		
		
		Movie movieTem = movieServiceRepositoryImpl.searchByIdEpisode(movieDto.getMovie().getIdEpisode());

		if (movieTem != null) {
			Date day = new Date ();
			movieTem.setReleaseDate(day);
            movieTem.setTitle(movieDto.getMovie().getTitle());
			movieServiceRepositoryImpl.createMovie(movieTem);

			return new MovieResponService("successful movie update", "200", movieDto);
		}

		return new MovieResponService("Error the movie entered does not exist", "203", null);
		
	}

	@Override
	public MovieResponService deleteMovie(MovieDto movieDto) throws Exception {
		Movie movieTem = movieServiceRepositoryImpl.searchByIdEpisode(movieDto.getMovie().getIdEpisode());
		if (movieTem != null) {
			

			movieServiceRepositoryImpl.DeleteMovie(movieTem);

			return new MovieResponService("Deleted movie success", "200", false);
		}
		
		return new MovieResponService("Error the movie entered does not exist", "203", false);
	}


	


}
