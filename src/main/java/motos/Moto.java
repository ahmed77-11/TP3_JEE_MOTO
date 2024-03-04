package motos;

import java.io.Serializable;

public class Moto implements Serializable {
	private Long idMoto;
	private String nomMoto;
	private double prix;

	public Moto() {
		super();
	}

	public Moto(String nomMoto, double prix) {
		super();
		this.nomMoto = nomMoto;
		this.prix = prix;
	}

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

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

}