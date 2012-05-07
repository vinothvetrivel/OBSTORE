/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.myapp.struts.LoginForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vinoth
 */
public class UserService {
    
    private boolean b = false;
    OBStoreDatabase OBD = null;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
     
    public UserService()
    {
        OBD=new OBStoreDatabase();
        con=OBD.getcon();
    }
     
    public boolean Validate(LoginForm LF)
    {
        try 
        {
             
            PreparedStatement pt = (PreparedStatement) con.createStatement();
            rs = pt.executeQuery("Select * from AUTHENTICATION");
            
            while(rs.next()){
                if((LF.getUser().equals(rs.getString(1)))&&(LF.getPass().equals(rs.getString(2)))){
                    b=true;
                  }
             }
            
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        
        return b;
    }

}
