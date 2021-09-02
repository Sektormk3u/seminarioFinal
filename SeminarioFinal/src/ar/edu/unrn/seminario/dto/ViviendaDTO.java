package ar.edu.unrn.seminario.dto;

import java.util.Date;

public class ViviendaDTO {

	private DueñoViviendaDTO dueño;
	private DomicilioDTO domicilio;
	private Date fechaRegistro;

	public ViviendaDTO(DueñoViviendaDTO dueño, DomicilioDTO domicilio, Date fechaRegistro) {
		this.dueño = dueño;
		this.domicilio = domicilio;
		this.fechaRegistro = fechaRegistro;
	}
}
