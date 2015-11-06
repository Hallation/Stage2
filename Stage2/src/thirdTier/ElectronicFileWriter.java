 package thirdTier;

import java.io.*;
import secondTier.*;
// TODO: Auto-generated Javadoc

/**
 * The Class ElectronicFileWriter.
 */
public class ElectronicFileWriter{
	
	/**
	 * Save file.
	 *
	 * @param fileName the file name
	 * @param list the list
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void saveFile (String fileName, DataStorage list) throws IOException {
		ObjectOutputStream objOut = new ObjectOutputStream (new FileOutputStream (fileName));
		objOut.writeObject (list.getArrayList());
		objOut.close();
	}
}

