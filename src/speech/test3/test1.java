package speech.test3;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] strings=str.split(" ");
		String out="";
		for (int i = strings.length-1; i >=0; i--) {
				if (i==0) {
					out+=strings[i];
				}else {
					out+=strings[i]+" ";
				}
			
		}
		System.out.println(out);
	}
}
