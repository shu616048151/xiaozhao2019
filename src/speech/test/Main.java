package speech.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] strings=str.split(",");
		//处理最后一个数
		String str1=strings[strings.length-1];
		new HashSet<>();
		String[] strings2=str1.split(" ");
		strings[strings.length-1]=strings2[0];
		int Num=Integer.parseInt(strings2[1]);
		int minNum=Integer.MIN_VALUE;
		for(int i=0;i<strings.length;i++){
			int x=Integer.parseInt(strings[i]);
			if (x<Num) {
				minNum=x;
			}
		}
		System.out.println(minNum);
		
	}
}
