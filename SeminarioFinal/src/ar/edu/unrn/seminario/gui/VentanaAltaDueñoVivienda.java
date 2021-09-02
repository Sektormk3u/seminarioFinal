package ar.edu.unrn.seminario.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unrn.seminario.api.DataBaseApi;
import ar.edu.unrn.seminario.api.IApi;
import ar.edu.unrn.seminario.dto.DomicilioDTO;
import ar.edu.unrn.seminario.dto.DueñoViviendaDTO;
import ar.edu.unrn.seminario.exceptions.CamposErroneos;
import ar.edu.unrn.seminario.exceptions.CamposVacios;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class VentanaAltaDueñoVivienda extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDNI;
	private JTextField textFieldCalle;
	private JTextField textFieldNumero;
	private JTextField textFieldBarrio;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 * @param api
	 */
	public VentanaAltaDueñoVivienda(IApi api) {
		setTitle("Alta Due\u00F1o Vivienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 86, 80, 14);
		contentPane.add(lblNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(100, 83, 122, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 124, 67, 14);
		contentPane.add(lblApellido);

		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(100, 121, 122, 20);
		contentPane.add(textFieldApellido);

		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(10, 159, 67, 14);
		contentPane.add(lblDni);

		JLabel lblCalle = new JLabel("Calle:");
		lblCalle.setBounds(247, 86, 60, 14);
		contentPane.add(lblCalle);

		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(100, 156, 122, 20);
		contentPane.add(textFieldDNI);
		textFieldDNI.setColumns(10);

		textFieldCalle = new JTextField();
		textFieldCalle.setColumns(10);
		textFieldCalle.setBounds(317, 83, 144, 20);
		contentPane.add(textFieldCalle);

		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(247, 124, 73, 14);
		contentPane.add(lblNumero);

		textFieldNumero = new JTextField();
		textFieldNumero.setColumns(10);
		textFieldNumero.setBounds(317, 121, 73, 20);
		contentPane.add(textFieldNumero);

		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.setBounds(110, 283, 89, 23);
		contentPane.add(botonAceptar);

		JButton botonCanelar = new JButton("Cancelar");
		botonCanelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		botonCanelar.setBounds(261, 283, 89, 23);
		contentPane.add(botonCanelar);

		JLabel lblBarrio = new JLabel("Barrio:");
		lblBarrio.setBounds(247, 159, 46, 14);
		contentPane.add(lblBarrio);

		textFieldBarrio = new JTextField();
		textFieldBarrio.setBounds(317, 156, 144, 20);
		contentPane.add(textFieldBarrio);
		textFieldBarrio.setColumns(10);

		JLabel lblInfoUsuario = new JLabel("Informacion del usuario");
		lblInfoUsuario.setBounds(58, 39, 164, 14);
		contentPane.add(lblInfoUsuario);

		JLabel lblInfoVivienda = new JLabel("Informacion de la vivienda");
		lblInfoVivienda.setBounds(299, 39, 200, 14);
		contentPane.add(lblInfoVivienda);

		botonAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // Registro a BD
				try {

					api.registrarDueñoVivienda(textFieldNombre.getText(), textFieldApellido.getText(),
							textFieldDNI.getText(), textFieldCalle.getText(), textFieldBarrio.getText(),
							Integer.parseInt(textFieldNumero.getText()), new Date());
					JOptionPane.showMessageDialog(null, "Registrado", "Exito", JOptionPane.INFORMATION_MESSAGE);
					dispose();
				} catch (CamposErroneos e1) { // pendiente de implementacion
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				} catch (CamposVacios e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Verificar campo NUMERO DE CALLE", "Error",
							JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
	}
}
