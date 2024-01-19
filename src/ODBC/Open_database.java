package ODBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Open_database {


	public static void main (String [] args) throws SQLException {

		Connection con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/birbitte","root","admin");
		Statement stmt =  con.createStatement();

		//String s = "alter table student add column city varchar(25)";
		String s = "SELECT * FROM student";

		ResultSet res = stmt.executeQuery(s);


		//stmt.execute(s);


		while(res.next()) {

			int a = res.getInt("id");
			String se = res.getString("name");	
			System.out.println(a + " "  +se);

		}



		con.close();




	}

}
