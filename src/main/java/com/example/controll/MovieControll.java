package com.example.controll;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.example.dto.MovieDto;
import com.example.dto.MovieResponService;
import com.example.infrastructure.MovieService;
import com.example.repository.infrastructure.impl.MovieServiceRepositoryImpl;

@RestController
@RequestMapping("/Movie")
public class MovieControll {

	private MovieResponService movieResponService = null;

	@Autowired
	private MovieService movieService;

	@Autowired
	private MovieServiceRepositoryImpl movieServiceRepositoryImpl;
	
	// Uddate Movie
		@PutMapping(value = "/updateMovie", produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(HttpStatus.OK)
		public @ResponseBody MovieResponService updateClient(@RequestBody MovieDto movieDto) {
			try {
				return movieService.updateMovie(movieDto);
			} catch (Exception e) {
				e.getMessage();
				return movieResponService = new MovieResponService("Error", "404", false);
			}

		}
		
		// Delete Movie
		@DeleteMapping(value = "/deleteMovie", produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(HttpStatus.OK)
		public @ResponseBody MovieResponService deleteClient(@RequestBody MovieDto movieDto) {
			try {
				return movieService.deleteMovie(movieDto);
			} catch (Exception e) {

				return movieResponService = new MovieResponService(e.getMessage(), "404", false);
			}

		}
}
