package hip;

public class Dorm {
	
	public enum RoomType{STD_SINGLE, LRG_SINGLE, STD_DOUBLE, LRG_DOUBLE, STD_TRIPLE, LRG_TRIPLE, EFFICIENCY};

	public class Room {
		RoomType roomtype;
		//public String RoomType; // = {"STD_SINGLE", "LRG_SINGLE", "STD_DOUBLE", "LRG_DOUBLE", "STD_TRIPLE", "LRG_TRIPLE", "EFFICIENCY"};
		public Boolean livable;   //holds current state of particular room's livability status 
		public double price;  //semester cost of living for room 
		public int num;  //indicates room number 
	/*	public void setRoomType(){
		} DATABASE*/
 
		public void setCost(Room r){
			switch(roomtype) {
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
		public void setLivability(Boolean l){
			livable = l; 
		} 
		public double getCost(RoomType r){
			return price; 
		} 
		public Boolean isLivable(){
			return livable; 
		} 
		public int getNum(){
			return num; 
		} 
			
	}
	
	private String name; //name of the dorm
	//private Student resident;  //needs to be defined 
	private Student[] roster; //array holding the names of residents in the dorm (should be as type Student)
	private int roomTotal; //number of total rooms in the dorm
	private int availRoom; //number of available rooms in the dorm
	
	Dorm(int r, String n){
		setRoomTotal(r);
		setAvailRooms(r*9/10); //sets available rooms at 90% of total rooms
				     	//leaving space for special circumstances 
		setName(n);
	}
	public void setName(String n){ //sets the name of the dorm eg Slowe Hall
		name = n;
	}
	
	public void setRoomTotal(int t){ //sets total rooms in the dorm 
		roomTotal = t;
		roster = new Student[t]; //should be student
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
	
	public Student getResident(int r){ //returns the info of the student living in the room
		return roster[r];
	}
}
