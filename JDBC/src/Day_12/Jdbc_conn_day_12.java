package Day_12;
 
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.*;
//import packages
//load & register driver
// establish connection
//create statements
//execute query
//process result
// close connection
public class Jdbc_conn_day_12 {
 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		String url="jdbc:mysql://localhost:3306/mydata";
		String user="root";
		String password="Admin@123";
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connection created");
		//create statement
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from students");
		System.out.println("rollno\t name\t per\t age");
		System.out.println("-----------------------------");
		while(rs.next())
		{
			int rollno=rs.getInt("rollno");
			String name=rs.getString("name");
			float per=rs.getFloat("per");
			int age=rs.getInt("age");
			System.out.println(rollno+"\t "+ name+"\t "+ per+"\t "+age);

		}
		rs.close();
		stmt.close();
		con.close();
		
		
 
	}
 
}
 