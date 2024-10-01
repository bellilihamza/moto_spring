package com.nadhem.motos000;



import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity 
public class Moto {

	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 private Long idMotot; 
	 private String nomMoto; 
	 private Double prixMoto; 
	 private Date dateCreation; 
	 @ManyToOne(cascade = CascadeType.PERSIST)
	 private Type type;


	  
	 @Override
	public String toString() {
		return "Moto [idMotot=" + idMotot + ", nomMoto=" + nomMoto + ", prixMoto=" + prixMoto + ", dateCreation="
				+ dateCreation + ", type=" + type + "]";
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Moto() { 
	  super(); 
	 } 
	 
	 public Moto(String nomProduit, Double prixProduit, Date dateCreation) { 
	  super(); 
	  this.nomMoto = nomProduit; 
	  this.prixMoto = prixProduit; 
	  this.dateCreation = dateCreation; 
	 }

	public Long getIdMotot() {
		return idMotot;
	}

	public void setIdMotot(Long idMotot) {
		this.idMotot = idMotot;
	}

	public String getNomMoto() {
		return nomMoto;
	}

	public void setNomMoto(String nomMoto) {
		this.nomMoto = nomMoto;
	}

	public Double getPrixMoto() {
		return prixMoto;
	}

	public void setPrixMoto(Double prixMoto) {
		this.prixMoto = prixMoto;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(java.util.Date dateCreation) {
	    if (dateCreation != null) {
	        this.dateCreation = new java.sql.Date(dateCreation.getTime());
	    } else {
	        this.dateCreation = null;
	    }
	}


	
	 
}
