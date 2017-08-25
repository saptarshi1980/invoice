/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author saptarshi
 */
public class DateUtil {




    public  boolean checkDate()  {

        try{
                            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                            Date date1 = sdf.parse(getDate());
                            Date date2 = sdf.parse("01-10-2017");

                            System.out.println("date1 : " + sdf.format(date1));
                            System.out.println("date2 : " + sdf.format(date2));

                            if (date1.compareTo(date2) > 0) {
                                return false;
                            } else if (date1.compareTo(date2) < 0) {
                                return true;
                            } else if (date1.compareTo(date2) == 0) {
                                return true;
                            }

    
    }catch(ParseException ex){
    ex.printStackTrace();
}
   
    return false;
    }
    
    
    public  boolean checkFutureDate(String txtDate)  {

        try{
                            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                            Date date1 = sdf.parse(txtDate);
                            Date date2 = sdf.parse(getFutureDate());

                            System.out.println("date1 : " + sdf.format(date1));
                            System.out.println("date2 : " + sdf.format(date2));

                            if (date1.compareTo(date2) > 0) {
                                return false;
                            } else if (date1.compareTo(date2) < 0) {
                                return true;
                            } else if (date1.compareTo(date2) == 0) {
                                return true;
                            }

    
    }catch(ParseException ex){
    ex.printStackTrace();
}
   
    return false;
    }

        
        public String getDate(){
        
        String pattern="dd-MM-yyyy";
        SimpleDateFormat sdf=new SimpleDateFormat();
        sdf.applyPattern(pattern);
        return sdf.format(Calendar.getInstance().getTime());
        
    }
        
       public String getFutureDate(){
        GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(new java.util.Date());
        cal.add(Calendar.DATE, 10);
	cal.getTime();
        
        String pattern="dd-MM-yyyy";
        SimpleDateFormat sdf=new SimpleDateFormat();
        sdf.applyPattern(pattern);
        String date=sdf.format(cal.getTime());
        System.out.println("Future date-"+date);
        return date;
        
    }

}


