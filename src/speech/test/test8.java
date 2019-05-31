package speech.test;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

import javax.print.StreamPrintService;

public class test8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] strings=str.split(" ");
		isRepeat(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
	}
	public static void isRepeat(int a,int b){
		String s1="";
		//为整数
		if (a%b==0) {
			System.out.println(a/b);
		}
		if (a%b!=0) {
			double x=a;
			double y=b;
			System.out.println(x/y);
		}
		
		
		
		System.out.println(s1);
	}

}
