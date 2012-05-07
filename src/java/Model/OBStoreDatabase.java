/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


/**
 *
 * @author vinoth
 */
public class OBStoreDatabase {
    
    public Connection getcon(){
        
        Connection con = null;
        try{
            DataSource ds = getOBDatabase();
            con = ds.getConnection();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return con;
    }

    private DataSource getOBDatabase() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("java:comp/env/OBDatabase");
    }
    
    
}
