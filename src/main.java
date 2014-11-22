import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class main 
{
	private String newline= System.getProperty("line.separator");
	private static Scanner in = new Scanner(System.in);
	private static int inputtedID;
	private static String inputtedPW;
	private static DBConnect database=new DBConnect();
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, ParseException
	{
		
		System.out.println("Please input your student ID number(excluding the @ symbol)");
		String inputID = in.next();
		inputtedPW = in.nextLine();
		inputtedID= Integer.parseInt(inputID);
		System.out.println("Please input your student password.");
		inputtedPW = in.nextLine();
		if(database.validateLogin(inputtedID, inputtedPW))// Student Functions only available if id & password are in DB
		{
			Student student= new Student(checkRegistration(),database.movedInCheck(inputtedID),inputtedID);
			
		}
		
		//Dorm slowe = new Dorm(180, "Slowe"); //creates new dorm named Slowe with 180 rooms
		//	Dorm westTowers = new Dorm(500, "Howard Plaza Towers West"); //creates new dorm named Howard Plaza Towers West with 500 rooms
		//ComDir kHobson = new ComDir(slowe, "Kenyatta"); //SUPPOSED TO create new community director named Kenyatta who works in Slowe
		//ComDir jack = new ComDir(westTowers, "Jack");
		//Student stu= new Student();
		//String privilege = "community director";
		//if(privilege=="community director"){
		//kHobson.setDorm(slowe);
		//kHobson.viewOccupancy(); //error where bottom dorm is assigned to all comdirs, regardless of what occurs in constructor
		//jack.viewOccupancy();
	
		
	}
public static boolean checkRegistration() throws ParseException
{
	 SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	   Calendar calen = Calendar.getInstance();
	   System.out.println("Todays date: "+sdf.format(calen.getTime()));
	   String currDt = sdf.format(calen.getTime());
	   String oeStartDateStr = "08/14/";
	   String oeEndDateStr = "08/29/";
	   Calendar cal = Calendar.getInstance();
	   Integer year = cal.get(Calendar.YEAR);
	   oeStartDateStr = oeStartDateStr.concat(year.toString());
	   oeEndDateStr = oeEndDateStr.concat(year.toString());
	   java.util.Date startDate = sdf.parse(oeStartDateStr);
	   java.util.Date endDate = sdf.parse(oeEndDateStr);
	   java.util.Date currDate = sdf.parse(currDt);

  if((currDate.after(startDate) && (currDate.before(endDate))) || (currDt.equals(sdf.format(startDate)) ||currDt.equals(sdf.format(endDate)))){
      System.out.println("Date IS between the Registration Period August 14th to August 29th ...");
  }
  else{
      System.out.println("Date IS NOT between the Registration Period August 14th to August 29th...");
  }
	return false;
}
/*
 * Test output
 * 
 * 
 * Please input your student ID number(excluding the @ symbol)
23702538
Please input your student password.
hockey
Connected to the database.
Student 23702538 is in database  
Connected to the database.
Student 23702538 has not reserved any dorm to reside in
Todays date: 11/21/2014
Date IS NOT between the Registration Period August 14th to August 29th...
 */
}



