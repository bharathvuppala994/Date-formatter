package com.siri.wrapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate extends Date{
	
	 

	 
	 public String toString() {
		 Date date = new Date();
		 DateFormat formatter = new SimpleDateFormat("MM-dd//yyyy hh:mm:ss");
		 int i = 10;
		 Integer iObj = i;//Auto-Boxing
		 System.out.println(i);
		 Float f = iObj.floatValue();
		 System.out.println(f);
		 return formatter.format(date);
		 
		 
	 }
	 
}
