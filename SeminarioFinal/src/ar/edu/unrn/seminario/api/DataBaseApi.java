package ar.edu.unrn.seminario.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import ar.edu.unrn.seminario.dto.BeneficioDTO;
import ar.edu.unrn.seminario.dto.DomicilioDTO;
import ar.edu.unrn.seminario.dto.DueñoViviendaDTO;

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

	

	@Override
	public void registrarRecolector(String nombre, String apellido, String dni, String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canjearPremio(DueñoViviendaDTO dueñoVivienda, BeneficioDTO beneficio) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void registrarVivienda(DueñoViviendaDTO dueño, DomicilioDTO domicilio, Date fechaRegistro) {
		// TODO Auto-generated method stub
		
	}
	
}
