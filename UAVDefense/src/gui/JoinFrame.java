package gui;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTable;

import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class JoinFrame extends JFrame {

	private JPanel contentPane;
	private JTable gameStatsTable;
	private JTable playerStatsTable;


	/**
	 * Create the frame.
	 */
	public JoinFrame() {
		//for joinFrame we probably want the close operation 
        //to close the game, not the entire program. We can use
		//DO_NOTHING_ON_CLOSE and set it to tell the DB we are 
	    //no longer in the game, and then free up resources 
		//by using a action listener on window close.   
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                 
		setBounds(100, 100, 800, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{124, 538, 126, 0};
		gbl_contentPane.rowHeights = new int[]{415, 238, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		gameStatsTable = new JTable();
		gameStatsTable.setFont(new Font("Helvetica", Font.PLAIN, 12));
		gameStatsTable.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_gameStatsTable = new GridBagConstraints();
		gbc_gameStatsTable.gridheight = 2;
		gbc_gameStatsTable.insets = new Insets(0, 0, 5, 5);
		gbc_gameStatsTable.fill = GridBagConstraints.BOTH;
		gbc_gameStatsTable.gridx = 0;
		gbc_gameStatsTable.gridy = 0;
		contentPane.add(gameStatsTable, gbc_gameStatsTable);
		
		JPanel streamPanel = new JPanel();
		streamPanel.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_streamPanel = new GridBagConstraints();
		gbc_streamPanel.insets = new Insets(0, 0, 5, 5);
		gbc_streamPanel.fill = GridBagConstraints.BOTH;
		gbc_streamPanel.gridx = 1;
		gbc_streamPanel.gridy = 0;
		contentPane.add(streamPanel, gbc_streamPanel);
		GridBagLayout gbl_streamPanel = new GridBagLayout();
		gbl_streamPanel.columnWidths = new int[]{0};
		gbl_streamPanel.rowHeights = new int[]{0};
		gbl_streamPanel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_streamPanel.rowWeights = new double[]{Double.MIN_VALUE};
		streamPanel.setLayout(gbl_streamPanel);
		
		playerStatsTable = new JTable();
		playerStatsTable.setFont(new Font("Helvetica", Font.PLAIN, 12));
		playerStatsTable.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_playerStatsTable = new GridBagConstraints();
		gbc_playerStatsTable.gridheight = 2;
		gbc_playerStatsTable.insets = new Insets(0, 0, 5, 0);
		gbc_playerStatsTable.fill = GridBagConstraints.BOTH;
		gbc_playerStatsTable.gridx = 2;
		gbc_playerStatsTable.gridy = 0;
		contentPane.add(playerStatsTable, gbc_playerStatsTable);
		
		JPanel mapPanel = new JPanel();
		mapPanel.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_mapPanel = new GridBagConstraints();
		gbc_mapPanel.insets = new Insets(0, 0, 0, 5);
		gbc_mapPanel.fill = GridBagConstraints.BOTH;
		gbc_mapPanel.gridx = 1;
		gbc_mapPanel.gridy = 1;
		contentPane.add(mapPanel, gbc_mapPanel);
	}

}
