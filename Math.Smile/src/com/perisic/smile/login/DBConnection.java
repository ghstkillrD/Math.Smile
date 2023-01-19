package com.perisic.smile.login;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

	static final String DB_URL = "jdbc:mysql://localhost:3306/csi_assignment";
    static final String USER = "root";
    static final String PASS = "";
    public static Connection connectDB(){
        Connection conn = null;
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           return conn;
        }catch(Exception ex){
           ex.printStackTrace();
            System.out.println("DB connecting error!");
            return null;
        }
    }
	
}
