package ar.edu.unrn.seminario.modelo;

import java.util.Date;

public class Vivienda {

	private DueñoVivienda dueño;
	private Domicilio domicilio;
	private Date fechaRegistro;

	public Vivienda(DueñoVivienda dueño, Domicilio domicilio, Date fechaRegistro) {
		this.dueño = dueño;
		this.domicilio = domicilio;
		this.fechaRegistro = fechaRegistro;
	}

	public boolean dueñoYaExiste (DueñoVivienda dueño) {
		return this.equals(dueño);
	}

	public DueñoVivienda getDueño() {
		return dueño;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	
}
