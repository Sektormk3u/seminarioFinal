package ar.edu.unrn.seminario.dto;

public class PersonaDTO {
	
	private String apellido;
	private String nombre;
	private int dni;

	public PersonaDTO (String nombre, String apellido, int dni) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
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
