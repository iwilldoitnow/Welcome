package gui.main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

/*Steganography;
 The application is hiding a text entered by the user in the .bmp picture
   PROJECT IMPORTS */
import gui.actions.ButtonActions;
import gui.custom.controls.ImagePanel;
import utils.image.ImageIntArray;
import utils.logging.LoggerWrapper;

import javax.swing.JTextArea;
import java.awt.Font;

public class Steganography {

	private JFrame frame;
	private JTextField txtSteganografia;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmView;
	private JMenu mnEdit;
	private JButton btnOpen;
	private JButton btnSave;
	private JButton btnNev;
	private ImagePanel panel;

	// image to write the message into
	private BufferedImage victimImage;
	private ImageIntArray imgIntArray;
	
	// logger
	private LoggerWrapper lw = LoggerWrapper.getInstance();
	private JButton btnReadMessage;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Steganography window = new Steganography();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Steganography() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		txtSteganografia = new JTextField();
		txtSteganografia.setBackground(Color.BLACK);
		txtSteganografia.setEnabled(false);
		txtSteganografia.setEditable(false);
		txtSteganografia.setForeground(Color.WHITE);
		txtSteganografia.setHorizontalAlignment(SwingConstants.CENTER);
		txtSteganografia.setText("Hide your information in a graphic file");
		frame.getContentPane().add(txtSteganografia, BorderLayout.NORTH);
		txtSteganografia.setColumns(10);

		/*
		 * Main ImagePanel
		 */
		panel = new ImagePanel();
		panel.setBackground(Color.LIGHT_GRAY);

		/*
		 * Main menu
		 */
		menuBar = new JMenuBar();
		menuBar.setToolTipText("File\r\nExit");
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 546, 770, 129);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setVisible(false);
		scrollPane.setVisible(false);
		
		JButton btnSaveMessage = new JButton("Save message");
		btnSaveMessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSaveMessage.setBounds(806, 547, 114, 23);
		btnSaveMessage.setVisible(false);
		panel.add(btnSaveMessage);
		
		btnReadMessage = new JButton("Read message");
		btnReadMessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnReadMessage.setBounds(806, 652, 114, 23);
		btnReadMessage.setVisible(false);
		panel.add(btnReadMessage);
		
		frame.setJMenuBar(menuBar);

		// File submenu
		mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		btnOpen = new JButton("Open");
		mnNewMenu.add(btnOpen);
		btnSave = new JButton("Save");
		mnNewMenu.add(btnSave);
		btnNev = new JButton("New");
		mnNewMenu.add(btnNev);

		// Edit submenu
		mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		// View submenu
		mntmView = new JMenuItem("View");
		menuBar.add(mntmView);

		/*
		 * BUTTON ActionListeners
		 */
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lw.logger.info("Button Open pressed");
				File chosenFile = ButtonActions.openGraphicFile();
				panel.setImage(chosenFile);
				try {
					victimImage = ImageIO.read(chosenFile);
				} catch (IOException e) {
					e.printStackTrace();
				}
				imgIntArray = new ImageIntArray(victimImage);
				textArea.setVisible(true);
				btnSaveMessage.setVisible(true);
				btnReadMessage.setVisible(true);
				scrollPane.setVisible(true);
			}
		});
		
		btnSaveMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lw.logger.info("Save message pressed");
				imgIntArray.computeImageIntArray();
				lw.logger.info("IntegerArray has been calculated");
				lw.logger.info(imgIntArray.getPixelsArrayStr());
				// save the message in the image
				imgIntArray.saveMessageInImage(textArea.getText());
				
			}
		});
		
		btnReadMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lw.logger.info("Read message pressed");
			}
		});
	}
}
