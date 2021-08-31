package ar.edu.unrn.seminario.modelo;
import java.sql.Date;

public class Vivienda {

	private DueñoVivienda dueño;
	private Domicilio domicilio;
	private Date fechaRegistro;
	
	public Vivienda(DueñoVivienda dueño, Domicilio domicilio, Date fechaRegistro) {
		this.dueño=dueño;
		this.domicilio=domicilio;
		this.fechaRegistro=fechaRegistro;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
