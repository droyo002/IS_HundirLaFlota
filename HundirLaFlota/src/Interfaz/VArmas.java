package Interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VArmas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JComboBox comboBox;

	

	/**
	 * Create the dialog.
	 */
	public VArmas(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
		setBounds(100, 100, 250, 250);
		getContentPane().setLayout(new BorderLayout());
		
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		comboBox = new JComboBox();
		comboBox.setBounds(46, 81, 156, 24);
		comboBox.addItem("Bomba");
		comboBox.addItem("Misil");
		comboBox.addItem("Misil dirigido");
		contentPanel.add(comboBox);
		
		JLabel lblBarco = new JLabel("Arma");
		lblBarco.setBounds(46, 50, 70, 15);
		contentPanel.add(lblBarco);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(62, 161, 117, 25);
		btnAceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		contentPanel.add(btnAceptar);
	}
	
	public String getArma() {
		return (String) comboBox.getSelectedItem(); 
	}

}
