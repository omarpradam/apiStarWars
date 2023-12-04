package com.example.dto;

import org.springframework.stereotype.Component;

import com.example.entity.Movie;

@Component
public class MovieDto {

	private Movie movie;

	public MovieDto(Movie movie) {
		super();
		this.movie = movie;
	}

	public MovieDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "MovieDto [movie=" + movie + "]";
	}

}
