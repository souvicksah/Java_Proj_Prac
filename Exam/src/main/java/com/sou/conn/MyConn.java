package com.sou.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {
   private Connection myconn;
   public Connection getconn(){
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java","root","Baba@2022");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return myconn;
   }
   
}
