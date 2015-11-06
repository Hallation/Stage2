package firstTier;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;

import secondTier.*;
public class UserInterface {
	Scanner input = new Scanner (System.in);
	
	public void begin(){
		Scanner input = new Scanner (System.in);
		// create the Person ArrayList object
		DataStorage Electronics = new DataStorage();
		// display menu and process Employee & Student data
		boolean finished = false, fileSaved = true;
		String fileName = "data.obj"; // assuming a file name
		
		try {
			ElectronicWorker pw = new ElectronicWorker ();
			Electronics.addAll (pw.openFile (fileName));
		
		}
		catch (FileNotFoundException fnfe)
		{
				JOptionPane.showMessageDialog (null, fnfe, "ERROR",  JOptionPane.ERROR_MESSAGE);
		}
		catch (IOException io) 
		{
			JOptionPane.showMessageDialog (null, io, "ERROR",  JOptionPane.ERROR_MESSAGE);
			finished = true; // stops the while loop - ERROR stop
		}
		catch (ClassNotFoundException cnfe) 
		{
			JOptionPane.showMessageDialog (null, cnfe, "ERROR",  JOptionPane.ERROR_MESSAGE);
			finished = true; // stops the while loop - ERROR stop
		}
		if (finished)
		{
			JOptionPane.showMessageDialog (null, "\n*** Fatal ERROR - Program Ended ***\n" +
					"\n*** Please contact you computer services centre ***\n", "ERROR",  JOptionPane.ERROR_MESSAGE);
		}

		while (!finished) {
			String selection = showMenu (input);
			switch (selection) {
				case "Add new smartphone": Electronics.add (addSmartphone ());
							fileSaved = false;
							break;
				case "Add new Television": Electronics.add (addTelevision ());
							fileSaved = false;
							break;
				case "Display all details": System.out.println ("\nDisplaying the electronic information ...\n");
							for (int i = 0; i < Electronics.size(); i++) {
								// When displaying the contents of an object using print() or println()
								// Java automatically looks for a toString() method, and, if available
								// uses it to display the object contents.
								// Polymorphism ensures that the correct data is displayed for each
								// Employee or Student.
								System.out.print (Electronics.get(i)); // equivalent to p.get(i).toString()
								System.out.println ("---------------------------------");
							}
							break;
				case "Save all data to file": try {
								fileSaved = saveFile (fileName, Electronics);
							}
							catch (IOException ioe) {
								JOptionPane.showMessageDialog (null, "**** ERROR: Data cannot be saved ****\n" +
										"*** Fatal ERROR Program Ended ***\n" +
										"*** Please contact you computer services centre ***",
										"FATAL ERROR", JOptionPane.ERROR_MESSAGE);
								finished = true; // stops the while loop - ERROR stop
							}
				  			break;
				default: JOptionPane.showMessageDialog(null, "\n** Invalid Selection** \n", "ERROR", JOptionPane.ERROR_MESSAGE);
			} // end switch
		} // end while loop
	} // end begin()

	public String showMenu (Scanner input) {
		String[] selections = new String[4];
		selections[0] = "Add new smartphone";
		selections[1] = "Add new Television";
		selections[2] = "Display all details";
		selections[3] = "Save all data to file";
		
		String selection = (String) JOptionPane.showInputDialog(null, "make a selection", "select here", JOptionPane.OK_OPTION, null, selections, selections[0]);
		JOptionPane.showMessageDialog(null, selection);			
		return selection;
	} // end showMenu()

	public Smartphone addSmartphone () {
		Smartphone sp = new Smartphone ();
		
		System.out.println("What brand is the Smartphone?");
		String bName = input.nextLine().trim();
		sp.setBrandName(bName);
		System.out.println("What is the model number of " + bName + "?");
		String mNumber = input.nextLine().trim();
		sp.setModelNumber(mNumber);
		System.out.println("What is the price of " + bName + " " + mNumber);
		int price = input.nextInt();
		sp.setprice(price);
		System.out.println("How much of " + mNumber + " is left?");
		int stock = input.nextInt();
		sp.setstock(stock);
		input.nextLine();
		
		System.out.println("What model is the Smartphone?");
		String mNa = input.nextLine().trim();
		sp.setModelName(mNa);
		System.out.println("Which operating system is it running?");
		String OS = input.nextLine().trim();
		sp.setOperatingSystem(OS);
		System.out.println("Which year was the " + mNa + " released?");
		String YoR = input.nextLine().trim();
		sp.setYearOfRelease(YoR);

		return sp;
	}//end addSmartphone()
	
	
	
	
	public Television addTelevision ()
	{
		Television t = new Television();
		System.out.println("What brand is the Television?");
		String bName = input.nextLine().trim();
		t.setBrandName(bName);
		System.out.println("What is the model number of " + bName + "?");
		String mNumber = input.nextLine().trim();
		t.setModelNumber(mNumber);
		System.out.println("What is the price of " + bName + mNumber);
		int price = input.nextInt();
		t.setprice(price);
		System.out.println("How much of " + mNumber + " is left?");
		int stock = input.nextInt();
		t.setstock(stock);
		input.nextLine();
		System.out.println ("What is the screen size of " + mNumber);
		String sS = input.nextLine().trim();
		t.setScreenSize(sS);

		String Res = null;
			do {System.out.print ("What is the TV's resolution?"); 
				Res = input.nextLine().trim();
				if (!Res.equals ("1080p") && !Res.equals("720p") && !Res.equals("4K")){
					System.out.println ("Error, Screen resolution must either be 720p, 1080p or 4K");
				}
			} while (!Res.equals ("1080p") && !Res.equals("720p") && !Res.equals("4K"));
			t.setResolution(Res);
		String sType = null;
			do { System.out.print ("What is the screen type?");
				sType = input.nextLine().trim();
				if (!sType.equals("LCD") && !sType.equals("LED") && !sType.equals ("Plasma")) { 
					System.out.println ("Error, Screen type must either be LCD, LED or Plasma");
				}
			}while (!sType.equals("LCD") && !sType.equals("LED") && !sType.equals ("Plasma"));
			t.setScreenType(sType);
		return t;
	} // end addTelevision()

	public boolean saveFile (String fileName, DataStorage list) throws IOException 
	{
		ElectronicWorker ew = new ElectronicWorker();
		ew.saveFile (fileName, list); // assuming file name
		System.out.println ("\n** Data Successfully Saved **\n");
		return true;
	}
} // end UserInterface class
