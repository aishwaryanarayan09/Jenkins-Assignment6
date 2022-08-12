package com.advanceJava.Assignment5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Library_Management_System")

public class Lib {
	public Lib() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String author;
	private String publicaion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublicaion() {
		return publicaion;
	}
	public void setPublicaion(String publicaion) {
		this.publicaion = publicaion;
	}
	@Override
	public String toString() {
		return "Lib [id=" + id + ", name=" + name + ", author=" + author + ", publicaion=" + publicaion + "]";
	}
	
	

}
