package Application;

import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		
		Date d = new Date();
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("hora 1:" + d);
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		
		
		
		System.out.println("hora 2:" + minutes);
		
		
	}

}
