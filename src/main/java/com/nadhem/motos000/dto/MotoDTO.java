package com.nadhem.motos000.dto;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.nadhem.motos000.Type;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MotoDTO {
	private Long idMoto;
	private String nomMoto;
	private Double prixMotot;
	private Date dateCreation;
	private Type type;
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	private String nomCat; 
	public Long getIdMoto() {
		return idMoto;
	}
	public void setIdMoto(Long idMoto) {
		this.idMoto = idMoto;
	}
	public String getNomMoto() {
		return nomMoto;
	}
	public void setNomMoto(String nomMoto) {
		this.nomMoto = nomMoto;
	}
	public Double getPrixMotot() {
		return prixMotot;
	}
	public void setPrixMotot(Double prixMotot) {
		this.prixMotot = prixMotot;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

}
