package hip;

public class Dorm {
<<<<<<< HEAD
	
	

	/*public static class Room {
		private enum RoomType{STD_SINGLE, LRG_SINGLE, STD_DOUBLE, LRG_DOUBLE, STD_TRIPLE, LRG_TRIPLE, EFFICIENCY} 
		private static Boolean livable;   //holds current state of particular room's livability status 
		private static double price;  //semester cost of living for room 
		private static int num;  //indicates room number 
	/*	public void setRoomType(){
		} DATABASE*
		 
		public void setCost(RoomType){
=======

	public class Room {
		public enum RoomType{STD_SINGLE, LRG_SINGLE, STD_DOUBLE, LRG_DOUBLE, STD_TRIPLE, LRG_TRIPLE, EFFICIENCY} 
		public static Boolean livable;   //holds current state of particular room's livability status 
		public static double price;  //semester cost of living for room 
		public static int num;  //indicates room number 
	/*	public void setRoomType(){
		} DATABASE*/
 
		public void setCost(Dorm d){
>>>>>>> a5f664f12aaeb325d45f14037eb7d09a317b4bd0
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
<<<<<<< HEAD
			}
		}
		
		public void setLivability(Boolean l){
			livable = l; 
		} 
		public float getCost(){
=======
			} 
				
		} 
		public void setLivability(bool l){
			livable = l; 
		} 
		public float getCost(RoomType r){
>>>>>>> a5f664f12aaeb325d45f14037eb7d09a317b4bd0
			return price; 
		} 
		public Boolean isLivable(){
			return livable; 
		} 
		public int getNum(){
			return num; 
		} 
			
<<<<<<< HEAD
	}*/
	
	private static String name; //name of the dorm
	//private Student resident;  //needs to be defined 
	private static Student[] roster; //array holding the names of residents in the dorm (should be as type Student)
=======
	}
	private static String name; //name of the dorm
	private Student resident;   //student type    //needs to be defined 
	private static Student[] roster; //array holding the names of residents in the dorm
>>>>>>> a5f664f12aaeb325d45f14037eb7d09a317b4bd0
	private static int roomTotal; //number of total rooms in the dorm
	private static int availRoom; //number of available rooms in the dorm
	
	Dorm(int r, String n){
		setRoomTotal(r);
		setAvailRooms(r*9/10); //sets available rooms at 90% of total rooms
				     	//leaving space for special circumstances 
		setName(n);
	}
	
<<<<<<< HEAD
	public void setName(String n){ //sets the name of the dorm eg Slowe Hall
=======
	public void setName(String n){
>>>>>>> a5f664f12aaeb325d45f14037eb7d09a317b4bd0
		name = n;
	}
	
	public void setRoomTotal(int t){ //sets total rooms in the dorm 
		roomTotal = t;
<<<<<<< HEAD
		roster = new Student[t]; //should be student
=======
		roster = new Student[t];
>>>>>>> a5f664f12aaeb325d45f14037eb7d09a317b4bd0
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

<<<<<<< HEAD
	public Student getResident(int r){ //returns the info of the student living in the room
=======
	public Student getResident(int r){
>>>>>>> a5f664f12aaeb325d45f14037eb7d09a317b4bd0
		return roster[r];
	}
}
