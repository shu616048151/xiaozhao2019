package speech.test;

import java.util.Scanner;

public class test9 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String[] strings=str.split(",");
		int[] data=new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			data[i]=Integer.parseInt(strings[i]);
		}
		System.out.println(minComsume(data));
	}
	public static int minComsume(int[] arr){
		//动态规划算法，从n-1到n状态,有两条路径，n-1和n-2
		int min=0;
		int[] comsume=new int[arr.length+1];
		//只有一个台阶，0消耗
		comsume[0]=0;
		//只有两个台阶，0消耗，可以直接过去
		comsume[1]=0;
		for (int i = 2; i < arr.length+1; i++) {
			comsume[i]=Math.min(comsume[i-1]+arr[i-1], comsume[i-2]+arr[i-2]);
		}
		return comsume[arr.length];
	}
	
}
