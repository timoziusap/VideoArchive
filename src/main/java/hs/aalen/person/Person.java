package hs.aalen.person;

import java.util.*;

import hs.aalen.video.Video;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Person {
	
	@Id
	private String id;
	//private static int zeahler = 1;
	private String surename;
	private String birthDate;
	
	@ManyToMany
	private List<Video> favouriteVideos = new ArrayList<>();
	
	public Person(String id, String surename, String birthDate) {
		super();
		
		this.id = id;
		this.surename = surename;
		this.birthDate = birthDate;
		
	}
	
	
	public Person() {
		super();
	}
	
	
	public List<Video> getFavouriteVideo(){
		return favouriteVideos;
	}
	
	public void addVideoToFavourites(Video v) {
		this.favouriteVideos.add(v);
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSurename() {
		return surename;
	}
	public void setSurename(String surename) {
		this.surename = surename;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

}
