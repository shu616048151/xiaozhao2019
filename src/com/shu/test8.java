package com.shu;

import java.math.BigInteger;
import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.nextLine();
		String[] strings1=s1.split(" ");
		int n=0;
		int[] data=new int[Integer.parseInt(strings1[0])];
		while(scanner.hasNext()){
			data[n]=scanner.nextInt();
			n++;
		}
		findNum(data, Integer.parseInt(strings1[1]));
	}
	public static void findNum(int[] data,int k){
		int out=0;
		for(int i=0;i<data.length;i++){
			int tempNum=0;
			for(int j=0;j<data.length;j++){
				if (Math.abs(j-i)<=data[j]) {
					tempNum++;
					if (tempNum>=k) {
						out++;
						break;
					}
				}
			}
		}
		System.out.println(out);
	}

}
