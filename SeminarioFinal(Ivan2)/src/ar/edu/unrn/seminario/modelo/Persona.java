package ar.edu.unrn.seminario.modelo;

import ar.edu.unrn.seminario.exceptions.CamposErroneos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;

public class Persona {

	private String apellido;
	private String nombre;
	private int dni;

	public Persona(String nombre, String apellido, int dni) throws CamposErroneos, CamposVacios {
		if (camposVacios(nombre)) {
			throw new CamposVacios("Verificar campo: NOMBRE esta vacio");
		}
		if (camposVacios(apellido)) {
			throw new CamposVacios("Verificar campo: APELLIDO esta vacio");
		}
		if (camposErroneos(nombre)) {
			throw new CamposErroneos("Verificar campo: NOMBRE debera contener solo letras y/o espacios");
		}
		if (camposErroneos(apellido)) {
			throw new CamposErroneos("Verificar campo: APELLIDO debera contener solo letras y/o espacios");
		}
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	protected boolean camposErroneos(String campo) { // ver como verificar - pendiente
		for (int x = 0; x < campo.length(); x++) {
			char c = campo.charAt(x);
			// Si no está entre a y z, ni entre A y Z, ni es un espacio
			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
				return true;
			}
		}
		return false;
	}

	protected boolean camposVacios(String campo) {
		if (campo.equals("")) {
			return true;
		}
		return false;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDni() {
		return dni;
	}

}
