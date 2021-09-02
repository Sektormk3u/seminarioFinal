package ar.edu.unrn.seminario.api;

import java.util.Date;
import java.util.List;

import ar.edu.unrn.seminario.dto.BeneficioDTO;
import ar.edu.unrn.seminario.dto.DomicilioDTO;
import ar.edu.unrn.seminario.dto.DueñoViviendaDTO;
import ar.edu.unrn.seminario.exceptions.CamposErroneos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;

public interface IApi {

	/*
	 * ABMDueñoViviendaDTO ABMCampañaDTO ListaCatalogo - return lista beneficioDTO
	 * falta completar
	 */

	void setupBaseDeDatos(String usuario, String contraseña, String nombreBD);

	void registrarVivienda(DueñoViviendaDTO dueño, DomicilioDTO domicilio, Date fechaRegistro)
			throws CamposErroneos, CamposVacios;

	void registrarRecolector(String nombre, String apellido, String dni, String email);

	void canjearPremio(DueñoViviendaDTO dueñoVivienda, BeneficioDTO beneficio);

	void registrarDueñoVivienda(String nombreDueño, String apellidoDueño,
			String dni, String calle, String barrio,
			int numeroVivienda, Date fechaRegistro) throws CamposErroneos, CamposVacios;
}
