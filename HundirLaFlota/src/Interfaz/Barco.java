package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Barco extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Barco frame = new Barco();
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
	public Barco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(46, 81, 156, 24);
		contentPane.add(comboBox);
		
		JLabel lblBarco = new JLabel("Barco");
		lblBarco.setBounds(46, 50, 70, 15);
		contentPane.add(lblBarco);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(268, 81, 129, 24);
		contentPane.add(comboBox_1);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(268, 50, 70, 15);
		contentPane.add(lblDireccion);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(173, 191, 117, 25);
		contentPane.add(btnAceptar);
	}
}
