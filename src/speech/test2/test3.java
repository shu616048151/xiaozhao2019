package speech.test2;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str1 = scanner.nextLine();
		String[] strings1=str1.split(" ");
		int n=Integer.parseInt(strings1[0]);
		int m=Integer.parseInt(strings1[1]);
		int[][] arr=new int[n][m];
		for (int i = 0; i < n; i++) {
			String str2=scanner.nextLine();
			String[] strings2=str2.split(" ");
			for (int j = 0; j < m; j++) {
				arr[i][j]=Integer.parseInt(strings2[j]);
			}
		}
		System.out.println(findMax(arr, n, m));
	}
	public static int findMax(int[][] arr,int n,int m){
		int[] out=new int[n*m];
		int k=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				//加上行
				for (int x = 0; x< m; x++) {
					out[k]+=arr[i][x];
				}
				//加上列
				for (int y=0; y < n; y++) {
					out[k]+=arr[y][j];
				}
				k++;
			}
		}
		Arrays.sort(out);
		return out[n*m-1];
		
	}
}
