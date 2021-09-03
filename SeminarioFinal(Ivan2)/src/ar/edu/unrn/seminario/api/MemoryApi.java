package ar.edu.unrn.seminario.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import ar.edu.unrn.seminario.dto.BeneficioDTO;
import ar.edu.unrn.seminario.dto.DomicilioDTO;
import ar.edu.unrn.seminario.dto.DueñoViviendaDTO;
import ar.edu.unrn.seminario.dto.ViviendaDTO;
import ar.edu.unrn.seminario.exceptions.CamposErroneos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;
import ar.edu.unrn.seminario.modelo.Domicilio;
import ar.edu.unrn.seminario.modelo.DueñoVivienda;
import ar.edu.unrn.seminario.modelo.Vivienda;

public class MemoryApi implements IApi {

	private ArrayList<DueñoVivienda> listaDueños;
	private ArrayList<Vivienda> listaViviendas;

	public MemoryApi() {
		listaDueños = new ArrayList<DueñoVivienda>();
		listaViviendas = new ArrayList<Vivienda>();
		inicializarLista();
	}

	private void inicializarLista() {
		try {
			DueñoVivienda d1 = new DueñoVivienda("Leonel", "Mercado", 123);
			DueñoVivienda d2 = new DueñoVivienda("Ivan", "Scheck", 456);
			DueñoVivienda d3 = new DueñoVivienda("Leonardo", "Incaminato", 789);
			listaDueños.add(d1);
			listaDueños.add(d2);
			listaDueños.add(d3);
			Domicilio domicilio1 = new Domicilio("calle1", "barrio1", 1);
			Domicilio domicilio2 = new Domicilio("calle2", "barrio2", 2);
			Domicilio domicilio3 = new Domicilio("calle3", "barrio3", 3);
			Domicilio domicilio4 = new Domicilio("calle4", "barrio4", 4);
			listaViviendas.add(new Vivienda(d1, domicilio1, new Date()));
			listaViviendas.add(new Vivienda(d2, domicilio2, new Date()));
			listaViviendas.add(new Vivienda(d3, domicilio3, new Date()));
			listaViviendas.add(new Vivienda(d2, domicilio4, new Date()));
		} catch (CamposErroneos e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CamposVacios e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void setupBaseDeDatos(String usuario, String contraseña, String nombreBD) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registrarVivienda(DueñoViviendaDTO dueño, DomicilioDTO domicilio, Date fechaRegistro) {
		// borrar despues
	}

	@Override
	public void registrarRecolector(String nombre, String apellido, int dni, String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void canjearPremio(DueñoViviendaDTO dueñoVivienda, BeneficioDTO beneficio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registrarDueñoVivienda(String nombreDueño, String apellidoDueño, int dni, String calle,
			String barrio, int numeroVivienda, Date fechaRegistro) throws CamposErroneos, CamposVacios {
		DueñoVivienda dueño = new DueñoVivienda(nombreDueño, apellidoDueño, dni);
		listaDueños.add(dueño);
		Domicilio domicilio = new Domicilio(calle, barrio, numeroVivienda);
		listaViviendas.add(new Vivienda(dueño, domicilio, fechaRegistro));
	}

	@Override
	public boolean dueñoExiste(int dni) {
		for (DueñoVivienda dueñoVivienda : listaDueños) {
			if (dueñoVivienda.equals(dni)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public DueñoViviendaDTO obtenerUsuario(int dni) {
		for (DueñoVivienda dueñoVivienda : listaDueños) {
			if (dueñoVivienda.equals(dni)) {
				return new DueñoViviendaDTO(dueñoVivienda.getNombre(), dueñoVivienda.getApellido(), dni);
			}
		}
		return null;
	}

	@Override
	public ArrayList<ViviendaDTO> listaViviendas() {
		ArrayList<ViviendaDTO> listaViviendaDTO = new ArrayList<ViviendaDTO>();
		for (Vivienda vivienda : listaViviendas) {
			//Convierto vivienda en viviendaDTO
			DueñoViviendaDTO dueñoDTO = new DueñoViviendaDTO(vivienda.getDueño().getNombre(),
					vivienda.getDueño().getApellido(), vivienda.getDueño().getDni());
			DomicilioDTO domicilioDTO = new DomicilioDTO(vivienda.getDomicilio().getCalle(),
					vivienda.getDomicilio().getBarrio(), vivienda.getDomicilio().getNumero());
			//Agrego a la lista
			listaViviendaDTO.add(new ViviendaDTO(dueñoDTO, domicilioDTO, vivienda.getFechaRegistro()));
		}
		return listaViviendaDTO;
	}

}
