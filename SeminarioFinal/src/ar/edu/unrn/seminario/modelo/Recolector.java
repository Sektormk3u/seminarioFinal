package ar.edu.unrn.seminario.modelo;

import ar.edu.unrn.seminario.exceptions.CamposNulos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;

public class Recolector extends Persona {

	private String email;

	public Recolector(String nombre, String apellido, String dni, String email) throws CamposNulos, CamposVacios {
		super(nombre, apellido, dni);
		if (camposNulos(email)) {
			throw new CamposNulos("Verificar, campos nulos");
		}
		if (camposVacios(email)) {
			throw new CamposVacios("Verificar, campos vacios");
		}
		this.email = email;
	}

	public void visitarDomicilio() {

	}

}
