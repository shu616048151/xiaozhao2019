package speech.test2;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		int n=Integer.parseInt(str);
		System.out.println(Num(n));
	}
	public static int Num(int n){
		int[] data=new int[n+1];
		for(int i=1;i<n+1;i++){
			for(int j=1;j<=6;j++){
				//前n个状态相加
				if (i-j>=0) {
					data[i]+=data[i-j];
				}
			}
			//加上自己本身的一种方式
			data[i]+=1;
		}
		return data[n];
	}
}
