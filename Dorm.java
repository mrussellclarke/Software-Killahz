package hip;

public class Dorm {

	public class Room {
		public enum RoomType{STD_SINGLE, LRG_SINGLE, STD_DOUBLE, LRG_DOUBLE, STD_TRIPLE, LRG_TRIPLE, EFFICIENCY} 
		public static Boolean livable;   //holds current state of particular room's livability status 
		public static double price;  //semester cost of living for room 
		public static int num;  //indicates room number 
	/*	public void setRoomType(){
		} DATABASE*/
 
		public void setCost(Dorm d){
			switch(d.RoomType) {
				case STD_SINGLE:
					price=4593; 
					break; 
				case LRG_SINGLE: 
					price=4020; 
					break; 
				case STD_DOUBLE:
					price=3902.83;
					break;  
				case LRG_DOUBLE:	
					price=4029.34;
					break;  
				case STD_TRIPLE:
					price=3928.09;
					break;  
				case LRG_TRIPLE:
					price=4000.32;
					break;  
				case EFFICIENCY:
					price=3709.92; 
					break; 
				default: 
					System.out.println("Error: Invalid Room Type."); 
			} 
				
		} 
		public void setLivability(bool l){
			livable = l; 
		} 
		public float getCost(RoomType r){
			return price; 
		} 
		public Boolean isLivable(){
			return livable; 
		} 
		public int getNum(){
			return num; 
		} 
			
	}
	private static String name; //name of the dorm
	private Student resident;   //student type    //needs to be defined 
	private static Student[] roster; //array holding the names of residents in the dorm
	private static int roomTotal; //number of total rooms in the dorm
	private static int availRoom; //number of available rooms in the dorm
	
	Dorm(int r, String n){
		setRoomTotal(r);
		setAvailRooms(r*9/10); //sets available rooms at 90% of total rooms
				     	//leaving space for special circumstances 
		setName(n);
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setRoomTotal(int t){ //sets total rooms in the dorm 
		roomTotal = t;
		roster = new Student[t];
	}
	
	public void setAvailRooms(int a){
		availRoom = a;
	}
	
	public void setResident(Student res, Room room){ //adds resident
		if(availRoom>0){ //checks if rooms are availabl
			if(roster[room.getNum()] == null){ //checks if that room is available
				roster[room.getNum()] = res; //sets array value at room index to the student's name 
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
		availRoom++;
	}

	public String getName(){  //returns name of dorm 
		return name;
	}

	public int getRoomTotal(){
		return roomTotal;
	}
	
	public int getAvailRooms(){
		return availRoom;
	}
	
	public Student[] getRoster(){
		return roster;
	}

	public Student getResident(int r){
		return roster[r];
	}
}
