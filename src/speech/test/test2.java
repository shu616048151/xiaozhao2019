package speech.test;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=Integer.parseInt(scanner.nextLine());
		int[] x=new int[N];
		int[] y=new int[N];
		for (int i = 0; i < N; i++) {
			String str=scanner.nextLine();
			String[] strings=str.split(" ");
			x[i]=Integer.parseInt(strings[0]);
			y[i]=Integer.parseInt(strings[1]);
		}
		System.out.println(Num(x,y));
	}
	public static long Num(int[] x,int[] y){
		long count=0;
		if (x.length<3) {
			return 0;
		}
		for (int i = 0; i < y.length; i++) {
			for (int j = i+1; j < y.length; j++) {
				for (int j2 = j+1; j2 < y.length; j2++) {
					double a=Math.sqrt(Math.pow(x[i]-x[j], 2)+Math.pow(y[i]-y[j], 2));
					double b=Math.sqrt(Math.pow(x[i]-x[j2], 2)+Math.pow(y[i]-y[j2], 2));
					double c=Math.sqrt(Math.pow(x[j]-x[j2], 2)+Math.pow(y[j]-y[j2], 2));
					if ((a+b)>c&&(b+c)>a&&(a+c)>b) {
						count++;	
					}
				}
			}
		}
		return count;
	}
}
