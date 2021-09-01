package ar.edu.unrn.seminario.api;

import java.util.List;


public interface IApi {

	/*
	 * ABMDueñoViviendaDTO
	 * ABMCampañaDTO
	 * ListaCatalogo - return lista beneficioDTO
	 * falta completar
	 */
	
	void setupBaseDeDatos(String usuario, String contraseña, String nombreBD);
	
	void registrarDueñoVivienda(String nombre, String apellido, String dni);
}
