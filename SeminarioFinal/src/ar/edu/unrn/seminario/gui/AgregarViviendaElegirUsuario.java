package ar.edu.unrn.seminario.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unrn.seminario.api.IApi;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;

public class AgregarViviendaElegirUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDNI;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AgregarViviendaElegirUsuario(IApi api) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 139);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JLabel lblDNI = new JLabel("Escriba el DNI del due\u00F1o de la vivienda");
		lblDNI.setBounds(23, 8, 185, 14);

		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(240, 5, 131, 20);
		textFieldDNI.setColumns(10);
		panel.setLayout(null);
		panel.add(lblDNI);
		panel.add(textFieldDNI);

		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.setBounds(59, 52, 89, 23);
		panel.add(botonAceptar);

		JButton botonCancelar = new JButton("Cancelar");
		botonCancelar.setBounds(240, 52, 89, 23);
		panel.add(botonCancelar);

		botonCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		
		botonAceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (api.dueñoExiste(textFieldDNI.getText())) {
					AgregarVivienda agregarVivienda = new AgregarVivienda(textFieldDNI.getText(), api); //quede haciendo esto
					agregarVivienda.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "No se encontro usuario", "Atencion", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
	}
}
