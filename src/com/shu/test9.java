package com.shu;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		XandY[] data=new XandY[n];
		for(int i=0;i<n;i++){
			String s=scanner.nextLine();
			String[] strings=s.split(" ");
			XandY xandY=new XandY();
			xandY.x=Integer.parseInt(strings[0]);
			xandY.y=Integer.parseInt(strings[1]);
			data[i]=xandY;
		}
		test(data);
	}
	
	public static void test(XandY[] data){
		int out=0;
		for (int i = data.length-1; i >=1; i--) {
			for(int j=i-1;j>=0;j--){
				if (data[j]!=null&&data[i]!=null) {
					if (data[i].x<=data[j].x&&data[i].y>=data[j].y) {
						data[j]=null;
						out++;
					}
				}
			}
		}
		System.out.println(out);
	}
	public static class XandY{
		public int x;
		public int y;
	}
}
