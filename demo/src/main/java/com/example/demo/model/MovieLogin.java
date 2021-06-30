package com.example.demo.model;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="movielogin")

public class MovieLogin {
//each model represents a table in our database and our models are classes
	
	//name of item
	//price of item
	//quantity
	//image
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String email;
	
	
	
	
	public MovieLogin() {}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getuserName() {
		return username;
	}

	/**
	 * @param name the name to set
	 */
	public void setuserName(String username) {
		this.username = username;
	}

	

	/**
	 * @return the email

*/
	public String getPassword() {
		return password;
	}

	/**
	 * @param email the email to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the email

*/
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}