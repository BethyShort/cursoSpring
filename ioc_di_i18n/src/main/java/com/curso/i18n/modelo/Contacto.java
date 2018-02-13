package com.curso.i18n.modelo;

public class Contacto {
	
	private String firstName;
	private String lastName;
	private String email;
	private String telephone;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Contacto [firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", telephone=" + telephone + "]";
	}
	
	

}
