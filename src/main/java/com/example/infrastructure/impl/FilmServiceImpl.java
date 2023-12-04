package com.example.infrastructure.impl;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dto.Resoult;
import com.example.dto.ResponServiceDto;
import com.example.entity.Movie;
import com.example.infrastructure.FilmService;
import com.example.repository.MovieRepository;
import com.example.repository.infrastructure.impl.MovieServiceRepositoryImpl;

import ch.qos.logback.core.boolex.Matcher;

import org.json.*;

@Service("FilmServiceImpl")
public class FilmServiceImpl implements FilmService {

	private final RestTemplate restTemplate;
	
	@Autowired
	private MovieRepository movieServiceRepositoryImpl; 

	@Autowired
	public FilmServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	public ResponServiceDto seconsultFilm(Integer id) throws Exception {

		try {
			
			
			String regex = "^[0-9]{4}$";
			String idTem = id.toString();
			
			if(idTem.matches(regex)) {
				
				return new ResponServiceDto("error en la solicitud", "400", null);
			}

			String url = ("https://swapi.dev/api/films/" + id);

			Resoult forObject = restTemplate.getForObject(url, Resoult.class);

			ResponServiceDto conten = new ResponServiceDto();
			conten.setResoult(forObject);
			
			
			if(conten.getResoult().getTitle() == null) {
				
				return new ResponServiceDto("no existe", "204", null);
				
			}
			
			Movie moviTem = new Movie();
			
			moviTem.setIdEpisode(conten.getResoult().getEpisode_id());
			moviTem.setReleaseDate(conten.getResoult().getRelease_date());
			moviTem.setTitle(conten.getResoult().getTitle());
			movieServiceRepositoryImpl.save(moviTem);
			
			return  new ResponServiceDto("Exito ", "200", conten.getResoult());	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
