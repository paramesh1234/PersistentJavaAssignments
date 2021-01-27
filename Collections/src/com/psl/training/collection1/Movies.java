package com.psl.training.collection1;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Movies implements Comparable<Movies> {
	private String name, language, director, producer;
	private Date releaseDate;
	private int duration;
	private List<Movies> m=new ArrayList<>();
	public Movies() {
		// TODO Auto-generated constructor stub
	}
	public Movies(String name, String language, Date releaseDate, String director, String producer, int duration) {
		super();
		this.name = name;
		this.language = language;
		this.releaseDate = releaseDate;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}
	public List<Movies> getM() {
		//System.out.println("Main class "+m.size());
		return m;
	}
	public void setM(List<Movies> m) {
		this.m = m;
		//System.out.println(m.size());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public int compareTo(Movies o) {
		return this.language.compareTo(o.language);
	}
}
