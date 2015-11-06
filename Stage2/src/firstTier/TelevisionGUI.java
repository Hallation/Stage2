package firstTier;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// TODO: Auto-generated Javadoc
/**
 * The Class TelevisionGUI.
 */
/*
A class to create a GUI using AWT & Swing.

*/
public class TelevisionGUI extends JFrame
							implements ActionListener {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 100L;
	
	/** The text field. */
	private JTextField textField;
	
	/** The text field_1. */
	private JTextField textField_1;
	
	/** The text field_2. */
	private JTextField textField_2;
	
	/** The text field_3. */
	private JTextField textField_3;
	
	/** The text field_4. */
	private JTextField textField_4;
	
	/** The text field_5. */
	private JTextField textField_5;
	
	/** The text field_6. */
	private JTextField textField_6;

	/**
	 * Instantiates a new television gui.
	 */
	public TelevisionGUI() {

		setTitle("Adding a smartphone");
		setSize(599, 411);
		setLocation(300, 300);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Brand");
		lblNewLabel.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblModelNumber = new JLabel("Model Number");
		lblModelNumber.setBounds(10, 92, 86, 14);
		getContentPane().add(lblModelNumber);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 117, 86, 20);
		getContentPane().add(textField_1);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(10, 174, 46, 14);
		getContentPane().add(lblPrice);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 199, 86, 20);
		getContentPane().add(textField_2);
		
		JLabel lblStockRemaining = new JLabel("Stock Remaining");
		lblStockRemaining.setBounds(10, 260, 86, 14);
		getContentPane().add(lblStockRemaining);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 285, 86, 20);
		getContentPane().add(textField_3);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(168, 11, 46, 14);
		getContentPane().add(lblModel);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(168, 36, 86, 20);
		getContentPane().add(textField_4);
		
		JLabel lblOperatingSystem = new JLabel("Operating System");
		lblOperatingSystem.setBounds(168, 92, 86, 14);
		getContentPane().add(lblOperatingSystem);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(168, 117, 86, 20);
		getContentPane().add(textField_5);
		
		JLabel lblYearOfRelease = new JLabel("Year Of Release");
		lblYearOfRelease.setBounds(168, 174, 86, 14);
		getContentPane().add(lblYearOfRelease);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(168, 199, 86, 20);
		getContentPane().add(textField_6);

		addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);

	}

		// we often include a main() method in a class
		// to enabling testing before it is added to the
		// rest of the program

	/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}