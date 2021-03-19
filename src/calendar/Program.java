package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		 Scanner sc= new Scanner(System.in);
		 
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
         Date data = new Date();
         
         Date data2= sdf.parse("15/02/2000 16:41:23");
         
         System.out.println(sdf.format(data2));
         System.out.println(data);
     
         Calendar cal= Calendar.getInstance();
         cal.setTime(data);
         cal.add(Calendar.MONTH, 1);
         data= cal.getTime();
         
         System.out.println(sdf.format(data));
         System.out.println(data);
	}

}
