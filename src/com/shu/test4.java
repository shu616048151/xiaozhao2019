package com.shu;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] strings=str.split(" ");
		int n=Integer.parseInt(strings[0]);
		String out="";
		if (n>0){
		for (int i = 0; i < n; i++) {
			out+=strings[1];
		}
		}
		System.out.println(out);
	}
}
