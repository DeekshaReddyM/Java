package com.clinicalmgmt.jdbc;
import java.sql.*;  

/**
 * JDBC to connect to MySql DB
 * @author ADMIN
 *
 */
public class MySqlConnection {

	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicalmgmt","root","**********");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from doctor");
			
			while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4) +
						" "+rs.getString(5) + " "+rs.getString(6));  
			con.close();  
		}catch(Exception e){ 
			System.out.println(e);
		}  

	}
}
