package fr.ludo.appbanquaire;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;



import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Connecter {

	public static JFrame frame;
	public static JTextField prenom;
	public static JTextField nom;	
	public static JTextField mail;
	public static JTextField tel;
	public static JTextField adresse;
	public static JTextField ville;
	public static JTextField pays;

	/**
	 * Lancer l'application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connecter window = new Connecter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creer application
	 */
	public Connecter() {
		initialize();
	}

	/**
	 * Initialise les frame
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 381, 513);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Retour");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(265, 440, 89, 23);
		frame.getContentPane().add(btnNewButton);
	
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 69, 344, 321);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		prenom = new JTextField();
		prenom.setBounds(104, 11, 205, 20);
		panel.add(prenom);
		prenom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prenom :");
		lblNewLabel.setBounds(10, 14, 84, 14);
		panel.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Nom :");
		lblLastName.setBounds(10, 45, 84, 14);
		panel.add(lblLastName);
		
		nom = new JTextField();
		nom.setBounds(104, 42, 205, 20);
		panel.add(nom);
		nom.setColumns(10);
		
		
				
		JLabel lblMail = new JLabel("Mail :");
		lblMail.setBounds(10, 101, 84, 14);
		panel.add(lblMail);
		
		mail = new JTextField();
		mail.setBounds(104, 98, 205, 20);
		panel.add(mail);
		mail.setColumns(10);
		
		JLabel lblPhone = new JLabel("Tel :");
		lblPhone.setBounds(10, 129, 84, 14);
		panel.add(lblPhone);
		
		tel = new JTextField();
		tel.setBounds(104, 126, 205, 20);
		panel.add(tel);
		tel.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Sexe :");
		lblNewLabel_5.setBounds(10, 157, 84, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Adresse :");
		lblNewLabel_6.setBounds(10, 270, 84, 14);
		panel.add(lblNewLabel_6);
		
		
		JLabel lblNewLabel_8 = new JLabel("Ville :");
		lblNewLabel_8.setBounds(10, 242, 84, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Pays :");
		lblNewLabel_9.setBounds(10, 215, 84, 14);
		panel.add(lblNewLabel_9);
		
		adresse = new JTextField();
		adresse.setBounds(104, 267, 205, 20);
		panel.add(adresse);
		adresse.setColumns(10);
		
		ville = new JTextField();
		ville.setBounds(104, 239, 205, 20);
		panel.add(ville);
		ville.setColumns(10);
		
		pays = new JTextField();
		pays.setBounds(104, 212, 205, 20);
		panel.add(pays);
		pays.setColumns(10);
		
		 JComboBox sexe = new JComboBox();
		sexe.setBounds(104, 153, 105, 22);
		panel.add(sexe);
		sexe.setModel(new DefaultComboBoxModel(new String[] {"Sexe", "homme", "femme"}));
		sexe.setSelectedIndex(0);
		sexe.setToolTipText("");
		
		
		JLabel lblNewLabel_1 = new JLabel("Inscription");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel_1.setBounds(107, 0, 258, 75);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("Creer le compte");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Client A= new Client();	
			
   		  
		
			
			
			
		
				
			}
			}	);
				
					
			
		
		btnNewButton_1.setBounds(125, 401, 130, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Annuler");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			      Connecter.prenom.setText("");
			      Connecter.nom.setText("");			      
			      Connecter.mail.setText("");
			      Connecter.tel.setText("");
			      Connecter.pays.setText("");
			      Connecter.ville.setText("");
			      Connecter.adresse.setText("");
			      sexe.setSelectedIndex(0);
			     
			}
		});
		btnNewButton_3.setBounds(265, 401, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}

	public void setVisible(boolean b) {
		Connecter window = new Connecter();
		window.frame.setVisible(b);
		//frame.setLocationRelativeTo(null);
		
	}
}
