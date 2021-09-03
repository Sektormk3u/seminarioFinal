package ar.edu.unrn.seminario.modelo;

import java.util.Date;

public class Vivienda {

	private Due�oVivienda due�o;
	private Domicilio domicilio;
	private Date fechaRegistro;

	public Vivienda(Due�oVivienda due�o, Domicilio domicilio, Date fechaRegistro) {
		this.due�o = due�o;
		this.domicilio = domicilio;
		this.fechaRegistro = fechaRegistro;
	}

	public boolean due�oYaExiste (Due�oVivienda due�o) {
		return this.equals(due�o);
	}

	public Due�oVivienda getDue�o() {
		return due�o;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	
}
