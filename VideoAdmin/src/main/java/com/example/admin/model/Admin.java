package com.example.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	int movie_id;
	
	@Column
	String movie_name;
	
	@Column
	int release_year; 
	
	@Column
	String language; 
	
	@Column
	String rating;
	
	@Column
	int duration_in_minutes;
	
	@Column
	String movie_type;
	
	@Column 
	String director_name;
	
	@Column
	String lead_actor_name1; 
	
	@Column
	String lead_actor_name2; 
	
	public Admin() {
		
	}
	public Admin(int movie_id, String movie_name, int release_year, String language, String rating,
			int duration_in_minutes, String movie_type, String director_name, String lead_actor_name1,
			String lead_actor_name2 ) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.release_year = release_year;
		this.language = language;
		this.rating = rating;
		this.duration_in_minutes = duration_in_minutes;
		this.movie_type = movie_type;
		this.director_name = director_name;
		this.lead_actor_name1 = lead_actor_name1;
		this.lead_actor_name2 = lead_actor_name2;
		
		
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getDuration_in_minutes() {
		return duration_in_minutes;
	}
	public void setDuration_in_minutes(int duration_in_minutes) {
		this.duration_in_minutes = duration_in_minutes;
	}
	public String getMovie_type() {
		return movie_type;
	}
	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}
	public String getDirector_name() {
		return director_name;
	}
	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}
	public String getLead_actor_name1() {
		return lead_actor_name1;
	}
	public void setLead_actor_name1(String lead_actor_name1) {
		this.lead_actor_name1 = lead_actor_name1;
	}
	public String getLead_actor_name2() {
		return lead_actor_name2;
	}
	public void setLead_actor_name2(String lead_actor_name2) {
		this.lead_actor_name2 = lead_actor_name2;
	}

	
}

