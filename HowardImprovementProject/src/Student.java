import java.util.Scanner;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.sql.*;
public class Student{
	 public static void main(String[] args) throws SQLException 
	 {      
	 }
	 
	private Dorm selectedDorm;
	private boolean isRegestr=true;
	private boolean isMoveIn=false;
	private String firstN, middleN, lastN,phoneN,email;
	private char gender;
	private String newline= System.getProperty("line.separator");
	Scanner in = new Scanner(System.in);
	
	Student() throws SQLException, ClassNotFoundException
	{
	}
	
	Student(boolean registration, boolean movedIn,int id)
	{
		isRegestr=registration;
		isMoveIn=movedIn;
		if(registration)
		{
			registraion();
		}	
		if(registration&&movedIn)
		{
			registraion();
			movedIn();
		}
		if(movedIn)
		{
			movedIn();
		}
	}

public void registraion()
	{
	// This function requires the Dorm Db and db querying functions to be made.
		int optionChoice;
		int love = selectedDorm.getAvailRooms();
		System.out.println("1)View Available Rooms" + newline + "2)Reserve room" + newline + "4) Switch Room") ;
		optionChoice = in.nextInt();
		switch (optionChoice) {
        case 1:  viewRooms();
                 break;
        case 2:  reserveRoom();
                 break;
      //  case 3:  viewResidents();
               //  break;
                 
                 // Make dorm selection first option them room selection
    }
	}

	public void movedIn()
	{
		int optionChoice;
		System.out.println("1)Enter ID" + newline + "2)Check in To Room" +newline+ "3)Switch Rooms "+newline+ "4)Validation/Residency Status" + newline + "5)Approve Room"+ newline +"6)Checkout");
		optionChoice = in.nextInt();
		switch (optionChoice) {
      //  case 1:  idInput();
        //         break;
        case 2:  checkInto();
                 break;
        case 3:  switchRoom();
                 break;
        case 4:  validationRes();
        		 break;
        case 5:  approveRoom();
		 		 break;
       // case 6:  checkOut();
        	    // break;
		}
	}
	
	public void checkInto()
	{
		// need dorm DB to be made in order to add check-in status for the specified room
	}
	
	public void checkOutRoom()
	{
	 // need dorm DB to be made in order to remove id from dorm roster and name of dorm from student DB
	}
	
	public void validationRes()
	{
	// Validation seems to be a function for the group working on the Bison Web registration. Ask Ms.Williams
	}
	public void approveRoom()
	{
	//	need to see the structure of the Dorm DB and what querying functions are made so I can confirm the room and add id to dorm roster and name of dorm to the student DB
	
	}

	
	public void viewRooms()
	{	
		//requires DORM DATABSE to be made
	}
	
	public void reserveRoom()
	{
		//requires DORM DATABSE to be made
	}

	public void switchRoom()
	{   
		//requires DORM DATABSE to be made
	}


	public void maintenanceR(Maintenance mRequest)
	{
		//mRequest.request("Please fix my sink");
	}
	
	
	}
