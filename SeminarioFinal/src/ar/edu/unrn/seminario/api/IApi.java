package ar.edu.unrn.seminario.api;

import java.util.List;


public interface IApi {

	/*
	 * ABMDue�oViviendaDTO
	 * ABMCampa�aDTO
	 * ListaCatalogo - return lista beneficioDTO
	 * falta completar
	 */
	
	void setupBaseDeDatos(String usuario, String contrase�a, String nombreBD);
	
	void registrarDue�oVivienda(String nombre, String apellido, String dni);
}
