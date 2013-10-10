package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class RegisterFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JPasswordField textPasswordConfirm;
	private JTextField textEmail;
	private JButton btnRegister; 

	/**
	 * Create the frame.
	 */
	public RegisterFrame() {
		createAndShowGUI(); 
	}

	private void createAndShowGUI(){
		JFrame frame = new JFrame(); 
		frame.setTitle("Register"); 
		frame.setContentPane(createContentPane());
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true); 
	}

	private JPanel createContentPane(){ 
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 208, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);


		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Helvetica", Font.BOLD, 14));
		lblRegister.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblRegister = new GridBagConstraints();
		gbc_lblRegister.anchor = GridBagConstraints.WEST;
		gbc_lblRegister.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegister.gridx = 1;
		gbc_lblRegister.gridy = 1;
		contentPane.add(lblRegister, gbc_lblRegister);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Helvetica", Font.PLAIN, 13));
		lblUsername.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.WEST;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 1;
		gbc_lblUsername.gridy = 3;
		contentPane.add(lblUsername, gbc_lblUsername);
		
		textUsername = new JTextField();
		GridBagConstraints gbc_textUsername = new GridBagConstraints();
		gbc_textUsername.insets = new Insets(0, 0, 5, 5);
		gbc_textUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUsername.gridx = 2;
		gbc_textUsername.gridy = 3;
		contentPane.add(textUsername, gbc_textUsername);
		textUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Helvetica", Font.PLAIN, 13));
		lblPassword.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.WEST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 4;
		contentPane.add(lblPassword, gbc_lblPassword);
		
		textPassword = new JPasswordField();
		GridBagConstraints gbc_textPassword = new GridBagConstraints();
		gbc_textPassword.anchor = GridBagConstraints.NORTH;
		gbc_textPassword.insets = new Insets(0, 0, 5, 5);
		gbc_textPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPassword.gridx = 2;
		gbc_textPassword.gridy = 4;
		contentPane.add(textPassword, gbc_textPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Helvetica", Font.PLAIN, 13));
		lblConfirmPassword.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblConfirmPassword = new GridBagConstraints();
		gbc_lblConfirmPassword.anchor = GridBagConstraints.WEST;
		gbc_lblConfirmPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmPassword.gridx = 1;
		gbc_lblConfirmPassword.gridy = 5;
		contentPane.add(lblConfirmPassword, gbc_lblConfirmPassword);
		
		textPasswordConfirm = new JPasswordField();
		GridBagConstraints gbc_textPasswordConfirm = new GridBagConstraints();
		gbc_textPasswordConfirm.insets = new Insets(0, 0, 5, 5);
		gbc_textPasswordConfirm.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPasswordConfirm.gridx = 2;
		gbc_textPasswordConfirm.gridy = 5;
		contentPane.add(textPasswordConfirm, gbc_textPasswordConfirm);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Helvetica", Font.PLAIN, 13));
		lblEmailAddress.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblEmailAddress = new GridBagConstraints();
		gbc_lblEmailAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailAddress.anchor = GridBagConstraints.WEST;
		gbc_lblEmailAddress.gridx = 1;
		gbc_lblEmailAddress.gridy = 6;
		contentPane.add(lblEmailAddress, gbc_lblEmailAddress);
		
		textEmail = new JTextField();
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.insets = new Insets(0, 0, 5, 5);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 2;
		gbc_textEmail.gridy = 6;
		contentPane.add(textEmail, gbc_textEmail);
		textEmail.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		
		GridBagConstraints gbc_btnRegister = new GridBagConstraints();
		gbc_btnRegister.anchor = GridBagConstraints.EAST;
		gbc_btnRegister.insets = new Insets(0, 0, 0, 5);
		gbc_btnRegister.gridx = 2;
		gbc_btnRegister.gridy = 7;
		contentPane.add(btnRegister, gbc_btnRegister);

		return contentPane; 
	}
	public void buttonActionListeners(ActionListener al){
		btnRegister.setActionCommand("register");
		btnRegister.addActionListener(al);
	}
	public String getUsername(){
		return textUsername.getText();
	}
	public char[] getPassword(){
		return textPassword.getPassword(); 
	}
	public char[] getPasswordConfirm(){
		return textPasswordConfirm.getPassword(); 
	}
	public String getEmail(){
		return textEmail.getText(); 
	}

}