package com.palletech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deleterecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DBJEEAUG","root","Sin857@@");
			PreparedStatement pst=con.prepareStatement("DELETE FROM STUDENT WHERE STID=?");
			pst.setInt(1, 104);
			
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
