/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taximanagement;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author MAHE
 */
public class JavaConnectDB {
    public static Connection ConnecrDb() {
        try {
              Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","planetV26");
              return con;
            }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
                          }
         return null;   
        }
}
