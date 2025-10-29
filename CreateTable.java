package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//STEP-1:LOAD DRIVER
		// class is a predefined class present in  java.lang package.
		//forName method of java is used to 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// STEP-2 ESTABLISH CONNECTION
			Connection con=DriverManager.
			getConnection("jdbc:mysql://localhost:3306/DBJEEAUG","root","Sin857@@");
			//STEP-3 PREPARE SQL STATEMENT
			Statement st=con.createStatement();
			//STEP-4 EXECUTE QUERY
			int rowsEffected = st.executeUpdate(
					"CREATE TABLE STUDENT"
					+"(STID INT,"
					+ "STNAME VARCHAR(15),"
					+"COURSE VARCHAR(10)"
					+")");
			System.out.println("Table creation is successfull");
			System.out.println(rowsEffected);
			
			// STEP-5 CLOSE CONNECTIONS
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
