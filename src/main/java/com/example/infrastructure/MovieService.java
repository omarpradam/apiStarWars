package com.example.infrastructure;

import com.example.dto.MovieDto;
import com.example.dto.MovieResponService;


public interface MovieService {

	public MovieResponService updateMovie(MovieDto movieDto) throws Exception;

	public MovieResponService deleteMovie(MovieDto movieDto) throws Exception;

}
