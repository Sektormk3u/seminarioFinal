package ar.edu.unrn.seminario.dto;


/**
 * @author Sektor
 *
 */
public class Due�oViviendaDTO extends PersonaDTO{

private Integer puntaje;
	
	public Due�oViviendaDTO(String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
		this.puntaje = 0;
	}
	
	
}
