package ar.edu.unrn.seminario.modelo;

import java.util.Date;

public class VisitaVivienda {

	private Date fechaVisita;
	private String observaciones;
	private float cantKilos;

	public VisitaVivienda(Date fechaVisita, String observaciones, float cantKilos) {
		this.fechaVisita = fechaVisita;
		this.observaciones = observaciones;
		this.cantKilos = cantKilos;
	}
}
