package speech.test2;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str1 = scanner.nextLine();
		String[] strings1=str1.split(",");
		int[] data=new int[strings1.length];
		for (int i = 0; i < data.length; i++) {
			data[i]=Integer.parseInt(strings1[i]);
		}
		int[] out=findMax(data);
		for(int i=0;i<out.length;i++){
			System.out.print(out[i]+" ");
		}
	}
	public static int[] findMax(int[] arr){
		int max=0;
		int[] out=new int[4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				for(int m=j+1;m<arr.length;m++){
					for(int n=m+1;n<arr.length;n++){
						int temp=0;
						if (arr[n]>arr[m]) {
							temp=arr[n]-arr[m];
						}
						temp=temp+arr[j]-arr[i];
						if (temp>max) {
							max=temp;
							out[0]=i+1;
							out[1]=j+1;
							out[2]=m+1;
							out[3]=n+1;
						}
					}
				}
			}
		}
		return out;
	}
}
