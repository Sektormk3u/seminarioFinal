package ar.edu.unrn.seminario.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.edu.unrn.seminario.dto.BeneficioDTO;
import ar.edu.unrn.seminario.dto.DomicilioDTO;
import ar.edu.unrn.seminario.dto.DueñoViviendaDTO;
import ar.edu.unrn.seminario.dto.ViviendaDTO;
import ar.edu.unrn.seminario.exceptions.CamposErroneos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;
import ar.edu.unrn.seminario.modelo.Domicilio;
import ar.edu.unrn.seminario.modelo.DueñoVivienda;
import ar.edu.unrn.seminario.modelo.Vivienda;

public class MemoryApi implements IApi{

	private ArrayList<DueñoVivienda> listaDueños;
	private ArrayList<Vivienda> listaViviendas;
	
	public MemoryApi () {
		listaDueños = new ArrayList<DueñoVivienda>();
		listaViviendas = new ArrayList<Vivienda>();
		inicializarLista();
	}
	
	private void inicializarLista () {
		try {
			DueñoVivienda d1 = new DueñoVivienda("Leonel", "Mercado", "123");
			DueñoVivienda d2 = new DueñoVivienda("Ivan", "Scheck", "456");
			DueñoVivienda d3 = new DueñoVivienda("Leonardo", "Incaminato", "789");
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
		//borrar despues
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
	public void registrarDueñoVivienda(String nombreDueño, String apellidoDueño, String dni, String calle,
			String barrio, int numeroVivienda, Date fechaRegistro) throws CamposErroneos, CamposVacios {
		DueñoVivienda dueño = new DueñoVivienda(nombreDueño, apellidoDueño, dni);
		listaDueños.add(dueño);
		Domicilio domicilio = new Domicilio(calle, barrio, numeroVivienda);
		listaViviendas.add(new Vivienda(dueño, domicilio, fechaRegistro));
	}

	@Override
	public List<ViviendaDTO> obtenerViviendas() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
