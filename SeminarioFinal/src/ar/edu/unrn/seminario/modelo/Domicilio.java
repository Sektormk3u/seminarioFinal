package ar.edu.unrn.seminario.modelo;

public class Domicilio {

	private String calle;
	private String barrio;
	private Integer numero;
	private String latitud;
	private String longitud;
	
	public Domicilio(String calle, String barrio, Integer numero, String latitud, String longitud) {
		this.calle=calle;
		this.barrio=barrio;
		this.numero=numero;
		this.latitud=latitud;
		this.longitud=longitud;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
