import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.sql.*;

public class DBConnect {
private DBConnect StudentDB;
private static String url;
private static Properties props = new Properties();
private static Connection conn;
private PBKDF2Hash encrypt=new PBKDF2Hash();

	public DBConnect() 
	{
	}

public Connection getConnection()
{
	  String url;
	  Properties props = new Properties();
	  Connection conn;
	try {
		Class.forName("org.postgresql.Driver");
		url = "jdbc:postgresql://ec2-54-204-35-114.compute-1.amazonaws.com:5432/dd36oakd0m51g7";
		props.setProperty("user", "oohjrgtbdtewxn");
		props.setProperty("password", "vqoOCbl0YsR-npiIhSuLF8Jx2k");
		props.setProperty("ssl", "true");
		props.setProperty("sslfactory", "org.postgresql.ssl.NonValidatingFactory");
		conn = DriverManager.getConnection(url, props);
		System.out.println("Connected to the database.");
		return conn;
	}
	catch (Exception e) 
	{
		System.out.println(e);
	}
	return null;
	
}

public boolean validateLogin(int idNumber, String password) throws SQLException, NoSuchAlgorithmException, InvalidKeySpecException
{
	Connection conn;
	conn = getConnection();
	String queryCheck = "SELECT id,password from student WHERE id = ?";
    PreparedStatement st = conn.prepareStatement(queryCheck);
    st.setInt(1, idNumber);
    ResultSet rs = st.executeQuery();
    while ( rs.next() ) 
    {
     int id = rs.getInt("id");
     String dataBasePw=  rs.getString("password").replaceAll("\\s+","");
		  	if(idNumber==id&&encrypt.validatePassword(password,dataBasePw))
		  	{	
		 	 	System.out.println("Student "+id+" is in database "+ " ");
		 	 	return true;
		  	}
		  else 
			  System.out.println("This id and password combination is not in database. Please try again ");
     }
    conn.close();
    rs.close();
    st.close();
    return false;
}

public Student retrieveStudent(int id) throws SQLException, ClassNotFoundException
{
	Student student = new Student();
	Connection conn;
	conn = getConnection();
	String queryCheck = "SELECT firstname,middleintial,lastname,id,gender,phonenumber,email from student WHERE id = ?";
    PreparedStatement st = conn.prepareStatement(queryCheck);
    st.setInt(1, id);
    ResultSet rs = st.executeQuery();
    while ( rs.next() ) 
    {
    	String fName= rs.getString("firstname");
    	String mInitial= rs.getString("middleintial");
    	String lName= rs.getString("lastname");
        int studentId = rs.getInt("id");
    	String gender= rs.getString("gender");
    	String phoneN= rs.getString("phonenumber");
    	String email= rs.getString("email");
    }
    conn.close();
    rs.close();
    st.close();
	return null;
}

public Student getDorm(int id) throws SQLException, ClassNotFoundException
{
	Student student = new Student();
	Connection conn;
	conn = getConnection();
	String queryCheck = "SELECT dorm from student WHERE id = ?";
    PreparedStatement st = conn.prepareStatement(queryCheck);
    st.setInt(1, id);
    ResultSet rs = st.executeQuery();
    while ( rs.next() ) 
    {
    	String dorm= rs.getString("dorm");
    }
    conn.close();
    rs.close();
    st.close();
	return null;
}

public boolean movedInCheck(int id) throws SQLException, ClassNotFoundException
{
	Student student = new Student();
	Connection conn;
	conn = getConnection();
	String queryCheck = "SELECT dorm from student WHERE id = ?";
    PreparedStatement st = conn.prepareStatement(queryCheck);
    st.setInt(1, id);
    ResultSet rs = st.executeQuery();
    while ( rs.next() ) 
    {
    	String dorm= rs.getString("dorm");
    	if (dorm != null && !dorm.isEmpty()) {
    		System.out.println("Student "+ id + " has not reserved any dorm to reside in");
    		return false;
    		}
    }
    conn.close();
    rs.close();
    st.close();
	return false;
}



}