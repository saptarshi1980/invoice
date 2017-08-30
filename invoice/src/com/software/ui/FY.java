/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.ui;

/**
 *
 * @author saptarshi
 */
import java.util.Calendar;

/**
 *
 * @author dpl
 */
public class FY {
    
    public String getFY(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String fromDate=null,toDate=null;
        String fy=null;
        
        if (month < 4) {

            fromDate="01-04-" + (year - 1);
            toDate="31-03-"+ year;
            System.out.println((year - 1)+"-"+(year-2000));
            fy=(year - 1)+"-"+(year-2000);
            return fy;


        } else {

            fromDate="01-04-" + (year);
            toDate="31-03-"+ (year+1);
            System.out.println(year+"-"+(year+1-2000));
            fy=year+"-"+(year+1-2000);
            return fy;

        }

    }
    
}

