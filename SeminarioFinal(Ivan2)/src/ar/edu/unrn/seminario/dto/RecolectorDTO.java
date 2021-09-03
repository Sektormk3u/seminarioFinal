package ar.edu.unrn.seminario.dto;

public class RecolectorDTO extends PersonaDTO{
	
	private String email;

	public RecolectorDTO(String nombre, String apellido, int dni, String email) {
		super(nombre, apellido, dni);
		this.email = email;
	}
}
