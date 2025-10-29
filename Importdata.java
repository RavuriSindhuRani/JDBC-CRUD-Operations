package com.palletech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Importdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DBJEEAUG","root","Sin857@@");
			PreparedStatement pst=con.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?)");
			pst.setInt(1,103);
			pst.setString(2,"EFCODD");
			pst.setString(3,"RDBMS");
			int rowsEffected=pst.executeUpdate();
			System.out.println(rowsEffected);
			pst.close();
			con.close();
		}
		 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			

	}

}
