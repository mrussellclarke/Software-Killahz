import java.sql.Connection;
import java.sql.DriverManager;
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
	
	User(String firstName, String middleInitial, String lastName, String id, String password,
			String gender, String phoneNumber, String email, String dorm) {
		user_firstName = firstName;
		user_middleInitial = middleInitial;
		user_lastName = lastName;
		user_id = id;
		user_password = password;
		user_gender = gender;
		user_phoneNumber = phoneNumber;
		user_email = email;
		user_dorm = dorm;
	}
};

public class DataConnector {
	
	private static DataConnector instance = null;
	private static String url;
	private static Properties props = new Properties();
	private static Connection conn;
	
	private static User[] user;
	
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
				String password = rs2.getString("Password");
				String gender = rs2.getString("Gender");
				String phoneNumber = rs2.getString("PhoneNumber");
				String email = rs2.getString("Email");
				String dorm = rs2.getString("Dorm");
				user[x] = new User(firstName, middleInitial, lastName, id, password,
						gender, phoneNumber, email, dorm);
			}
		}
	}
	
	public static boolean validateLogIn(String newID, String newPassword) {
		for (int x = 0; x < user.length; x++) {
			if ((user[x].user_id.equals(newID)) && (user[x].user_password.equals(newPassword))) {
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
}