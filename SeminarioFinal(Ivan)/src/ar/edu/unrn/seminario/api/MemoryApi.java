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
import ar.edu.unrn.seminario.modelo.Domicilio;
import ar.edu.unrn.seminario.modelo.Due�oVivienda;
import ar.edu.unrn.seminario.modelo.Vivienda;

public class MemoryApi implements IApi{

	private ArrayList<Due�oVivienda> listaDue�os;
	private ArrayList<Vivienda> listaViviendas;
	
	public MemoryApi () {
		listaDue�os = new ArrayList<Due�oVivienda>();
		listaViviendas = new ArrayList<Vivienda>();
		inicializarLista();
	}
	
	private void inicializarLista () {
		try {
			Due�oVivienda d1 = new Due�oVivienda("Leonel", "Mercado", "123");
			Due�oVivienda d2 = new Due�oVivienda("Ivan", "Scheck", "456");
			Due�oVivienda d3 = new Due�oVivienda("Leonardo", "Incaminato", "789");
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
		//borrar despues
	}
	@Override
	public void registrarRecolector(String nombre, String apellido, String dni, String email) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void canjearPremio(Due�oViviendaDTO due�oVivienda, BeneficioDTO beneficio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarDue�oVivienda(String nombreDue�o, String apellidoDue�o, String dni, String calle,
			String barrio, int numeroVivienda, Date fechaRegistro) throws CamposErroneos, CamposVacios {
		Due�oVivienda due�o = new Due�oVivienda(nombreDue�o, apellidoDue�o, dni);
		listaDue�os.add(due�o);
		Domicilio domicilio = new Domicilio(calle, barrio, numeroVivienda);
		listaViviendas.add(new Vivienda(due�o, domicilio, fechaRegistro));
	}

	@Override
	public List<ViviendaDTO> obtenerViviendas() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
