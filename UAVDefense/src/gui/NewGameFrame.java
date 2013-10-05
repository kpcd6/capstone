package gui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JSpinner;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class NewGameFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtGameName;
	private JTextField txtTeamName;
	private JTextField txtTeamName2;



	/**
	 * Create the frame.
	 */
	public NewGameFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 532, 301);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 73, 22, 45, 37, 44, 62, 95, 34, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewGame = new JLabel("New Game");
		lblNewGame.setForeground(Color.LIGHT_GRAY);
		lblNewGame.setFont(new Font("Helvetica", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewGame = new GridBagConstraints();
		gbc_lblNewGame.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewGame.gridx = 1;
		gbc_lblNewGame.gridy = 1;
		contentPane.add(lblNewGame, gbc_lblNewGame);
		
		JLabel lblGameName = new JLabel("Game Name:");
		lblGameName.setForeground(Color.LIGHT_GRAY);
		lblGameName.setFont(new Font("Helvetica", Font.PLAIN, 13));
		GridBagConstraints gbc_lblGameName = new GridBagConstraints();
		gbc_lblGameName.gridwidth = 2;
		gbc_lblGameName.insets = new Insets(0, 0, 5, 5);
		gbc_lblGameName.anchor = GridBagConstraints.EAST;
		gbc_lblGameName.gridx = 1;
		gbc_lblGameName.gridy = 2;
		contentPane.add(lblGameName, gbc_lblGameName);
		
		txtGameName = new JTextField();
		GridBagConstraints gbc_txtGameName = new GridBagConstraints();
		gbc_txtGameName.gridwidth = 5;
		gbc_txtGameName.insets = new Insets(0, 0, 5, 5);
		gbc_txtGameName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGameName.gridx = 3;
		gbc_txtGameName.gridy = 2;
		contentPane.add(txtGameName, gbc_txtGameName);
		txtGameName.setColumns(10);
		
		JLabel lblTeamName = new JLabel("Team 1 Name:");
		lblTeamName.setForeground(Color.LIGHT_GRAY);
		lblTeamName.setFont(new Font("Helvetica", Font.PLAIN, 13));
		GridBagConstraints gbc_lblTeamName = new GridBagConstraints();
		gbc_lblTeamName.anchor = GridBagConstraints.EAST;
		gbc_lblTeamName.gridwidth = 2;
		gbc_lblTeamName.insets = new Insets(0, 0, 5, 5);
		gbc_lblTeamName.gridx = 1;
		gbc_lblTeamName.gridy = 3;
		contentPane.add(lblTeamName, gbc_lblTeamName);
		
		txtTeamName = new JTextField();
		GridBagConstraints gbc_txtTeamName = new GridBagConstraints();
		gbc_txtTeamName.gridwidth = 5;
		gbc_txtTeamName.insets = new Insets(0, 0, 5, 5);
		gbc_txtTeamName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTeamName.gridx = 3;
		gbc_txtTeamName.gridy = 3;
		contentPane.add(txtTeamName, gbc_txtTeamName);
		txtTeamName.setColumns(10);
		
		JLabel lblTeamName2 = new JLabel("Team 2 Name:");
		lblTeamName2.setForeground(Color.LIGHT_GRAY);
		lblTeamName2.setFont(new Font("Helvetica", Font.PLAIN, 13));
		GridBagConstraints gbc_lblTeamName2 = new GridBagConstraints();
		gbc_lblTeamName2.anchor = GridBagConstraints.EAST;
		gbc_lblTeamName2.gridwidth = 2;
		gbc_lblTeamName2.insets = new Insets(0, 0, 5, 5);
		gbc_lblTeamName2.gridx = 1;
		gbc_lblTeamName2.gridy = 4;
		contentPane.add(lblTeamName2, gbc_lblTeamName2);
		
		txtTeamName2 = new JTextField();
		GridBagConstraints gbc_txtTeamName2 = new GridBagConstraints();
		gbc_txtTeamName2.gridwidth = 5;
		gbc_txtTeamName2.insets = new Insets(0, 0, 5, 5);
		gbc_txtTeamName2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTeamName2.gridx = 3;
		gbc_txtTeamName2.gridy = 4;
		contentPane.add(txtTeamName2, gbc_txtTeamName2);
		txtTeamName2.setColumns(10);
		
		JLabel lblNumberPlayers = new JLabel("Players Per Team:");
		lblNumberPlayers.setForeground(Color.LIGHT_GRAY);
		lblNumberPlayers.setFont(new Font("Helvetica", Font.PLAIN, 13));
		lblNumberPlayers.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblNumberPlayers = new GridBagConstraints();
		gbc_lblNumberPlayers.gridwidth = 2;
		gbc_lblNumberPlayers.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumberPlayers.gridx = 1;
		gbc_lblNumberPlayers.gridy = 5;
		contentPane.add(lblNumberPlayers, gbc_lblNumberPlayers);
		
		JSpinner spinner = new JSpinner();
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 3;
		gbc_spinner.gridy = 5;
		contentPane.add(spinner, gbc_spinner);
		
		JLabel lblMapSize = new JLabel("Map Size:");
		lblMapSize.setFont(new Font("Helvetica", Font.PLAIN, 13));
		lblMapSize.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblMapSize = new GridBagConstraints();
		gbc_lblMapSize.anchor = GridBagConstraints.EAST;
		gbc_lblMapSize.gridwidth = 2;
		gbc_lblMapSize.insets = new Insets(0, 0, 5, 5);
		gbc_lblMapSize.gridx = 1;
		gbc_lblMapSize.gridy = 6;
		contentPane.add(lblMapSize, gbc_lblMapSize);
		
		JComboBox comboMapSize = new JComboBox();
		GridBagConstraints gbc_comboMapSize = new GridBagConstraints();
		gbc_comboMapSize.gridwidth = 3;
		gbc_comboMapSize.insets = new Insets(0, 0, 5, 5);
		gbc_comboMapSize.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboMapSize.gridx = 3;
		gbc_comboMapSize.gridy = 6;
		contentPane.add(comboMapSize, gbc_comboMapSize);
		
		JLabel lblDuration = new JLabel("Duration:");
		lblDuration.setForeground(Color.LIGHT_GRAY);
		lblDuration.setFont(new Font("Helvetica", Font.PLAIN, 13));
		GridBagConstraints gbc_lblDuration = new GridBagConstraints();
		gbc_lblDuration.anchor = GridBagConstraints.EAST;
		gbc_lblDuration.gridwidth = 2;
		gbc_lblDuration.insets = new Insets(0, 0, 0, 5);
		gbc_lblDuration.gridx = 1;
		gbc_lblDuration.gridy = 7;
		contentPane.add(lblDuration, gbc_lblDuration);
		
		JSpinner minSpinner = new JSpinner();
		minSpinner.setModel(new SpinnerNumberModel(1, 1, 20, 1));
		GridBagConstraints gbc_minSpinner = new GridBagConstraints();
		gbc_minSpinner.anchor = GridBagConstraints.EAST;
		gbc_minSpinner.insets = new Insets(0, 0, 0, 5);
		gbc_minSpinner.gridx = 3;
		gbc_minSpinner.gridy = 7;
		contentPane.add(minSpinner, gbc_minSpinner);
		
		JLabel lblMin = new JLabel("min");
		lblMin.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblMin = new GridBagConstraints();
		gbc_lblMin.anchor = GridBagConstraints.WEST;
		gbc_lblMin.insets = new Insets(0, 0, 0, 5);
		gbc_lblMin.gridx = 4;
		gbc_lblMin.gridy = 7;
		contentPane.add(lblMin, gbc_lblMin);
		
		JSpinner spinnerSeconds = new JSpinner();
		spinnerSeconds.setModel(new SpinnerNumberModel(0, 0, 60, 1));
		GridBagConstraints gbc_spinnerSeconds = new GridBagConstraints();
		gbc_spinnerSeconds.anchor = GridBagConstraints.WEST;
		gbc_spinnerSeconds.insets = new Insets(0, 0, 0, 5);
		gbc_spinnerSeconds.gridx = 5;
		gbc_spinnerSeconds.gridy = 7;
		contentPane.add(spinnerSeconds, gbc_spinnerSeconds);
		
		JLabel lblSec = new JLabel("sec");
		lblSec.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblSec = new GridBagConstraints();
		gbc_lblSec.anchor = GridBagConstraints.WEST;
		gbc_lblSec.insets = new Insets(0, 0, 0, 5);
		gbc_lblSec.gridx = 6;
		gbc_lblSec.gridy = 7;
		contentPane.add(lblSec, gbc_lblSec);
		
		JButton btnCreateGame = new JButton("Create Game");
		GridBagConstraints gbc_btnCreateGame = new GridBagConstraints();
		gbc_btnCreateGame.insets = new Insets(0, 0, 0, 5);
		gbc_btnCreateGame.gridx = 7;
		gbc_btnCreateGame.gridy = 7;
		contentPane.add(btnCreateGame, gbc_btnCreateGame);
	}

}
