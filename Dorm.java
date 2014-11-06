

public class Dorm {
	private static String name; //name of the dorm
	//private String resident;
	private static String[] roster; //array holding the names of residents in the dorm
	private static int roomTotal; //number of total rooms in the dorm
	private static int availRoom; //number of available rooms in the dorm
	
	Dorm(int r, String n){
		setRoomTotal(r);
		setAvailRooms(r*9/10); //sets available rooms at 90% of total rooms
		setName(n);
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setRoomTotal(int t){ //sets total rooms in the dorm. creates an array to hold that many items + 1 to have natural counting 
		roomTotal = t;
		roster = new String[t+1];
	}
	
	public void setAvailRooms(int a){
		availRoom = a;
	}
	
	public void setResident(String res, int room){ //adds resident
		if(availRoom>0){ //checks if rooms are available
			if(roster[room] == null){ //checks if that room is available
				roster[room] = res; //sets array value at room index to the student's name 
				availRoom--; //decrements avail room
			}
			else{
				System.out.println("The room is occupied");
			}
		}
		else{
			System.out.println("The dorm is full");
		}
	}

	public void setRoomVacant(int r){ //Set room occupant to null, increments availRoom by 1
		roster[r] = null;
		setAvailRooms(availRoom + 1);
	}

	public String getName(){
		return name;
	}

	public int getRoomTotal(){
		return roomTotal;
	}
	
	public int getAvailRooms(){
		return availRoom;
	}
	
	public String[] getRoster(){
		return roster;
	}

	public String getResident(int r){
		return roster[r];
	}

}
