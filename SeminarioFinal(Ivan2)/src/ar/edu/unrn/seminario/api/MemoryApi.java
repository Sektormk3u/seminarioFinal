package ar.edu.unrn.seminario.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import ar.edu.unrn.seminario.dto.BeneficioDTO;
import ar.edu.unrn.seminario.dto.DomicilioDTO;
import ar.edu.unrn.seminario.dto.Due�oViviendaDTO;
import ar.edu.unrn.seminario.dto.ViviendaDTO;
import ar.edu.unrn.seminario.exceptions.CamposErroneos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;
import ar.edu.unrn.seminario.modelo.Domicilio;
import ar.edu.unrn.seminario.modelo.Due�oVivienda;
import ar.edu.unrn.seminario.modelo.Vivienda;

public class MemoryApi implements IApi {

	private ArrayList<Due�oVivienda> listaDue�os;
	private ArrayList<Vivienda> listaViviendas;

	public MemoryApi() {
		listaDue�os = new ArrayList<Due�oVivienda>();
		listaViviendas = new ArrayList<Vivienda>();
		inicializarLista();
	}

	private void inicializarLista() {
		try {
			Due�oVivienda d1 = new Due�oVivienda("Leonel", "Mercado", 123);
			Due�oVivienda d2 = new Due�oVivienda("Ivan", "Scheck", 456);
			Due�oVivienda d3 = new Due�oVivienda("Leonardo", "Incaminato", 789);
			listaDue�os.add(d1);
			listaDue�os.add(d2);
			listaDue�os.add(d3);
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
	public void setupBaseDeDatos(String usuario, String contrase�a, String nombreBD) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registrarVivienda(Due�oViviendaDTO due�o, DomicilioDTO domicilio, Date fechaRegistro) {
		// borrar despues
	}

	@Override
	public void registrarRecolector(String nombre, String apellido, int dni, String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void canjearPremio(Due�oViviendaDTO due�oVivienda, BeneficioDTO beneficio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registrarDue�oVivienda(String nombreDue�o, String apellidoDue�o, int dni, String calle,
			String barrio, int numeroVivienda, Date fechaRegistro) throws CamposErroneos, CamposVacios {
		Due�oVivienda due�o = new Due�oVivienda(nombreDue�o, apellidoDue�o, dni);
		listaDue�os.add(due�o);
		Domicilio domicilio = new Domicilio(calle, barrio, numeroVivienda);
		listaViviendas.add(new Vivienda(due�o, domicilio, fechaRegistro));
	}

	@Override
	public boolean due�oExiste(int dni) {
		for (Due�oVivienda due�oVivienda : listaDue�os) {
			if (due�oVivienda.equals(dni)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Due�oViviendaDTO obtenerUsuario(int dni) {
		for (Due�oVivienda due�oVivienda : listaDue�os) {
			if (due�oVivienda.equals(dni)) {
				return new Due�oViviendaDTO(due�oVivienda.getNombre(), due�oVivienda.getApellido(), dni);
			}
		}
		return null;
	}

	@Override
	public ArrayList<ViviendaDTO> listaViviendas() {
		ArrayList<ViviendaDTO> listaViviendaDTO = new ArrayList<ViviendaDTO>();
		for (Vivienda vivienda : listaViviendas) {
			//Convierto vivienda en viviendaDTO
			Due�oViviendaDTO due�oDTO = new Due�oViviendaDTO(vivienda.getDue�o().getNombre(),
					vivienda.getDue�o().getApellido(), vivienda.getDue�o().getDni());
			DomicilioDTO domicilioDTO = new DomicilioDTO(vivienda.getDomicilio().getCalle(),
					vivienda.getDomicilio().getBarrio(), vivienda.getDomicilio().getNumero());
			//Agrego a la lista
			listaViviendaDTO.add(new ViviendaDTO(due�oDTO, domicilioDTO, vivienda.getFechaRegistro()));
		}
		return listaViviendaDTO;
	}

}
