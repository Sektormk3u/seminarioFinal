package ar.edu.unrn.seminario.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.edu.unrn.seminario.dto.BeneficioDTO;
import ar.edu.unrn.seminario.dto.DomicilioDTO;
import ar.edu.unrn.seminario.dto.Due�oViviendaDTO;
import ar.edu.unrn.seminario.dto.ViviendaDTO;
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

	void registrarRecolector(String nombre, String apellido, int dni, String email);

	void canjearPremio(Due�oViviendaDTO due�oVivienda, BeneficioDTO beneficio);

	void registrarDue�oVivienda(String nombreDue�o, String apellidoDue�o,
			int dni, String calle, String barrio,
			int numeroVivienda, Date fechaRegistro) throws CamposErroneos, CamposVacios;
	
	boolean due�oExiste(int dni);
	
	Due�oViviendaDTO obtenerUsuario(int dni);
	
	ArrayList<ViviendaDTO> listaViviendas();
}
