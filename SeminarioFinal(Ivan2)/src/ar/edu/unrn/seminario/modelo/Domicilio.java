package ar.edu.unrn.seminario.modelo;

public class Domicilio {

	private String calle;
	private String barrio;
	private Integer numero;
	
	public Domicilio(String calle, String barrio, Integer numero) {
		this.calle=calle;
		this.barrio=barrio;
		this.numero=numero;
	}

	public String getCalle() {
		return calle;
	}

	public String getBarrio() {
		return barrio;
	}

	public Integer getNumero() {
		return numero;
	}
	
	

}
