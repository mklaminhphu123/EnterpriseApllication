package controller;

public class Utility {
	public static final String LEAD_FILE = "D:\\Eclipse Workspace\\EnterpriseApplication\\TestData\\leads.csv";
	public static final String DATE_FORMAT = "yyyy-mm-dd";
	public static String generateID(int size) {
		return "lead_" + String.format("%03d", size+1);
		
	}
}
