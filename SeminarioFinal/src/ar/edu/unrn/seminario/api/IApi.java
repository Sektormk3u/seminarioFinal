package ar.edu.unrn.seminario.api;

import java.util.Date;
import java.util.List;

import ar.edu.unrn.seminario.dto.BeneficioDTO;
import ar.edu.unrn.seminario.dto.DomicilioDTO;
import ar.edu.unrn.seminario.dto.DueñoViviendaDTO;


public interface IApi {

	/*
	 * ABMDueñoViviendaDTO
	 * ABMCampañaDTO
	 * ListaCatalogo - return lista beneficioDTO
	 * falta completar
	 */
	
	void setupBaseDeDatos(String usuario, String contraseña, String nombreBD);
	
	void registrarVivienda(DueñoViviendaDTO dueño, DomicilioDTO domicilio, Date fechaRegistro);
	
	void registrarRecolector(String nombre, String apellido, String dni, String email);
	
	void canjearPremio (DueñoViviendaDTO dueñoVivienda, BeneficioDTO beneficio);
}
