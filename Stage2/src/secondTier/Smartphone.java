package secondTier;

// TODO: Auto-generated Javadoc
/**
 * The Class Smartphone.
 */
public class Smartphone extends Electronics{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 100L;
	
	/** The Year of release. */
	private String modelName, OperatingSystem, YearOfRelease;
	
	/**
	 * Instantiates a new smartphone.
	 */
	public Smartphone (){
	super ();
	modelName = null;
	OperatingSystem = null;
	YearOfRelease = null;
	}
	
	/**
	 * Instantiates a new smartphone.
	 *
	 * @param bN the b n
	 * @param mNu the m nu
	 * @param pr the pr
	 * @param st the st
	 * @param mNa the m na
	 * @param OS the os
	 * @param YoR the yo r
	 */
	public Smartphone (String bN, String mNu, int pr, int st, String mNa, String OS, String YoR){
		super (bN, mNu, pr, st);
		modelName = mNa;
		OperatingSystem = OS;
		YearOfRelease = YoR;
	}
	
	/**
	 * Gets the model name.
	 *
	 * @return the model name
	 */
	public String getModelName(){
		return modelName;
	}
	
	/**
	 * Gets the operating system.
	 *
	 * @return the operating system
	 */
	public String getOperatingSystem(){
		return OperatingSystem;
	}
	
	/**
	 * Gets the year of release.
	 *
	 * @return the year of release
	 */
	public String getYearOfRelease(){
		return YearOfRelease;
	}
	
	/**
	 * Sets the model name.
	 *
	 * @param mNa the new model name
	 */
	public void setModelName (String mNa){
		modelName = mNa;
	}
	
	/**
	 * Sets the operating system.
	 *
	 * @param OS the new operating system
	 */
	public void setOperatingSystem (String OS){
		OperatingSystem = OS;
	}
	
	/**
	 * Sets the year of release.
	 *
	 * @param YoR the new year of release
	 */
	public void setYearOfRelease (String YoR){
		YearOfRelease = YoR;
	}
	
	/* (non-Javadoc)
	 * @see secondTier.Electronics#toString()
	 */
	public String toString(){
	return super.toString() + "\nSmartphone model Name: " + getModelName() + "\nPhone's Opearting System: " + getOperatingSystem() + 
			"\nYear of release: " + getYearOfRelease() + "\n";
	}
}

	
	