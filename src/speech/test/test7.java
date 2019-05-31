package speech.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test7 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] strings=str.split(" ");
		out(strings);
	}
	public static void out(String[] strings){
		Arrays.sort(strings);
		for (int i = 0; i < strings.length; i++) {
			String s1=strings[i];
			String print="";
			for(int j=0;j<s1.length()/2-1;j++){
				print+="    ";
			}
			print=print+s1;
			System.out.println(print);
		}
	}
}

