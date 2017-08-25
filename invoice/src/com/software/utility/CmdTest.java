/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.utility;

/**
 *
 * @author saptarshi
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CmdTest {
    public static void main(String[] args) {
        try {
            Process p = Runtime.getRuntime().exec("getmac /fo csv /nh");
        java.io.BufferedReader in = new java.io.BufferedReader(new  java.io.InputStreamReader(p.getInputStream()));
        String line;
        line = in.readLine();        
        String[] result = line.split(",");

        System.out.println(result[0].replace('"', ' ').trim());
        } catch (IOException ex) {
            Logger.getLogger(CmdTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
