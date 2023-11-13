package net.javaguides.springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String Name;
		
	public User() {
		
	}
	
	public User(String Name) {
		super();
		this.Name = Name;
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void seName(String Name) {
		this.Name = Name;
	}
	
}
