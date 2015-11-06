package secondTier;
import java.util.ArrayList;
// TODO: Auto-generated Javadoc

/**
 * The Class DataStorage.
 */
public class DataStorage {
	

	 	/** The d store. */
	 	// attribute
	 	ArrayList<Electronics> dStore;
	 	
	 	/**
	 	 * Instantiates a new data storage.
	 	 */
	 	// constructor
	 	public DataStorage () {
	 		dStore = new ArrayList<Electronics>();
	 	}
	 	
	 	/**
	 	 * Adds the all.
	 	 *
	 	 * @param aLP the a lp
	 	 */
	 	// methods
	 	public void addAll (ArrayList<Electronics> aLP) {
	 		dStore.addAll (aLP);
	 	}
	 	
	 	/**
	 	 * Adds the.
	 	 *
	 	 * @param e the e
	 	 */
	 	public void add (Electronics e) {
	 		if (e instanceof Smartphone) {
	 			dStore.add ((Smartphone) e);
	 		} else {
	 			dStore.add ((Television) e);
	 		}
	 	}
	 	
	 	/**
	 	 * Size.
	 	 *
	 	 * @return the int
	 	 */
	 	public int size () {
	 		return dStore.size();
	 	}
	 	
	 	/**
	 	 * Gets the.
	 	 *
	 	 * @param index the index
	 	 * @return the electronics
	 	 */
	 	public Electronics get (int index) {
	 		return dStore.get (index);
	 	}
	 	
	 	/**
	 	 * Gets the array list.
	 	 *
	 	 * @return the array list
	 	 */
	 	public ArrayList<Electronics> getArrayList() {
	 		return dStore;
	 	}
	 } // end class DataStorage


