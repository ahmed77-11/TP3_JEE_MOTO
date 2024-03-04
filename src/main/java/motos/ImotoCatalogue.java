package motos;

import java.util.List;

public interface ImotoCatalogue {
	public List<Moto> getMotosParMotCle(String mc);

	public void addMoto(Moto m);
}