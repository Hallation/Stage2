
package secondTier;

import java.util.ArrayList;
import java.io.*;

import thirdTier.*;


// TODO: Auto-generated Javadoc
/**
 * The Class ElectronicWorker.
 */
public class ElectronicWorker {

 	/**
	  * Open file.
	  *
	  * @param fileName the file name
	  * @return the array list
	  * @throws ClassNotFoundException the class not found exception
	  * @throws IOException Signals that an I/O exception has occurred.
	  * @throws FileNotFoundException the file not found exception
	  */
	 public ArrayList<Electronics> openFile (String fileName) throws ClassNotFoundException, IOException, FileNotFoundException {	 	
 		ElectronicFileReader efr = new ElectronicFileReader ();
	 	ArrayList<Electronics> list = efr.openFile (fileName);
		return list;
	 }

	 /**
 	 * Save file.
 	 *
 	 * @param fileName the file name
 	 * @param list the list
 	 * @throws IOException Signals that an I/O exception has occurred.
 	 */
 	public void saveFile (String fileName, DataStorage list) throws IOException {
		ElectronicFileWriter efw = new ElectronicFileWriter ();
 		efw.saveFile (fileName, list);
 		}
	 }


