package speech.test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		String s1="20110110";
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat dateFormat1=new SimpleDateFormat("yyyyMMdd");
		
		try {
			Date date=dateFormat1.parse(s1);
			System.out.println(dateFormat.format(date));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String s1="//home";
		System.out.println("/home");*/
	}
	public static String simplfiedPath(String s1){
		if (s1.lastIndexOf("/")>0) {
			s1=s1.substring(0,s1.length()-1);
		}
		return s1;
	}
}
