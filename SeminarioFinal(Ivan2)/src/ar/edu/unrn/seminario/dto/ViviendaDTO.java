package ar.edu.unrn.seminario.dto;

import java.util.Date;

public class ViviendaDTO {

	private Due�oViviendaDTO due�o;
	private DomicilioDTO domicilio;
	private Date fechaRegistro;

	public ViviendaDTO(Due�oViviendaDTO due�o, DomicilioDTO domicilio, Date fechaRegistro) {
		this.due�o = due�o;
		this.domicilio = domicilio;
		this.fechaRegistro = fechaRegistro;
	}

	public Due�oViviendaDTO getDue�o() {
		return due�o;
	}

	public DomicilioDTO getDomicilio() {
		return domicilio;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	
}
