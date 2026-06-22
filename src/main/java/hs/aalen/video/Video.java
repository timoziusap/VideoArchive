package hs.aalen.video;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import hs.aalen.person.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Video {
	
	@Id
	private String title;
	
	private String description;
	private String ageRating;
	private String genre;
	private String erstellerName;
	
	@ManyToMany(mappedBy="favouriteVideos")
	@JsonIgnore
	private List<Person> personFavourties;
	
	public Video(String title, String description, String ageRating, String genre) {
		super();
		this.title = title;
		this.description = description;
		this.ageRating = ageRating;
		this.genre = genre;
	}
	public Video() {
		super();
	}
	
	
	public List<Person> getPersonFavourites(){
		return personFavourties;
	}
	public void setPersonFavourites(List <Person> personFavourties) {
		this.personFavourties = personFavourties;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAgeRating() {
		return ageRating;
	}
	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getErstellerName() {
		return erstellerName;
	}
	public void setErstellerName(String erstellerName) {
		this.erstellerName = erstellerName;
	}


	// Methode zum Ci zeigen +
	// Diese Methode traegt den Namen der Person ein die das Video erstellt hat.
	// Sie ist richtig, der Test laeuft durch und GitHub Actions wird gruen.
	// Danach kann das Projekt deployed werden.
	public void erstellerEintragen(String name) {
		this.erstellerName = name;
	}


	// Methode zum Ci zeigen -
	// Das ist die gleiche Methode, aber hier wurde vergessen den Namen zu speichern.
	// Der Test schlaegt fehl und GitHub Actions wird rot. Es wird nichts deployed.
	// Zum Vorfuehren die obere Methode auskommentieren und diese hier aktiv schalten.
	//
	// public void erstellerEintragen(String name) {
	//     // hier passiert nichts, der Name wird nicht gespeichert
	// }

}
