package ar.edu.unrn.seminario.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unrn.seminario.api.DataBaseApi;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private DataBaseApi api; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuUsuarios = new JMenu("Usuarios");
		menuBar.add(menuUsuarios);

		JMenuItem altaUsuario = new JMenuItem("Agregar due\u00F1o vivienda");
		menuUsuarios.add(altaUsuario);

		JMenuItem modificarUsuario = new JMenuItem("Modificar due\u00F1o vivienda");
		menuUsuarios.add(modificarUsuario);

		JMenuItem bajaUsuario = new JMenuItem("Borrar due\u00F1o vivienda");
		menuUsuarios.add(bajaUsuario);

		JMenuItem altaPedidoResiduos = new JMenuItem("Generar pedido de retiro de residuos");
		menuUsuarios.add(altaPedidoResiduos);

		JMenu menuRecolectores = new JMenu("Recolectores");
		menuBar.add(menuRecolectores);

		JMenuItem altaRecolector = new JMenuItem("Agregar recolector");
		menuRecolectores.add(altaRecolector);

		JMenuItem modificarRecolector = new JMenuItem("Modificar recolector");
		menuRecolectores.add(modificarRecolector);

		JMenuItem bajaRecolector = new JMenuItem("Borrar recolector");
		menuRecolectores.add(bajaRecolector);

		JMenuItem altaOrdenRetiro = new JMenuItem("Generar orden de retiro de residuos");
		menuRecolectores.add(altaOrdenRetiro);

		JMenuItem altaVisita = new JMenuItem("Generar visita domicilio");
		menuRecolectores.add(altaVisita);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		altaRecolector.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaAltaRecolector ventanaAltaRecolector = new VentanaAltaRecolector();
				ventanaAltaRecolector.setVisible(true);
			}
		});

		altaUsuario.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaAltaDueñoVivienda ventanaAltaDueñovivienda = new VentanaAltaDueñoVivienda(api);
				ventanaAltaDueñovivienda.setVisible(true);
			}
		});
	}

}
