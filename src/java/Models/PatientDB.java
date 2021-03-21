/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jayani
 */
public class PatientDB {
     public static  Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab1","root" ,"");
        return con;
    }
     public static int registerUser(Patient e){
        int x=0;
        try{
            Connection con=PatientDB.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into details(pname,pid,did,pno,type,date,time)values(?,?,?,?,?,?,?)");
            
            ps.setString(1, e.getPname());
            ps.setString(2, e.getPid());
            ps.setString(3, e.getDid());
            ps.setString(4, e.getPno());
            ps.setString(5, e.getType());
            ps.setString(6, e.getDate());
            ps.setString(7, e.getTime());
            
            x=ps.executeUpdate();
            
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return x;  
}
}
