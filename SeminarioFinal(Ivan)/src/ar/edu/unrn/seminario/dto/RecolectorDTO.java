package ar.edu.unrn.seminario.dto;

public class RecolectorDTO extends PersonaDTO{
	
	private String email;

	public RecolectorDTO(String nombre, String apellido, String dni, String email) {
		super(nombre, apellido, dni);
		this.email = email;
	}
}
