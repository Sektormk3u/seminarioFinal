package ar.edu.unrn.seminario.dto;

import java.util.Date;

public class ViviendaRTO {

	private DueñoViviendaDTO dueño;
	private DomicilioDTO domicilio;
	private Date fechaRegistro;

	public ViviendaRTO(DueñoViviendaDTO dueño, DomicilioDTO domicilio, Date fechaRegistro) {
		this.dueño = dueño;
		this.domicilio = domicilio;
		this.fechaRegistro = fechaRegistro;
	}
}
