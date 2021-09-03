package ar.edu.unrn.seminario.modelo;

import java.util.ArrayList;

public class Catalogo {

	private ArrayList<Beneficio> listaBeneficios;
	
	public Catalogo () {
		this.listaBeneficios = new ArrayList<Beneficio>();
	}
	
	public void agregarBeneficioALista (Beneficio beneficio) {
		this.listaBeneficios.add(beneficio);
	}
	
}
