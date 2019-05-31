package speech.test3;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String out="";
		boolean f=false;
		//第一种小驼峰方式
		if (str.indexOf("_")!=-1) {
			out+=str.charAt(0);
			for(int i=1;i<str.length();i++){
				if (str.charAt(i-1)=='_') {
					char c=(char) (str.charAt(i)-32);
					out+=c;
				}else if (str.charAt(i)!='_') {
					out+=str.charAt(i);
				}
			}
		}else {
			//第er种第二个大写字母的方式
			for(int i=0;i<str.length();i++){
				if (str.charAt(i)>='A'&&str.charAt(i)<='Z'){
					char c=(char) (str.charAt(i)+32);
					out+="_"+c;
				}else {
					out+=str.charAt(i);
				}
			}
		}
		System.out.println(out);
	}
}
