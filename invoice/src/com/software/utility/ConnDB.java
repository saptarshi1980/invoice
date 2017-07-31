/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.utility;

/**
 *
 * @author dpl 1
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Accounts
 */
public class ConnDB {
        
              

public Connection make_connection(){
         Connection conn = null;

 
        try
           {
              
               String userName = "root";
               String password = "mahalaxmi123";
               String url="jdbc:mysql://localhost/invoice";
               Class.forName ("com.mysql.jdbc.Driver").newInstance ();
               conn = DriverManager.getConnection (url, userName, password);
                                   
           
           }catch (SQLException e)
           {
              e.printStackTrace();
           }
           catch (Exception e)
           {

               e.printStackTrace();
           }
           return conn;
        }


}


