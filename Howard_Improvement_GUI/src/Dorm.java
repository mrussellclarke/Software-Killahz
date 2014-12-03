//package hip;

public class Dorm {
	
	public enum RoomType{STD_SINGLE, LRG_SINGLE, STD_DOUBLE, LRG_DOUBLE, STD_TRIPLE, LRG_TRIPLE, EFFICIENCY};

	public class Room {
		RoomType roomtype;
		//public String RoomType; // = {"STD_SINGLE", "LRG_SINGLE", "STD_DOUBLE", "LRG_DOUBLE", "STD_TRIPLE", "LRG_TRIPLE", "EFFICIENCY"};
		public Boolean livable;   //holds current state of particular room's livability status 
		public double price;  //semester cost of living for room 
		public int num;  //indicates room number 
		public int residents;
		public int currRes=0;
	/*	public void setRoomType(){
		} DATABASE*/
 
		public void setCost(Room r){
			switch(roomtype) {
				case STD_SINGLE:
					price=4593;
					residents=1;
					break; 
				case LRG_SINGLE: 
					price=4020; 
					residents=1;
					break; 
				case STD_DOUBLE:
					price=3902.83;
					residents=2;
					break;  
				case LRG_DOUBLE:	
					price=4029.34;
					residents=2;
					break;  
				case STD_TRIPLE:
					price=3928.09;
					residents=3;
					break;  
				case LRG_TRIPLE:
					price=4000.32;
					residents=3;
					break;  
				case EFFICIENCY:
					price=3709.92;
					residents=2;
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
		public void setCurrRes(int cR){
			if(residents>currRes){
				currRes+=cR;
			}
			else{
				System.out.println("The room is full");
			}
		}
		public int getCurrRes(){
			return currRes;
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
	
	public void setResident(int id){ //adds resident
		Room room = new Room();
		if(room.getCurrRes()<room.residents){
			room.setCurrRes(1);
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
