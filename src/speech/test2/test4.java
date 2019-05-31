package speech.test2;

import java.util.Arrays;
import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		String str1 = scanner.nextLine();
		String[] strings1=str1.split(" ");
		int[] data=new int[n];
		for (int i = 0; i < data.length; i++) {
			data[i]=Integer.parseInt(strings1[i]);
		}
		System.out.println(data);
	}
	public static boolean isDevide(int[] arr){
		Arrays.sort(arr);
		//前i项和
		int[] sum=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j>0; j--) {
				sum[i]+=arr[j];
			}
		}
		//判断是否可以分成
		for(int i=0;i<arr.length;i++){
			if (sum[i]*2==sum[arr.length-1]) {
				return true;
			}
		}
		return false;
	}
}
