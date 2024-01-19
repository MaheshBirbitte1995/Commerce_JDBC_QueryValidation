package ODBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Closed_database {

	
	String url="jdbc:mysql://127.0.0.1:3306/birbitte";
	String username="root";
	String password="admin";

	public static void main(String [] args) throws SQLException {
		
		
		
		
		
		Connection connection = DriverManager.getConnection("url", "username", "password");
        Statement  st=connection.createStatement();
        String s = "SELECT * from student" ;
        ResultSet res = st.executeQuery(s);
        
        
        while(res.next()) {
        	int a= res.getInt("id");
        	String sse = res.getString("name");
        	System.out.println(a + "  " + sse);
        	
        	
        	
        }
		
	}
	
	
}
