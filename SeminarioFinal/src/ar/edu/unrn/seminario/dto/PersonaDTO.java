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
}
