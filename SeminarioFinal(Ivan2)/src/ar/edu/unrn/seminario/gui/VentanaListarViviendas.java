package ar.edu.unrn.seminario.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unrn.seminario.api.DataBaseApi;
import ar.edu.unrn.seminario.api.IApi;
import ar.edu.unrn.seminario.api.MemoryApi;
import ar.edu.unrn.seminario.dto.DomicilioDTO;
import ar.edu.unrn.seminario.dto.DueñoViviendaDTO;
import ar.edu.unrn.seminario.dto.ViviendaDTO;
import ar.edu.unrn.seminario.exceptions.CamposErroneos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;
import ar.edu.unrn.seminario.modelo.Domicilio;
import ar.edu.unrn.seminario.modelo.DueñoVivienda;
import ar.edu.unrn.seminario.modelo.Vivienda;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;

public class VentanaListarViviendas extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DefaultTableModel modelo;

	//private ArrayList<DueñoViviendaDTO> listaDueños;
	private ArrayList<ViviendaDTO> listaViviendas;
	private JButton btnNewButton;

	public VentanaListarViviendas(IApi api) {
		setTitle("Lista Viviendas");
		String[] titulos = { "Nombre", "Apellido", "DNI", "Calle", "Numero", "Barrio", "Fecha" };
		modelo = new DefaultTableModel(new Object[][] {}, titulos);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(modelo);
		
		btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnNewButton, BorderLayout.NORTH);

		/*
		 * Prueba carga lista DueñoViviendaDTO d1 = new DueñoViviendaDTO("Leonel",
		 * "Mercado", "123"); DueñoViviendaDTO d2 = new DueñoViviendaDTO("Ivan",
		 * "Scheck", "456"); DueñoViviendaDTO d3 = new DueñoViviendaDTO("Leonardo",
		 * "Incaminato", "789"); DomicilioDTO dir1 = new
		 * DomicilioDTO("San Martin","barrio1",98); DomicilioDTO dir2 = new
		 * DomicilioDTO("Belgrano","barrio2",99); DomicilioDTO dir3 = new
		 * DomicilioDTO("Moreno","barrio3",100); Date fecha1; Date fecha2; Date fecha3;
		 * ViviendaDTO v1 = new ViviendaDTO(d1,dir1,fecha1 = new Date()); ViviendaDTO v2
		 * = new ViviendaDTO(d2,dir2,fecha2 = new Date()); ViviendaDTO v3 = new
		 * ViviendaDTO(d3,dir3,fecha3 = new Date()); //List<ViviendaDTO> viviendas =
		 * api.obtenerViviendas(); List<ViviendaDTO> viviendas = new
		 * ArrayList<ViviendaDTO>(); viviendas.add(v1); viviendas.add(v2);
		 * viviendas.add(v3);
		 */

		listaViviendas = api.listaViviendas();

		for (ViviendaDTO v : listaViviendas) {
			modelo.addRow(new Object[] { v.getDueño().getNombre(), v.getDueño().getApellido(), v.getDueño().getDni(),
					v.getDomicilio().getCalle(), v.getDomicilio().getNumero(), v.getDomicilio().getBarrio(), v.getFechaRegistro() });

		}

		// contentPane.add(scrollPane, BorderLayout.CENTER);
		// scrollPane.setViewportView(table);

	}

}
