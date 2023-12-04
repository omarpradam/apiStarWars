package com.example.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@Column(name = "episode_id")
	private Long idEpisode;
	@Column(name = "title")
	private String title;
	@Column(name = "release_date")
	private Date releaseDate;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(Long idEpisode, String title, Date releaseDate) {
		super();
		this.idEpisode = idEpisode;
		this.title = title;
		this.releaseDate = releaseDate;
	}

	public Long getIdEpisode() {
		return idEpisode;
	}

	public void setIdEpisode(Long idEpisode) {
		this.idEpisode = idEpisode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Movie [idEpisode=" + idEpisode + ", title=" + title + ", releaseDate=" + releaseDate + "]";
	}

}
