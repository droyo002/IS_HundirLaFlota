package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import packModelo.Humano;
import packModelo.HundirFlota;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.awt.event.ActionEvent;

public class VHundirLaFlota extends JFrame implements Observer {

	private JPanel contentPane;
	private ArrayList<JLabel> casillas;
	private ArrayList<JLabel> casillasOrdenador;
	private String rutaCasilla="/imagenes/Agua.png";
	private boolean barco=false;
	private VBarco eleccionBarco;
	private VArmas eleccionArma;
	private static final int X=10;
	private static final int Y=10;
	

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
		casillas= new ArrayList<JLabel>();
		casillasOrdenador= new ArrayList<JLabel>();
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
					
					dialogoBarco();
					
				}
			});
			contentPane.add(btnColocarBarco);
		
		
			JButton btnDisparar = new JButton("Disparar");
			btnDisparar.setBounds(200, 416, 117, 25);
			btnDisparar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					dialogoArmas();
				}
			});
			contentPane.add(btnDisparar);
		
		
			JButton btnAlmacen = new JButton("Almacen");
			btnAlmacen.setBounds(336, 416, 117, 25);
			contentPane.add(btnAlmacen);
		
		
			JButton btnEscudo = new JButton("Escudo");
			btnEscudo.setBounds(482, 416, 117, 25);
			contentPane.add(btnEscudo);
		
			Humano.getHumano().addObserver(this);
			
	}
	
	private void dialogoBarco() {
		eleccionBarco= new VBarco(this,true);
		eleccionBarco.setVisible(true);
		
		this.barco=true;
	}
	
	private void dialogoArmas() {
		eleccionArma=new VArmas(this, true);
		eleccionArma.setVisible(true);
	}
	
	private JPanel MapaJugador() {
		JPanel panel = new JPanel();
		panel.setBounds(12, 12, 370, 370);
		
		for (int i=0;i<X;i++) {
			for (int j=0;j<Y;j++){
				JLabel casilla= new JLabel();
				casillas.add(casilla);
				casilla.setIcon(new ImageIcon(VHundirLaFlota.class.getResource(rutaCasilla)));
				casilla.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e){
						if (e.getButton() == MouseEvent.BUTTON1 && barco) {
							barco=false;
							int pos= buscarPosCasilla((JLabel) e.getSource());
							int x= pos%X;
							int y= pos/X;
							System.out.println("x: "+x + " y: "+y);
							HundirFlota.getHundirFlota().colocarBarco(x, y, eleccionBarco.getDireccion(), eleccionBarco.getBarco());
						}
					}
				});
				panel.add(casilla);
				
			}
		}
		
		return panel;
	}
	
	private int buscarPosCasilla(JLabel source) {

		return casillas.indexOf(source);
	}
	
	
	
	private JPanel MapaOrdenador() {
		JPanel panel = new JPanel();
		panel.setBounds(400, 12, 370, 370);
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++){
				JLabel casilla= new JLabel();
				casillasOrdenador.add(casilla);
				casilla.setIcon(new ImageIcon(VHundirLaFlota.class.getResource(rutaCasilla)));
				casilla.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e){
						if (e.getButton() == MouseEvent.BUTTON1) {
							
							int pos= buscarPosCasillaO((JLabel) e.getSource());
							int x= pos%X;
							int y= pos/X;
							System.out.println("x: "+x + " y: "+y);
							Humano.getHumano().atacarPunto(x, y,eleccionArma.getArma());
						}
					}
				});
				panel.add(casilla);
			}
		}
		return panel;
	}
	
	private int buscarPosCasillaO(JLabel source) {

		return casillasOrdenador.indexOf(source);
	}
	
	private JButton boton(String nombre) {
		return new JButton(nombre);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		int pos = (int) arg;
		casillas.get(pos).setIcon(new ImageIcon(getClass().getResource("/imagenes/Barco.png")));
		
	}
}
