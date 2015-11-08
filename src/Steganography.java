//Steganography;
/* The application is hiding in the picture .bnp text entered by the user. */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.DropMode;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

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
		
		menuBar = new JMenuBar();
		menuBar.setToolTipText("File\r\nExit");
		frame.setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		btnOpen = new JButton("Open");
		mnNewMenu.add(btnOpen);
		
		btnSave = new JButton("Save");
		mnNewMenu.add(btnSave);
		
		btnNev = new JButton("New");
		mnNewMenu.add(btnNev);
		
		mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		mntmView = new JMenuItem("View");
		menuBar.add(mntmView);
	}

}
