package ar.edu.unrn.seminario.modelo;

import ar.edu.unrn.seminario.exceptions.CamposErroneos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;

public class Due�oVivienda extends Persona {

	private Integer puntaje;
	
	public Due�oVivienda(String nombre, String apellido, String dni) throws CamposErroneos, CamposVacios {
		super(nombre, apellido, dni);
		this.puntaje = 0;
	}
	
	public void pedidoRetiro(Residuo residuo, Integer kilosResiduo) {
		
	}

	
	public void canjearPremio(Beneficio beneficio) {
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.obtenerDNI() == obj) {
			return true;
		}
		return false;
	}
	
	
	
}
