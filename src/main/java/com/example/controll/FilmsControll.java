package com.example.controll;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ResponServiceDto;
import com.example.infrastructure.impl.FilmServiceImpl;

import ch.qos.logback.core.boolex.Matcher;



@RestController
@RequestMapping("/Flim")
public class FilmsControll {
	
	

	@Autowired
	private FilmServiceImpl filmServiceImpl;

	
	private ResponServiceDto responServiceDto = null ;

	// serach Document

	@GetMapping(value = "/searchByIdFilm/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody ResponServiceDto searchByDocument(@PathVariable Integer id) {

		try {
			
			
			return filmServiceImpl.seconsultFilm(id);

		} catch (Exception e) {
			e.getMessage();
			return responServiceDto = new ResponServiceDto("Error", "404", null);
		}

	}
}
