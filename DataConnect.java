package hip;
 
import java.util.*;
import java.sql.*;
 
public class DataConnect{
     
    public String Data(int num){
        String data = "Student";
        int idnum = 0;
         
        try{
            Class.forName("org.postgresql.Driver");
             
            String url = "jbdc:postgresql://ec2-54-163-249-168.compute-1.amazonaws.com:5432/d1dr07sdamhjr";
             
            Properties props = new Properties();
            props.setProperty("user", "");
            props.setProperty("password", "");
            props.setProperty("ssl", "true");
            props.setProperty("sslfactory", "org.postgresql.ssl.NonValidatingFactoty");
             
            Connection conn = DriverManager.getConnection(url,props);
             
            String query = "SELECT * FROM \"" + data + "\" WHERE \"" + idnum + "\" = " + num;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
             
            while(rs.next()){
                String response = rs.getString("Info");
                return response;
            }
             
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
         
        return null;
    }
     
}
