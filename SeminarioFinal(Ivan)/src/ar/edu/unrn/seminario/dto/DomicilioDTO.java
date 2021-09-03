package ar.edu.unrn.seminario.dto;

public class DomicilioDTO {

	private String calle;
	private String barrio;
	private Integer numero;
	
	public DomicilioDTO(String calle, String barrio, Integer numero) {
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
