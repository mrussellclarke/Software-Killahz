//package hip;

import java.util.Scanner;

/*
 * 
 * ●	Students  - Malcolm W. 
o	During registration
▪	View available rooms ONLY during registration period
▪	Choose room ONLY during registration period (updates prospective roster)
▪	Switch rooms ONLY during registration period
▪	View names of residents ONLY during registration period
o	During move in
▪	Swipe/enter ID number:
●	Check into dorm within week of classes starting (updates roster)
●	Displays student validation and residency status
▪	Approve room selection
o	During move out
▪	Swipe to complete checkout
o	Any time
▪	Make maintenance request
▪	Swipe to approve room change

 */
public class Student {
	private Dorm assignedDorm;
//	private Maintenance mRequest;
	private boolean isRegestr=true;
	private boolean isMoveIn=false;
	private boolean isMoveOut=false;
	private int validation;
	private String firstN, middleN, lastN;
	private String newline= System.getProperty("line.separator");
	Scanner in = new Scanner(System.in);
	Student()
	{
		if(isRegestr)
		{
			registraion();
		}
		if(isMoveIn)
		{
			movedIn();
		}
		if(isMoveOut)
		{
			
		}
	}
	Student(Dorm dormStay)
	{
		assignedDorm=dormStay;
	}
	
	public void registraion()
	{
		int optionChoice;
		System.out.println("1)View Rooms" + newline + "2)Reserve room" +newline+ "3)View residents");
		optionChoice = in.nextInt();
		switch (optionChoice) {
        case 1:  viewRooms();
                 break;
        case 2:  reserveRoom();
                 break;
        case 3:  viewResidents();
                 break;
		}
	}
	public void movedIn()
	{
		int optionChoice;
		System.out.println("1)Enter ID" + newline + "2)Check in To Room" +newline+ "3)Switch Rooms "+newline+ "4)Validation/Residency Status" + newline + "5)Approve Room"+ newline +"6)Checkout");
		optionChoice = in.nextInt();
		switch (optionChoice) {
        case 1:  idInput();
                 break;
        case 2:  checkInto();
                 break;
        case 3:  switchRoom();
                 break;
        case 4:  validationRes();
        		 break;
        case 5:  approveRoom();
		 		 break;
        case 6:  checkOut();
        	     break;
		}
	}
	public void checkOut()
	{
		int optionChoice;
		System.out.println("1)Checkout");
		checkOutRoom();
	}
	public void idInput()
	{
		//assignedDorm.getResident(r);
	}
	public void checkInto()
	{
		//assignedDorm.checkInto();
	}
	
	public void checkOutRoom()
	{
	//	assignedDorm.checkOut();
	}
	
	public void validationRes()
	{
	//	assignedDorm.validationRES();
	}
	public void approveRoom()
	{
	//	assignedDorm.getRoom();
	}

	public void setRegestr(boolean regestrTime)
	{
		isRegestr=regestrTime;
	}
	public void viewRooms()
	{	
			System.out.println( assignedDorm.getAvailRooms());
	}
	public void reserveRoom()
	{
		//if(isRegestr==true)
		//{
			System.out.println( assignedDorm.getAvailRooms());
			// assignedDorm.setResident(res, room);
		//}
	//	 System.out.println("Viewing availble rooms only available during regisrtation period.");
	}
	public void viewResidents()
	{
		//if(isRegestr==true)
		//{
			System.out.println( assignedDorm.getRoster());
			// assignedDorm.setResident(res, room);
		//}
	//	 System.out.println("Viewing availble rooms only available during regesrtation period.");
	}
	
	public void switchRoom()
	{
		//if(isRegestr==true)
		//{
			//System.out.println( assignedDorm.switchRoom());
			// assignedDorm.setResident(res, room);
		//}
		// System.out.println("Viewing availble rooms only available during regesrtation period.");
	}
	public boolean getRegestr()
	{
		return isRegestr;
	}
	public boolean getMovedIn()
	{
		return isMoveIn;
	}
	public boolean getMovedout()
	{
		return isMoveOut;
	}
	/*public void maintenanceR(Maintenance mRequest)
	{
		//mRequest.request("Please fix my sink");
	}*/
	
	
}
