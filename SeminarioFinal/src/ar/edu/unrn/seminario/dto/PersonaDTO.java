package ar.edu.unrn.seminario.dto;

public class PersonaDTO {
	
	private String apellido;
	private String nombre;
	private String dni;

	public PersonaDTO (String nombre, String apellido, String dni) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}

	protected String getApellido() {
		return apellido;
	}

	protected String getNombre() {
		return nombre;
	}

	protected String getDni() {
		return dni;
	}
	
	
}
