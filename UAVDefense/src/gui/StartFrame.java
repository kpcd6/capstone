package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.GridBagConstraints;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class StartFrame extends JFrame {

	private JPanel contentPane;
	private JTable tablePlayerStats;
	private JTable tableGameProgress;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
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
	public StartFrame() {
	
		
		//Main Frame
		setResizable(false);
		setTitle("UAVDefense");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 485);
		
		//Menu
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.GRAY);
		setJMenuBar(menuBar);
		
		//Menu Items
		JMenu mnFile = new JMenu("File");
		mnFile.setBackground(Color.DARK_GRAY);
		menuBar.add(mnFile);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.setBackground(Color.LIGHT_GRAY);
		mnFile.add(mntmAbout);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setBackground(Color.LIGHT_GRAY);
		mnFile.add(mntmLogout);
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setBackground(Color.LIGHT_GRAY);
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 74, 12, 126, 118, 22, 106, 163, 0, 0};
		gbl_contentPane.rowHeights = new int[]{26, 25, 27, 299, 29, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		//Labels
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Helvetica", Font.PLAIN, 13));
		lblUsername.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.WEST;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 0;
		contentPane.add(lblUsername, gbc_lblUsername);
		
		JLabel lblGetUsername = new JLabel("user");
		lblGetUsername.setFont(new Font("Helvetica", Font.PLAIN, 13));
		lblGetUsername.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblGetUsername = new GridBagConstraints();
		gbc_lblGetUsername.anchor = GridBagConstraints.WEST;
		gbc_lblGetUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetUsername.gridx = 1;
		gbc_lblGetUsername.gridy = 0;
		contentPane.add(lblGetUsername, gbc_lblGetUsername);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Helvetica", Font.PLAIN, 13));
		lblStatus.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblStatus = new GridBagConstraints();
		gbc_lblStatus.anchor = GridBagConstraints.WEST;
		gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblStatus.gridx = 0;
		gbc_lblStatus.gridy = 1;
		contentPane.add(lblStatus, gbc_lblStatus);
		
		JLabel lblGetStatus = new JLabel("status");
		lblGetStatus.setFont(new Font("Helvetica", Font.PLAIN, 13));
		lblGetStatus.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblGetStatus = new GridBagConstraints();
		gbc_lblGetStatus.anchor = GridBagConstraints.WEST;
		gbc_lblGetStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblGetStatus.gridx = 1;
		gbc_lblGetStatus.gridy = 1;
		contentPane.add(lblGetStatus, gbc_lblGetStatus);
		
		JLabel lblUserStats = new JLabel("User Stats ");
		lblUserStats.setFont(new Font("Helvetica", Font.PLAIN, 13));
		lblUserStats.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblUserStats = new GridBagConstraints();
		gbc_lblUserStats.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserStats.gridx = 0;
		gbc_lblUserStats.gridy = 2;
		contentPane.add(lblUserStats, gbc_lblUserStats);
		
		//ScrollPane for tablePlayerStats table
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 3;
		contentPane.add(scrollPane, gbc_scrollPane);
	
		//Columns for the GameProgesstable
		String colNames[] = {"Name","Players","Status","Time Left","Map Size"};
		
		//Columns for tablePlayerStats
		String playerStatsColNames[] = {"Stat Category","Value"};
		
		//test data for GameProgress table
		Object[][] data = {
				{"game1", new Integer(10), "in-progress", new Integer(900), new Integer(1000)},
				{"game2", new Integer(10), "in-progress", new Integer(900), new Integer(1000)},
				{"game3", new Integer(10), "in-progress", new Integer(900), new Integer(1000)},
				{"game4", new Integer(9), "waiting on player", new Integer(900), new Integer(1000)},
				
		};
		
		//test data for the Player Status 
		Object[][] playerStatsData = {
				{"Name", "Harry"},
				{"Wins", new Integer(3)},
				{"Losses", new Integer(4)},
				{"W/L Ratio", new Double(0.75)},
				{"Time Down", new Integer(5000)},
				{"Time Up", new Integer(10000)},
				{"U/D Ratio", new Double(2)},
				{"Last Game", "Game1"},
		};
		
		//make table for tablePlayer Stats
		tablePlayerStats = new JTable(playerStatsData,playerStatsColNames);
		tablePlayerStats.setFont(new Font("Helvetica", Font.PLAIN, 12));
		tablePlayerStats.setBackground(Color.LIGHT_GRAY);
		tablePlayerStats.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tablePlayerStats.setFillsViewportHeight(true);
		scrollPane.setViewportView(tablePlayerStats);
	    
		//ScrollPane for tableGameProgress
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 5;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 4;
		gbc_scrollPane_1.gridy = 3;
		contentPane.add(scrollPane_1, gbc_scrollPane_1);
		
		//make table for Game Progress 
		tableGameProgress = new JTable(data, colNames);
		tableGameProgress.setFont(new Font("Helvetica", Font.PLAIN, 12));
		tableGameProgress.setBackground(Color.LIGHT_GRAY);
		scrollPane_1.setViewportView(tableGameProgress);
		tableGameProgress.setFillsViewportHeight(true);
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		//Buttons 
		GridBagConstraints gbc_btnNewGame = new GridBagConstraints();
		gbc_btnNewGame.anchor = GridBagConstraints.WEST;
		gbc_btnNewGame.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewGame.gridx = 4;
		gbc_btnNewGame.gridy = 4;
		contentPane.add(btnNewGame, gbc_btnNewGame);
		
		JButton btnJoinGame = new JButton("Join Game");
		GridBagConstraints gbc_btnJoinGame = new GridBagConstraints();
		gbc_btnJoinGame.anchor = GridBagConstraints.WEST;
		gbc_btnJoinGame.insets = new Insets(0, 0, 5, 5);
		gbc_btnJoinGame.gridx = 5;
		gbc_btnJoinGame.gridy = 4;
		contentPane.add(btnJoinGame, gbc_btnJoinGame);
		
		JButton btnViewGameDetails = new JButton("View Game Details");
		GridBagConstraints gbc_btnViewGameDetails = new GridBagConstraints();
		gbc_btnViewGameDetails.anchor = GridBagConstraints.WEST;
		gbc_btnViewGameDetails.insets = new Insets(0, 0, 5, 5);
		gbc_btnViewGameDetails.gridx = 6;
		gbc_btnViewGameDetails.gridy = 4;
		contentPane.add(btnViewGameDetails, gbc_btnViewGameDetails);
		
		JButton btnRefreshList = new JButton("Refresh List");
		btnRefreshList.setFont(new Font("Helvetica", Font.PLAIN, 13));
		GridBagConstraints gbc_btnRefreshList = new GridBagConstraints();
		gbc_btnRefreshList.insets = new Insets(0, 0, 5, 5);
		gbc_btnRefreshList.gridx = 7;
		gbc_btnRefreshList.gridy = 4;
		contentPane.add(btnRefreshList, gbc_btnRefreshList);
	//Actions
		
		//Exit button in menu closes the entire program.
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	
	}
}
