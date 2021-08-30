package ar.edu.seminario.modelo;

import java.util.Date;

public class Canje {

	private String descripcion;
	private Date fechaCanje;
	private int precioCanje;
	private Beneficio beneficio;

	public Canje(String descripcion, Date fechaCanje, int precioCanje, Beneficio beneficio) {
		this.descripcion = descripcion;
		this.fechaCanje = fechaCanje;
		this.precioCanje = precioCanje;
		this.beneficio = beneficio;
	}
}
