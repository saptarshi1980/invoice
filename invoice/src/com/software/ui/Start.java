/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.ui;

import com.software.utility.ConnDB;
import com.software.utility.CryptoUtil;
import com.software.utility.SoftUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;


/**
 *
 * @author dpl
 */
public class Start{
    
    public static void main(String args[]){
        
        
        try {
            String id=null;
            /*try {
                id = new CryptoUtil().encrypt("ezeon8547", SoftUtil.rom());
            } catch (IOException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            //String query="select * from software where token='"+new CryptoUtil().encrypt("ezeon8547", "honululu")+"' and  id='"+id+"'";
            String query="select * from software where token='"+new CryptoUtil().encrypt("ezeon8547", "honululu")+"' ";
            Connection conn=new ConnDB().make_connection();
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            int counter=0;
            while(rs.next()){
                counter++;
            }
            
            if(counter>0){
             System.out.println(counter);
                new MainScreenUser().setVisible(true);                   
            }
            else{
                new key().setVisible(true);
            }
            
            
        } catch(SQLException ex){
          ex.printStackTrace();      
        }catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidAlgorithmParameterException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
