
public class Student_Temp {
	boolean valid;
	String ID;
	
	Student_Temp(String idNumber) {
		ID = idNumber;
		if(isValidated() == true) {
			
		}
	}
	
	public boolean isValidated() {
		return valid;
	}
}