import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

class User {
	public String user_firstName;
	public String user_middleInitial;
	public String user_lastName;
	public String user_id;
	public String user_password;
	public String user_gender;
	public String user_phoneNumber;
	public String user_email;
	public String user_dorm;
	public char user_type;
	
	User(String firstName, String middleInitial, String lastName, String id, String password,
			String gender, String phoneNumber, String email, String dorm, char type) {
		user_firstName = firstName;
		user_middleInitial = middleInitial;
		user_lastName = lastName;
		user_id = id;
		user_password = password;
		user_gender = gender;
		user_phoneNumber = phoneNumber;
		user_email = email;
		user_dorm = dorm;
		user_type = type;
	}
};

public class DataConnector {
	
	private static DataConnector instance = null;
	private static String url;
	private static Properties props = new Properties();
	private static Connection conn;
	
	private static PBKDF2Hash encrypt = new PBKDF2Hash();
	
	private static User[] user;
	private static String[] availRooms;
	
	public static void main(String[] args) throws SQLException {
		
		if(instance == null) {
			instance = new DataConnector();
		}
	}
	
	public static DataConnector getInstance() {
		return instance;
	}
	
	public DataConnector() throws SQLException {
		
		try {
			Class.forName("org.postgresql.Driver");
			url = "jdbc:postgresql://ec2-54-163-249-168.compute-1.amazonaws.com:5432/d1dr07sdamhjr5";
			props.setProperty("user", "ercykylciyfqah");
			props.setProperty("password", "6zLg_SaET4gJeW-XLFXiRL7OhP");
			props.setProperty("ssl", "true");
			props.setProperty("sslfactory", "org.postgresql.ssl.NonValidatingFactory");
			conn = DriverManager.getConnection(url, props);
			System.out.println("Connected to the database.");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		String query = "SELECT COUNT(*) FROM \"Students\"";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		rs.next();
		String v = rs.getString(1);
		
		String query2 = "SELECT * FROM \"Students\"";
		Statement stmt2 = conn.createStatement();
		ResultSet rs2 = stmt2.executeQuery(query2);
		
		user = new User[Integer.parseInt(v)];
		
		for (int x = 0; x < user.length; x++) {
			if (rs2.next()) {
				String firstName = rs2.getString("FirstName");
				String middleInitial = rs2.getString("MiddleInitial");
				String lastName = rs2.getString("LastName");
				String id = rs2.getString("ID");
				String password = rs2.getString("Password").replaceAll("\\s+","");
				String gender = rs2.getString("Gender");
				String phoneNumber = rs2.getString("PhoneNumber");
				String email = rs2.getString("Email");
				String dorm = rs2.getString("Dorm");
				char type = 'S';
				user[x] = new User(firstName, middleInitial, lastName, id, password,
						gender, phoneNumber, email, dorm, type);
			}
		}
		/*
		String query4 = "SELECT COUNT(*) FROM \"Dorms\"";
		Statement stmt4 = conn.createStatement();
		ResultSet rs4 = stmt4.executeQuery(query4);
		rs4.next();
		String r = rs4.getString(1);
		
		String query3 = "SELECT * FROM \"Dorms\"";
		Statement stmt3 = conn.createStatement();
		ResultSet rs3 = stmt3.executeQuery(query3);
		
		availRooms = new String[Integer.parseInt(r)];
		
		for(int i = 0; i < availRooms.length; i++) {
			if(rs4.next()){
				//String 
			}
		}
		*/
		/*
		String query3 = "SELECT COUNT(*) FROM \"Admin\"";
		Statement stmt3 = conn.createStatement();
		ResultSet rs3 = stmt3.executeQuery(query3);
		rs3.next();
		String v2 = rs3.getString(1);
		
		String query4 = "SELECT * FROM \"Admin\"";
		Statement stmt4 = conn.createStatement();
		ResultSet rs4 = stmt4.executeQuery(query4);
		
		user = new User[Integer.parseInt(v+v2)];
		
		for (int x = v; x < user.length; x++) {
			if (rs4.next()) {
				String firstName = rs4.getString("FirstName");
				String middleInitial = rs4.getString("MiddleInitial");
				String lastName = rs4.getString("LastName");
				String id = rs4.getString("ID");
				String password = rs4.getString("Password").replaceAll("\\s+","");;
				String gender = rs4.getString("Gender");
				String phoneNumber = rs4.getString("PhoneNumber");
				String email = rs4.getString("Email");
				String dorm = rs4.getString("Dorm");
				char type = 'A';
				user[x] = new User(firstName, middleInitial, lastName, id, password,
						gender, phoneNumber, email, dorm, type);
			}
		}*/
	}
	
	public static boolean validateLogIn(String newID, String newPassword) throws NoSuchAlgorithmException, InvalidKeySpecException {
		for (int x = 0; x < user.length; x++) {
			if ((user[x].user_id.equals(newID)) && (encrypt.validatePassword(newPassword,user[x].user_password))) {
				return true;
			}
		}
		return false;
	}
	
	public static String getName(String newID) {
		String name = " ";
		for (int x = 0; x < user.length; x++) {
			if (user[x].user_id.equals(newID)) {
				name = user[x].user_firstName + " " + user[x].user_middleInitial + ". " + user[x].user_lastName + "!";
			}
		}
		return name;
	}
	
	public static String getDorm(String idNumber) {
		String dorm = " ";
		for (int x = 0; x < user.length; x++) {
			if (user[x].user_id.equals(idNumber)) {
				dorm = user[x].user_dorm;
			}
		}
		return dorm;
	}
	
	public static String[] getAvailRooms(){
		return availRooms;
	}
}