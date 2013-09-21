package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel credentialsLabel = new JLabel("Credentials:");
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 237);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{106, 0, 0, 153, 0};
		gbl_contentPane.rowHeights = new int[]{65, 27, 39, 36, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		//login label
		JLabel loginLabel = new JLabel("UAVDefense");
		loginLabel.setFont(new Font("Helvetica", Font.PLAIN, 14));
		loginLabel.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_loginLabel = new GridBagConstraints();
		gbc_loginLabel.gridwidth = 4;
		gbc_loginLabel.insets = new Insets(0, 0, 5, 0);
		gbc_loginLabel.gridx = 0;
		gbc_loginLabel.gridy = 0;
		contentPane.add(loginLabel, gbc_loginLabel);
		GridBagConstraints gbc_credentialsLabel = new GridBagConstraints();
		gbc_credentialsLabel.fill = GridBagConstraints.VERTICAL;
		gbc_credentialsLabel.insets = new Insets(0, 0, 5, 5);
		gbc_credentialsLabel.gridx = 0;
		gbc_credentialsLabel.gridy = 1;
		credentialsLabel.setFont(new Font("Helvetica", Font.PLAIN, 13));
		credentialsLabel.setForeground(Color.LIGHT_GRAY);
		contentPane.add(credentialsLabel, gbc_credentialsLabel);
		
		//username label
		JLabel usernameLabel = new JLabel("username");
		usernameLabel.setFont(new Font("Helvetica", Font.PLAIN, 13));
		usernameLabel.setForeground(Color.LIGHT_GRAY);
		usernameLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		usernameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_usernameLabel = new GridBagConstraints();
		gbc_usernameLabel.anchor = GridBagConstraints.WEST;
		gbc_usernameLabel.fill = GridBagConstraints.VERTICAL;
		gbc_usernameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_usernameLabel.gridx = 1;
		gbc_usernameLabel.gridy = 1;
		contentPane.add(usernameLabel, gbc_usernameLabel);
		
		//username text field
		usernameField = new JTextField();
		GridBagConstraints gbc_usernameField = new GridBagConstraints();
		gbc_usernameField.gridwidth = 2;
		gbc_usernameField.insets = new Insets(0, 0, 5, 0);
		gbc_usernameField.fill = GridBagConstraints.HORIZONTAL;
		gbc_usernameField.gridx = 2;
		gbc_usernameField.gridy = 1;
		contentPane.add(usernameField, gbc_usernameField);
		usernameField.setColumns(10);
		
		//password label
		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setFont(new Font("Helvetica", Font.PLAIN, 13));
		passwordLabel.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_passwordLabel = new GridBagConstraints();
		gbc_passwordLabel.anchor = GridBagConstraints.WEST;
		gbc_passwordLabel.insets = new Insets(0, 0, 5, 5);
		gbc_passwordLabel.gridx = 1;
		gbc_passwordLabel.gridy = 2;
		contentPane.add(passwordLabel, gbc_passwordLabel);
		
		//password text field
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.gridwidth = 2;
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 2;
		contentPane.add(passwordField, gbc_passwordField);
		
		//login button
		JButton btnNewButton = new JButton("login");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		//register button 
		JButton btnRegister = new JButton("register");
		btnRegister.setFont(new Font("Helvetica", Font.PLAIN, 13));
		GridBagConstraints gbc_btnRegister = new GridBagConstraints();
		gbc_btnRegister.anchor = GridBagConstraints.WEST;
		gbc_btnRegister.insets = new Insets(0, 0, 5, 0);
		gbc_btnRegister.gridx = 3;
		gbc_btnRegister.gridy = 3;
		contentPane.add(btnRegister, gbc_btnRegister);
		
		/*If the login is successful - switch to the StartFrame and close LoginFrame
		 *If the login is not successful - display dialog box 
		 */
		final JFrame diag = null; 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				//if(authenticate()==0){	
					JOptionPane.showMessageDialog(diag, "Failed to login.");
				//}
				 //else{
				//login();
					StartFrame start = new StartFrame();
					start.setVisible(true);
					setVisible(false); 
			    //}
			}
		});
	}

}
