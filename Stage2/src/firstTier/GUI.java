package firstTier;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import secondTier.DataStorage;
import secondTier.Electronics;
import secondTier.Smartphone;
import secondTier.Television;
import secondTier.ElectronicWorker;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.io.*;
// TODO: Auto-generated Javadoc
/**
 * The Class GUI.
 */
public class GUI {

	/** The frame. */
	private JFrame frame;
	boolean finished = false;
	boolean fileSaved = true;
	String objFile = "data.obj";
	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//create Electronics arraylist
		final DataStorage Electronics = new DataStorage();
		 //assuming file names
		//open file before anything else starts.
		try {
			ElectronicWorker ew = new ElectronicWorker ();
			Electronics.addAll (ew.openFile (objFile));
			JOptionPane.showMessageDialog (null, "\n** File successfully opened **\n", "Success",  JOptionPane.PLAIN_MESSAGE);
		}
		catch (FileNotFoundException fnfe) {
			JOptionPane.showMessageDialog (null, "\n**** ERROR: Cannot find the data file ****\n", "ERROR",  JOptionPane.ERROR_MESSAGE);
		}
		catch (IOException io) {
			JOptionPane.showMessageDialog (null, "\n*** ERROR: Cannot perform I/O operation ***\n", "ERROR",  JOptionPane.ERROR_MESSAGE);
			finished = true; // stops the while loop - ERROR stop
		}
		catch (ClassNotFoundException cnfe) {
			JOptionPane.showMessageDialog (null, "\n** ERROR: Cannot read file correctly **\n", "ERROR",  JOptionPane.ERROR_MESSAGE);
			finished = true; // stops the while loop - ERROR stop
		}
		if (finished) {
			JOptionPane.showMessageDialog (null, "\n*** Fatal ERROR - Program Ended ***\n" +
					"\n*** Please contact you computer services centre ***\n", "ERROR",  JOptionPane.ERROR_MESSAGE);
		}
		
		//creating the GUI and adding its elements
		frame = new JFrame();
		frame.setBounds(100, 100, 295, 175);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//combobox used for selections
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(40, 36, 183, 27);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Add new Smartphone");
		comboBox.addItem("Add new Television");
		comboBox.addItem("Display all Details");
		comboBox.addItem("Save all data to file");
		
		//select button
		JButton selectButton = new JButton("Select");
		int selection = 0;
		//event listener waiting for the select button to be selected
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int selection = comboBox.getSelectedIndex();
				
					switch (selection) { 
					//adding new Smartphone
					case 0 : Electronics.add(addSmartphone ());
					fileSaved = false;
					break;
					//adding new Television
					case 1 : Electronics.add(addTelevision ());
					fileSaved = false;
					break;
					//displaying all details
					case 2 : JOptionPane.showMessageDialog (null, "Displaying the electronics information ...", "Electronics List", JOptionPane.PLAIN_MESSAGE);
					for (int i = 0; i < Electronics.size(); i++) {
						// When displaying the contents of an object using print() or println()
						// Java automatically looks for a toString() method, and, if available
						// uses it to display the object contents.
						// Polymorphism ensures that the correct data is displayed for each
						// Employee or Student.
						JOptionPane.showMessageDialog (null, Electronics.get(i), "Person Details", JOptionPane.PLAIN_MESSAGE);
					}
					break;
					//saving to data.obj
					case 3 : try {
						fileSaved = saveFile (objFile, Electronics);
					}
					catch (IOException ioe) {
						JOptionPane.showMessageDialog (null, "**** ERROR: Data cannot be saved ****\n" +
								"*** Fatal ERROR Program Ended ***\n" +
								"*** Please contact you computer services centre ***",
								"FATAL ERROR", JOptionPane.ERROR_MESSAGE);
						// stops the while loop - ERROR stop
					}
		  			break;
					
					
					} 
				}
				
				
			}
		);
		
		
		//setting the button(s) locations
		selectButton.setBounds(10, 95, 117, 29);
		frame.getContentPane().add(selectButton);
		
		
		//event listening for close to be pressed for program to close
		JButton closeButton = new JButton("Close");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		closeButton.setBounds(137, 95, 117, 29);
		frame.getContentPane().add(closeButton);
		//labels not named since not actually needed.
		JLabel headerLabel = new JLabel("Please make a selection and press select");
		headerLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		headerLabel.setBounds(10, 11, 200, 14);
		frame.getContentPane().add(headerLabel);
		
		}

	
	
	
	/**
	 * Adds the smartphone.
	 *
	 * @return the smartphone
	 */
	public Smartphone addSmartphone () {
		Smartphone sp = new Smartphone ();
		
		
		String bName = (JOptionPane.showInputDialog(null, "What is the Smartphone brand name? ")).trim();
		while (bName.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept blank entries! \nPlease try again.");
			bName = JOptionPane.showInputDialog("What is its model name ");
		}
		sp.setBrandName(bName);
		
		String mNumber = (JOptionPane.showInputDialog(null, "What is it's model number ")).trim();
		while (mNumber.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept blank entries! \nPlease try again.");
			mNumber = JOptionPane.showInputDialog("What is its model name ");
		}
		sp.setModelNumber(mNumber);
		
	
		try 
		{
		String tprice = JOptionPane.showInputDialog(null, "How much does it cost? ").trim();
		while (tprice.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept blank entries! \nPlease try again.");
			tprice = JOptionPane.showInputDialog("How much does it cost? ");
		}
		double price = Double.parseDouble(tprice);
		sp.setprice(price);
		}
		catch (NumberFormatException nfe)
		{
			JOptionPane.showMessageDialog(null, "\n*** ERROR NUMBER NOT ENTERED*** \n \nPlease reenter \n");
			double price = Double.parseDouble((JOptionPane.showInputDialog(null, "How much does it cost? ")).trim());
			sp.setprice(price);
		}
		
		try 
		{				
		String tStock = JOptionPane.showInputDialog(null, "How much stock is left ").trim();
		while (tStock.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept blank entries! \nPlease try again.");
			tStock = JOptionPane.showInputDialog("How much does it cost? ");
		}
		int stock = Integer.parseInt(tStock);
		sp.setstock(stock);
		}
		catch (NumberFormatException nfe) 
		{
			JOptionPane.showMessageDialog(null, "\n*** ERROR NUMBER NOT ENTERED*** \n \nPlease reenter \n");
			int stock = Integer.parseInt((JOptionPane.showInputDialog(null, "How much stock is left ")).trim());
			sp.setstock(stock);
		}
					
		String mNa = (JOptionPane.showInputDialog(null, "What is its model name ")).trim();
		while (mNa.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept blank entries! \nPlease try again.");
			mNa = JOptionPane.showInputDialog("What is its model name ");
		}
		sp.setModelName(mNa);
		
		String OS = (JOptionPane.showInputDialog(null, "Which operating system is it running ")).trim();
		while (OS.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept blank entries! \nPlease try again.");
			OS = JOptionPane.showInputDialog("Which operating system is it running ");
		}
		sp.setOperatingSystem(OS);
		
		String YoR = (JOptionPane.showInputDialog(null, "What year was the smartphone released ")).trim();
		while (YoR.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept blank entries! \nPlease try again.");
			YoR = JOptionPane.showInputDialog("What year was the smartphone released ");
		}
		sp.setYearOfRelease(YoR);

		return sp;
	}//end addSmartphone()
	
	/**
	 * Adds the television.
	 *
	 * @return the television
	 */
	public Television addTelevision ()
	{
		Television t = new Television();
		
		String bName = (JOptionPane.showInputDialog(null, "What is the Television brand name? ")).trim();
		while (bName.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept blank entries!");
			bName = JOptionPane.showInputDialog("What is its model name ");
		}
		t.setBrandName(bName);
		try{
		String mNumber = (JOptionPane.showInputDialog(null, "What is the Television brand name? ")).trim();
		while (mNumber.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept blank entries!");
			mNumber = JOptionPane.showInputDialog("What is its model name ");
		}
		t.setModelNumber(mNumber);
		
		
		//price related
		String tPrice = JOptionPane.showInputDialog(null, "Price ").trim();
		while (tPrice.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept balnk entries!");
		}
		JOptionPane.showMessageDialog(null, tPrice);
		double price = Double.parseDouble(tPrice);
		t.setprice(price);
		}catch (NumberFormatException nfe) 
			{
				JOptionPane.showMessageDialog(null, "\n*** ERROR NUMBER NOT ENTERED*** \n \nPlease reenter \n");
				int stock = Integer.parseInt((JOptionPane.showInputDialog(null, "How much stock is left ")).trim());
				t.setstock(stock);
			}
		//stock related
		try {
		String tStock = JOptionPane.showInputDialog(null, "How much stock is left ").trim();//existence validation
		while (tStock.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept blank entries!");
			tStock = JOptionPane.showInputDialog("How much stock is left ");
		}
		int stock = Integer.parseInt(tStock);
		t.setstock(stock);
		}
		catch (NumberFormatException nfe) //data type validation
			{
				JOptionPane.showMessageDialog(null, "\n*** ERROR NUMBER NOT ENTERED*** \n \nPlease reenter \n");
				int stock = Integer.parseInt((JOptionPane.showInputDialog(null, "How much stock is left ")).trim());
				t.setstock(stock);
			}

		String sS = (JOptionPane.showInputDialog(null, "What is the TV's Screen size")).trim();
		while (sS.equals("")){
			JOptionPane.showMessageDialog(null, "Cannot accept blank entries!");
			sS = JOptionPane.showInputDialog("What is its model name ");
		}
		t.setScreenSize(sS);

		String Res = null;
			do { 
				Res = (JOptionPane.showInputDialog(null, "What is the Smartphone brand name? ")).trim();
				while (Res.equals("")){
					JOptionPane.showMessageDialog(null, "Cannot accept blank entries!");
					Res = JOptionPane.showInputDialog("What is its model name ");
				}
				if (!Res.equals ("1080p") && !Res.equals("720p") && !Res.equals("4K")){
					JOptionPane.showMessageDialog (frame, "Error, Screen resolution must either be 720p, 1080p or 4K");
				}
			} while (!Res.equals ("1080p") && !Res.equals("720p") && !Res.equals("4K"));
			t.setResolution(Res);
		String sType = null;
			do { System.out.print ("What is the screen type?");
				sType = (JOptionPane.showInputDialog(null, "What is the Smartphone brand name? ")).trim();
				while (Res.equals("")){
					JOptionPane.showMessageDialog(null, "Cannot accept blank entries!");
					Res = JOptionPane.showInputDialog("What is its model name ");
				}
				if (!sType.equals("LCD") && !sType.equals("LED") && !sType.equals ("Plasma")) { 
					System.out.println ("Error, Screen type must either be LCD, LED or Plasma");
				}
			}while (!sType.equals("LCD") && !sType.equals("LED") && !sType.equals ("Plasma"));
			t.setScreenType(sType);
		return t;
	} // end addTelevision()
	
	public boolean saveFile (String fileName, DataStorage list) throws IOException {
		ElectronicWorker pw = new ElectronicWorker ();
		pw.saveFile (fileName, list); // assuming file name
		JOptionPane.showMessageDialog (null, "\n** Data Successfully Saved **\n");
		return true;
	}
}
