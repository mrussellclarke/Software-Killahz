package hip;

public class ComDir {
	
	private String name; //name of the community director
	private Dorm dorm; //name of the dorm director is assigned to
	
	ComDir(Dorm d, String n){
		setDorm(d);
		setName(n);		
	}
	
	public void setDorm(Dorm d){
		dorm = d;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	public Student[] viewRoster(){ //returns array containing name of all residents in order by room
		return dorm.getRoster();
	}
	
	public void viewOccupancy(){ //returns number of rooms available
		System.out.println(dorm.getAvailRooms() + " rooms are available in " + dorm.getName());
	}
	
	public void viewResident(int roomNum){ //returns name of resident in room
		System.out.println(dorm.getResident(roomNum) + " is the resident of room " + roomNum);
	}
	
	public void checkInResident(String name, int roomNum){ //puts resident in room roomNum
		/*if(student == checkedIn){					//pseudo that checks if resident is checked in elsewhere. checks them out of that room
			if(student.dorm != dorm){				//and checks them into desired room
				student.checkOut();
				//throw error?
			}
			else{
				dorm.setResident(name, roomNum);
				dorm.setRoomVacant(roomNum);
			}
		}
		else*/
		{
			if(dorm.getResident(roomNum) == null){
				dorm.setResident(name, roomNum);
				System.out.println(name + " is now residing in room " + roomNum);
			}
			else
				System.out.println("Room " + roomNum + " is currently occupied. " + name + " cannot move into this room.");
		}
	}
	
	public void setRoomVacant(int roomNum){ //sets room vacant
		if(dorm.getResident(roomNum) != null){
			dorm.setRoomVacant(roomNum);
			System.out.println("Room " + roomNum + " is empty and ready for check-in");
		}
		else{
			System.out.println("Room " + roomNum + " is already empty");
		}
	}
	
	public void setRoomUnacceptable(int roomNum){ //sets room unacceptable, meaning residents cannot check into it
		if(dorm.getResident(roomNum) != null){
			System.out.println("Room " + roomNum + " is currently occupied. Will be set unacceptable anyway, student evicted");
			dorm.setRoomVacant(roomNum);
			dorm.setResident("unaceptable", roomNum);
		}
		else{
			dorm.setResident("unacceptable", roomNum);
		}
		System.out.println("Room " + roomNum + " is unacceptable for habitation.");		
	}
	
	/*public void changeCheckInDeadline(Student student, Time time){ //placeholder to allow student to check ino beyond checkin deadline
		student.setCheckInDeadline(time);
	}*/

}
