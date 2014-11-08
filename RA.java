package hip;

public class RA extends Student{
	private static String name;
	private static Dorm dorm;		//Name of dorm director is assigned to.  MUST BE SPECIFIED (errors)
	 
	RA(int d, String n){
		setName(n);
		setDorm(d);
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setDorm(int d){
		dorm = d;
	}
	
	public String getName(){
		return name;
	}
	
	public int getDorm(){
		return dorm;
	}
	
	public String[] viewRoster(int dorm){
		return dorm.getRoster();			//Need access to function getRoster()
	}

	/*
	public void viewOccupancy(int dorm){
		System.out.println();
	}
	*/
}
