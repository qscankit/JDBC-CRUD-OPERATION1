package com.qsp.jdbc.noida;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDelete {
	static Connection connection;
	public static void main(String[] args) {
		
		
//		Step 1: LOAD THE DRIVER FILE
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
//			Step 2 : CREATE THE CONNECTION
			
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance-java","root","Janu#123");
		
//			Step 3 : CREATE THE STATEMENT
			
			Statement statement = connection.createStatement();
			
			String delete="delete from student where id=104";
			
//			Step 4 : EXECUTE THE QUERY
			
			statement.execute(delete);
			
			System.out.println("Data Deleted...");
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Step 5 : CLOSE THE CONNECTION
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
}
