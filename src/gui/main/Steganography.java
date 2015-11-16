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
import utils.ImageIntArray;

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
				File chosenFile = ButtonActions.openGraphicFile();
				panel.setImage(chosenFile);
				try {
					victimImage = ImageIO.read(chosenFile);
				} catch (IOException e) {
					e.printStackTrace();
				}
				ImageIntArray imgIntArray = new ImageIntArray(victimImage);
				imgIntArray.computeImageIntArray();
				imgIntArray.printPixelsArray();
			}
		});
	}

}
