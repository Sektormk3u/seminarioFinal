package ar.edu.unrn.seminario.modelo;
import java.sql.Date;

public class Vivienda {

	private Due�oVivienda due�o;
	private Domicilio domicilio;
	private Date fechaRegistro;
	
	public Vivienda(Due�oVivienda due�o, Domicilio domicilio, Date fechaRegistro) {
		this.due�o=due�o;
		this.domicilio=domicilio;
		this.fechaRegistro=fechaRegistro;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
