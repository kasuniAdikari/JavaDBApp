/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadbapp;

import java.sql.Connection;
import java.sql.DriverManager;
import sun.net.www.protocol.http.HttpURLConnection;

/**
 *
 * @author Student
 */
public class DB {

    public static Connection getConnection() throws Exception{
        
       Class.forName("com.mysql.jdbc.Driver");
       Connection c;
       c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData","root",""); 
//url,use,pw
       return c;
       
       
    }
}
