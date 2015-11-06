 package thirdTier;

import java.util.ArrayList;
import java.io.*;

import secondTier.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ElectronicFileReader.
 */
public class ElectronicFileReader{
	
	/**
	 * Open file.
	 *
	 * @param fileName the file name
	 * @return the array list
	 * @throws ClassNotFoundException the class not found exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Electronics> openFile (String fileName) throws ClassNotFoundException, IOException, FileNotFoundException {

		ObjectInputStream objIn = new ObjectInputStream (new FileInputStream (fileName));
		ArrayList<Electronics> list = new ArrayList<>();
		list = (ArrayList<Electronics>) objIn.readObject(); // we know it's an ArrayList<Person>!!
		objIn.close ();

		return list;
	}
}
