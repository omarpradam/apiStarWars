package com.example.dto;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Resoult {

	private String title;
	private Long episode_id;
	private String opening_crawl;
	private String director;
	private String producer;
	private Date release_date;
	private String created;
	private String edited;

	public Resoult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resoult(String title, Long episode_id, String opening_crawl, String director, String producer,
			Date release_date, String created, String edited) {
		super();
		this.title = title;
		this.episode_id = episode_id;
		this.opening_crawl = opening_crawl;
		this.director = director;
		this.producer = producer;
		this.release_date = release_date;
		this.created = created;
		this.edited = edited;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getEpisode_id() {
		return episode_id;
	}

	public void setEpisode_id(Long episode_id) {
		this.episode_id = episode_id;
	}

	public String getOpening_crawl() {
		return opening_crawl;
	}

	public void setOpening_crawl(String opening_crawl) {
		this.opening_crawl = opening_crawl;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEdited() {
		return edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	@Override
	public String toString() {
		return "Resoult [title=" + title + ", episode_id=" + episode_id + ", opening_crawl=" + opening_crawl
				+ ", director=" + director + ", producer=" + producer + ", release_date=" + release_date + ", created="
				+ created + ", edited=" + edited + "]";
	}

}
