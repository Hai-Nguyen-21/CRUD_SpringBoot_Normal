package com.springboot.first.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class categories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_category;
	
	@Column(name = "name_category")
	private String name_category;

	public categories() {
		super();
	}

	public categories(int id_category, String name_category) {
		super();
		this.id_category = id_category;
		this.name_category = name_category;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public String getName_category() {
		return name_category;
	}

	public void setName_category(String name_category) {
		this.name_category = name_category;
	}

	@Override
	public String toString() {
		return "categories [id_category=" + id_category + ", name_category=" + name_category + "]";
	}
	
	
}
