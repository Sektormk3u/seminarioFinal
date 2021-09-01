package ar.edu.unrn.seminario.modelo;

import ar.edu.unrn.seminario.exceptions.CamposNulos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;

public class Due�oVivienda extends Persona {

	private Integer puntaje;
	
	public Due�oVivienda(String nombre, String apellido, String dni) throws CamposNulos, CamposVacios {
		super(nombre, apellido, dni);
		this.puntaje = 0;
	}
	
	public void pedidoRetiro(Residuo residuo, Integer kilosResiduo) {
		
	}

	
	public void canjearPremio(Beneficio beneficio) {
		
	}
	
}
