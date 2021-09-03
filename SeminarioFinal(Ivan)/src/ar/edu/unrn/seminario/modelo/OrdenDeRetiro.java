package ar.edu.unrn.seminario.modelo;

public class OrdenDeRetiro {

	private Integer numeroDeOrden;
	private Vivienda vivienda;
	private EstadoOrden estado;
	private PedidoRetiro pedido;
	
	public OrdenDeRetiro(Integer numeroDeOrden, Vivienda vivienda, EstadoOrden estado, PedidoRetiro pedido) {
		this.numeroDeOrden=numeroDeOrden;
		this.vivienda=vivienda;
		this.estado=estado;
		this.pedido=pedido;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
