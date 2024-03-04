package web;

import java.util.ArrayList;
import java.util.List;
import motos.Moto;

public class MotoModele {
	private String motCle;
	List<Moto> motos = new ArrayList<>();

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public List<Moto> getMotos() {
		return motos;
	}

	public void setProduits(List<Moto> motos) {
		this.motos = motos;
	}
}
