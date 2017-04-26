package Interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VBarco extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			VBarco dialog = new VBarco();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public VBarco(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		comboBox = new JComboBox();
		comboBox.setBounds(46, 81, 156, 24);
		comboBox.addItem("Fragata");
		comboBox.addItem("Destructor");
		comboBox.addItem("Submarino");
		comboBox.addItem("Portaviones");
		contentPanel.add(comboBox);
		
		JLabel lblBarco = new JLabel("Barco");
		lblBarco.setBounds(46, 50, 70, 15);
		contentPanel.add(lblBarco);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(268, 81, 129, 24);
		comboBox_1.addItem("Horizontal");
		comboBox_1.addItem("Vertical");
		contentPanel.add(comboBox_1);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(268, 50, 70, 15);
		contentPanel.add(lblDireccion);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(173, 191, 117, 25);
		btnAceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		contentPanel.add(btnAceptar);
	}
	public int getBarco() {
		return comboBox.getSelectedIndex(); 
	}
	public String getDireccion() {
		return (String) comboBox_1.getSelectedItem(); 
	}

}
