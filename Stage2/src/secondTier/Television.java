package secondTier;

// TODO: Auto-generated Javadoc
/**
 * The Class Television.
 */
public class Television extends Electronics{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 100L;
	
	/** The Screen type. */
	private String ScreenSize, Resolution, ScreenType;
	
	/**
	 * Instantiates a new television.
	 */
	public Television () {
		super ();
		ScreenSize = null;
		Resolution = null;
		ScreenType = null;
	}
	
	/**
	 * Instantiates a new television.
	 *
	 * @param bN the b n
	 * @param mNu the m nu
	 * @param pr the pr
	 * @param st the st
	 * @param sS the s s
	 * @param Res the res
	 * @param sType the s type
	 */
	public Television (String bN, String mNu, int pr, int st, String sS, String Res, String sType){
		super (bN, mNu, pr, st);
		ScreenSize = sS;
		Resolution = Res;
		ScreenType = sType;
	}
	
	/**
	 * Gets the screen size.
	 *
	 * @return the screen size
	 */
	public String getScreenSize(){
		return ScreenSize;
	}
	
	/**
	 * Gets the resolution.
	 *
	 * @return the resolution
	 */
	public String getResolution(){
		return Resolution;
	}
	
	/**
	 * Gets the screen type.
	 *
	 * @return the screen type
	 */
	public String getScreenType(){
		return ScreenType;
	}
	
	/**
	 * Sets the screen size.
	 *
	 * @param sS the new screen size
	 */
	public void setScreenSize(String sS){
		ScreenSize = sS;
	}
	
	/**
	 * Sets the resolution.
	 *
	 * @param Res the new resolution
	 */
	public void setResolution(String Res){
		Resolution = Res;
	}
	
	/**
	 * Sets the screen type.
	 *
	 * @param sType the new screen type
	 */
	public void setScreenType(String sType){
		ScreenType = sType;
	}

	/* (non-Javadoc)
	 * @see secondTier.Electronics#toString()
	 */
	public String toString(){
	return super.toString() + "\nTelevison's Screen size: " + ScreenSize + "\nTelevision's Resolution: " + getResolution() + 
			"\nTelevision's Screen Type: " + getScreenType();
	}
}



	
