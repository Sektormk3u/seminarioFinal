package ar.edu.unrn.seminario.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaAltaRecolector extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDNI;
	private JTextField textFieldEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAltaRecolector frame = new VentanaAltaRecolector();
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
	public VentanaAltaRecolector() {
		setTitle("Alta Recolector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(50, 38, 79, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(50, 70, 79, 14);
		panel.add(lblApellido);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setBounds(50, 103, 79, 14);
		panel.add(lblDNI);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(50, 134, 56, 14);
		panel.add(lblEmail);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(128, 35, 177, 20);
		panel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(128, 67, 177, 20);
		panel.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(128, 100, 117, 20);
		panel.add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(128, 131, 177, 20);
		panel.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.setBounds(77, 204, 89, 23);
		panel.add(botonAceptar);
	
		
		JButton botonCanelar = new JButton("Cancelar");
		botonCanelar.setBounds(248, 204, 89, 23);
		panel.add(botonCanelar);
	}
}
