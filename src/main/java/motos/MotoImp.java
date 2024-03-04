package motos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MotoImp implements ImotoCatalogue {
	@Override
	public List<Moto> getMotosParMotCle(String mc) {
		List<Moto> motos = new ArrayList<Moto>();
		Connection conn = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from motos where NOM_MOTO LIKE ?");
			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Moto p = new Moto();
				p.setIdMoto(rs.getLong("ID_MOTO"));
				p.setNomMoto(rs.getString("NOM_MOTO"));
				p.setPrix(rs.getDouble("PRIX"));
				motos.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return motos;
	}

	@Override
	public void addMoto(Moto m) {
// TODO Auto-generated method stub
	}
}