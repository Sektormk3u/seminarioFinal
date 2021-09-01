package ar.edu.unrn.seminario.modelo;

import ar.edu.unrn.seminario.exceptions.CamposNulos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;

public class Persona {

	private String apellido;
	private String nombre;
	private String dni;

	public Persona(String nombre, String apellido, String dni) throws CamposNulos, CamposVacios {
		if (!camposNulos(nombre) || !camposNulos(dni) || !camposNulos(apellido)) {
			throw new CamposNulos();
		}
		if (!camposVacios(dni) || !camposVacios(nombre) || !camposVacios(apellido)) {
			throw new CamposVacios();
		}
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;

	}

	protected boolean camposNulos(String campo) {
		if (campo == null) {
			return true;
		}
		return false;
	}

	protected boolean camposVacios(String campo) {
		if (campo == "") {
			return true;
		}
		return false;
	}
}
