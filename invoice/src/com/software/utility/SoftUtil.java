/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saptarshi
 */
public class SoftUtil {
    public static String getMAC(){

	InetAddress ip;
        StringBuilder sb = new StringBuilder();
	try {

		ip = InetAddress.getLocalHost();
		System.out.println("Current IP address : " + ip.getHostAddress());

		NetworkInterface network = NetworkInterface.getByInetAddress(ip);

		byte[] mac = network.getHardwareAddress();

		System.out.print("Current MAC address : ");

		
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
		}
		System.out.println(sb.toString());

	} catch (UnknownHostException e) {

		e.printStackTrace();

	} catch (SocketException e){

		e.printStackTrace();

	}
        return sb.toString();
        

   }
    
    public static String getCode(){
        String code=null;
        try {
            InetAddress address=InetAddress.getLocalHost();
            NetworkInterface nwi=NetworkInterface.getByInetAddress(address);
            byte mac[]=nwi.getHardwareAddress();
            
            System.out.println();
            
        } catch (SocketException ex) {
            Logger.getLogger(SoftUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(SoftUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public static String rom() throws IOException{
        
       String s = null;
        try{
            
            Process proc=Runtime.getRuntime().exec("wmic bios get serialnumber");


        

BufferedReader stdInput = new BufferedReader(new 
     InputStreamReader(proc.getInputStream()));

BufferedReader stdError = new BufferedReader(new 
     InputStreamReader(proc.getErrorStream()));

// read the output from the command
System.out.println("Here is the standard output of the command:\n");

while ((s = stdInput.readLine()) != null) {
    System.out.println(s);
}

// read any errors from the attempted command
System.out.println("Here is the standard error of the command (if any):\n");
while ((s = stdError.readLine()) != null) {
    System.out.println(s);
}
        }catch(IOException ex){
            ex.printStackTrace();
        }

return s;

    }
    
}
