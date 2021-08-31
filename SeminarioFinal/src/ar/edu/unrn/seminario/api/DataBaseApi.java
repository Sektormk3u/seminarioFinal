package ar.edu.unrn.seminario.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseApi implements IApi{

	private Connection dbConn;

	public void setupBaseDeDatos(String usuario, String contraseña, String nombreBD) {
		String url = "jdbc:mysql://localhost:3306/"+nombreBD;
		String user = usuario;
		String password = contraseña;
		try {
			this.dbConn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Verificar siguiente error:"+e.getMessage());
		}
	}
	
}
