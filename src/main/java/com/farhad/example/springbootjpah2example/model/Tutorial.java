package com.farhad.example.springbootjpah2example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tutorials")
@NoArgsConstructor
@Data
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String title;
	private String description;
	private boolean published;
	public Tutorial(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}

	
}
