package ar.edu.unrn.seminario.dto;


/**
 * @author Sektor
 *
 */
public class DueñoViviendaDTO extends PersonaDTO{

private Integer puntaje;
	
	public DueñoViviendaDTO(String nombre, String apellido, String dni) {
		super(nombre, apellido, dni);
		this.puntaje = 0;
	}
	
	
}
