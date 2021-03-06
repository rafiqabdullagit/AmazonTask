package config;


public class Constants {


	/*** Util variables for WebDriver wait***/
	public static final int DEFAULT_DURATION = 20; // seconds
	public static final int DEFAULT_INTERVAL = 2000; // milliseconds
	
	public static final String AmazonRepository = System.getProperty("user.dir")+"/src/test/resources/ObjectRepository/amazon.properties";

	/*** Docker hub url ***********/
	public static final String HUB_URL = "http://localhost:4444";

	/*** Data Provider variables for browserStack**/
	public static final Long BSTACK_IDLE_TIMEOUT = 120L; // default is 90 seconds
	public static final Long BSTACK_IDLE_AUTOWAIT = 20L; // milli Second

	public static final Long TIMEOUT = 80L;
	public static final Long POOLTIME = 2000L;
	public static final boolean isGridEnabled = false;
	
	public static final boolean isBrowserStackEnabled = false; 
	public static final boolean isEmailReport = true;

	
	//Path
	public static final String SCREENSHOT= "target//Screenshot";
	public static final String DATAFILE = System.getProperty("user.dir")+"//src//test//resources//dataRepository//Resource.xlsx";

	//All the Excel Related Values
	public static final String TESTCASES_SHEET = "TestCases";

	public static final String TCID_COL = "TCID";
	public static final String RESULTS_COL = "Result";
	public static final String ACTUALRESULTS_COL = "Actual Result";

	public static final String RUNMODE_COL = "RunMode";
	public static final String DESCRIPTION_COL = "Description";
	public static final String SENDFROM = null;
	public static final String SENDTO = null;
	public static final String EMAILPASSWORD = null;
	

}
