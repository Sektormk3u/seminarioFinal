package ar.edu.unrn.seminario.modelo;

import ar.edu.unrn.seminario.exceptions.CamposErroneos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;

public class Persona {

	private String apellido;
	private String nombre;
	private String dni;

	public Persona(String nombre, String apellido, String dni) throws CamposErroneos, CamposVacios {
		if (camposVacios(dni) || camposVacios(nombre) || camposVacios(apellido)) {
			throw new CamposVacios("Verificar, campos vacios");
		}
		if (camposErroneos(nombre) || camposErroneos(dni) || camposErroneos(apellido)) {
			throw new CamposErroneos("Verificar, campos erroneos");
		}
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	protected boolean camposErroneos(String campo) { // ver como verificar - pendiente
		if (campo == null) {
			return true;
		}
		return false;
	}

	protected boolean camposVacios(String campo) {
		if (campo.equals("")) {
			return true;
		}
		return false;
	}

	public String obtenerDNI() {
		return dni;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	public String obtenerApellido() {
		return apellido;
	}
}
