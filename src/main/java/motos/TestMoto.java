package motos;

import java.util.List;

public class TestMoto {
	public static void main(String[] args) {
		MotoImp motoimp = new MotoImp();
		List<Moto> motos = motoimp.getMotosParMotCle("HP");
		for (Moto p : motos)
			System.out.println(p.getNomMoto());
	}
}
