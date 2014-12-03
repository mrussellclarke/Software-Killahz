//package hip;

public class RA extends Student{
	private static String name;
	private static Dorm dorm;		//Name of dorm director is assigned to.  MUST BE SPECIFIED (errors)
	//changed variable d from int to Dorm
	RA(Dorm d, String n){
		setName(n);
		setDorm(d);
	}
	
	public void setName(String n){
		name = n;
	}
	//changed variable d from int to Dorm
	public void setDorm(Dorm d){
		dorm = d;
	}
	
	public String getName(){
		return name;
	}
	// changed return type from int to Dorm
	public Dorm getDorm(){
		return dorm;
	}
	// changed return type from String[] to Student[]
	public Student[] viewRoster(Dorm dorm){
		return dorm.getRoster();			//Need access to function getRoster()
	}

	// changed variable dorm from int to Dorm
	public String[] viewOccupancy(Dorm dorm){
		return dorm.getOccupancy(); // Need to add function
	}
	
}
