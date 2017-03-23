package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VHundirLaFlota extends JFrame {

	private JPanel contentPane;
	private String rutaCasilla="/imagenes/Casilla.png";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VHundirLaFlota frame = new VHundirLaFlota();
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
	public VHundirLaFlota() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Hundir la flota");
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		getContentPane().add(MapaJugador());
		getContentPane().add(MapaOrdenador());
		
			JButton btnColocarBarco = new JButton("Colocar Barco");
			btnColocarBarco.setBounds(33, 416, 136, 25);
			btnColocarBarco.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JFrame barco= new Barco();
					barco.setVisible(true);
				}
			});
			contentPane.add(btnColocarBarco);
		
		
			JButton btnDisparar = new JButton("Disparar");
			btnDisparar.setBounds(200, 416, 117, 25);
			contentPane.add(btnDisparar);
		
		
			JButton btnAlmacen = new JButton("Almacen");
			btnAlmacen.setBounds(336, 416, 117, 25);
			contentPane.add(btnAlmacen);
		
		
			JButton btnEscudo = new JButton("Escudo");
			btnEscudo.setBounds(482, 416, 117, 25);
			contentPane.add(btnEscudo);
		
		
		
	}
	
	private JPanel MapaJugador() {
		JPanel panel = new JPanel();
		panel.setBounds(12, 12, 370, 370);
		
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++){
				JLabel casilla= new JLabel();
				casilla.setIcon(new ImageIcon(VHundirLaFlota.class.getResource(rutaCasilla)));
				panel.add(casilla);
			}
		}
		
		return panel;
	}
	
	private JPanel MapaOrdenador() {
		JPanel panel = new JPanel();
		panel.setBounds(400, 12, 370, 370);
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++){
				JLabel casilla= new JLabel();
				casilla.setIcon(new ImageIcon(VHundirLaFlota.class.getResource(rutaCasilla)));
				panel.add(casilla);
			}
		}
		return panel;
	}
	
	private JButton boton(String nombre) {
		return new JButton(nombre);
	}
}
