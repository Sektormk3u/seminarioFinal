package ar.edu.unrn.seminario.modelo;

import ar.edu.unrn.seminario.exceptions.CamposErroneos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;

public class DueñoVivienda extends Persona {

	private Integer puntaje;
	
	public DueñoVivienda(String nombre, String apellido, int dni) throws CamposErroneos, CamposVacios {
		super(nombre, apellido, dni);
		this.puntaje = 0;
	}
	
	public void pedidoRetiro(Residuo residuo, Integer kilosResiduo) {
		
	}

	
	public void canjearPremio(Beneficio beneficio) {
		
	}
	
	@Override
	public boolean equals(Object obj) {
		String dni = this.getDni()+"";
		String dni2 = obj+"";
		if (dni == dni2) {
			return true;
		}
		return false;
	}
	
	
	
}
