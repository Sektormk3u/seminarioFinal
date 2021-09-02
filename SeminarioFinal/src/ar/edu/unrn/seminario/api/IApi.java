package ar.edu.unrn.seminario.api;

import java.util.Date;
import java.util.List;

import ar.edu.unrn.seminario.dto.BeneficioDTO;
import ar.edu.unrn.seminario.dto.DomicilioDTO;
import ar.edu.unrn.seminario.dto.Due�oViviendaDTO;
import ar.edu.unrn.seminario.exceptions.CamposErroneos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;

public interface IApi {

	/*
	 * ABMDue�oViviendaDTO ABMCampa�aDTO ListaCatalogo - return lista beneficioDTO
	 * falta completar
	 */

	void setupBaseDeDatos(String usuario, String contrase�a, String nombreBD);

	void registrarVivienda(Due�oViviendaDTO due�o, DomicilioDTO domicilio, Date fechaRegistro)
			throws CamposErroneos, CamposVacios;

	void registrarRecolector(String nombre, String apellido, String dni, String email);

	void canjearPremio(Due�oViviendaDTO due�oVivienda, BeneficioDTO beneficio);

	void registrarDue�oVivienda(String nombreDue�o, String apellidoDue�o,
			String dni, String calle, String barrio,
			int numeroVivienda, Date fechaRegistro) throws CamposErroneos, CamposVacios;
}
